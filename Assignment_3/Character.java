import java.math.*;
public class Character {
    
    private int health; //the amount of hitpoints the character has
    private int defence; //the amount of defence the character has (reduces damage taken)
    private int speed; //how fast the character is both at moving and attacking
    private float dodgeChance; //how likely the character is to dodge an attack, between 0.0 and 1.0
    private float hitChance;//how likely the character is to land an attack, between 0.0 and 1.0
    private int baseDamage; //the base damage that the character can deal
    private float luck; // a luck factor that affects the other probabilistic events (attack, dodge, etc)
    private int level; // the overall power level of the character
    private float standing; // the character's standing with their deity, between 0 and 1

    private String name; //name to identify the character
    private int birthMonth; //month and year of birth to determine the deity of the character
    private int birthYear; 
    private String deity; //the deity that the character prays to
    private float intrinsic; //a random float between 0 and 1 to determine non-essential attributes of the sub-classes, 
    
    private final String[] prefix = {"God", "Goddess", "Spirit", "Devil"}; //prefixes for the deity
    private final String[] suffix = {"Combat", "Healing", "Speed", "Luck", "Blood", "Defence", "Chaos", "Intellect", "Precision", "Bewitchment", "Magic", "Life"}; //suffixes for the deity
    
    public Character(String n, int bm, int by) { //creates a RANDOM character 
        name = n;
        birthMonth = bm;
        birthYear = by;
        deity = prefix[birthYear%4] + " of " + suffix[bm-1]; //The deity system determines what effect the character will get upon praying 
        // it also determines what actions the character needs to do to increase their standing (if any at all)

        //set default values
        health = 100;
        defence = 50;
        speed = 5;
        dodgeChance = 0.05f;
        hitChance = 0.5f;
        baseDamage = 10;
        luck = 0.1f;
        level = 1;
        standing = 0;

        // set intrinsic
        intrinsic = (float)Math.random();
    }

    public Character(String n, int bm, int by, float i) { //constructor for a SEEDED character (to recreate a character)
        name = n;
        birthMonth = bm;
        birthYear = by;
        deity = prefix[birthYear%4] + " of " + suffix[bm-1];

        //set default values
        health = 100;
        defence = 50;
        speed = 5;
        dodgeChance = 0.05f;
        hitChance = 0.5f;
        baseDamage = 10;
        luck = 0.1f;
        level = 1;
        standing = 0;

        // set intrinsic
        intrinsic = i;
    }

    public int move(int distance) {
        int timeTaken = distance/speed;
        return timeTaken;
    }

    public int levelUp() {
        health += (int)(8*Math.sqrt(level));
        defence += (int)(6*Math.sqrt(level));
        baseDamage += (int)(2*Math.sqrt(level));
        speed += 3;
        dodgeChance += 0.1;
        level += 1;
        standing += 0.1;
        return level;
    }

    public int attack() {
        if(Math.random()<= hitChance) {
            return (int)(baseDamage * Math.random()+luck+speed/100);
        }
        return -1;
    }

    public int takeDamage(int dmg) {
        if(Math.random()<=dodgeChance+luck)  {
            return -1;
        } else {
            int taken = (int)(dmg-defence/10);
            health -= taken;
            return taken;
        }
    }

    public boolean pray() { //currently, praying only increases luck, but I plan to expand this in the final project
        standing -= 0.1;
        if(Math.random()<= standing) {
            luck += 0.2;
            return true;
        }
        return false;
    }

    public int getHealth() {
        return health;
    }

    public int getDefence() {
        return defence;
    }

    public int getSpeed() {
        return speed;
    }

    public float getDodgeChance() {
        return dodgeChance;
    }

    public float getHitChance() {
        return hitChance;
    }

    public int getBaseDamage() {
        return baseDamage;
    }

    public float getLuck() {
        return luck;
    }

    public int getLevel() {
        return level;
    }

    public float getIntrinsic() {
        return intrinsic;
    }

    public void setIntrinsic(float f) {
        intrinsic = f;
    }

    public String getName() {
        return name;
    }

    public String getBirthData() { //the programmer can use String.split method to seperate the month and year
        return birthMonth + " " + birthYear;  
    }


    public String getDeity() { //this method is technically redundant since the deity is completely deterministic based on the month and date of birth, however, will stay for ease of use.
        return deity; 
    }

}
