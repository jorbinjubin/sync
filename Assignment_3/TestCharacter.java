import java.util.Scanner;

public class TestCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.next();
        System.out.println("Welcome to Shaman Simulation");
        wait(500);
        System.out.println();
        System.out.print("Prepare for character creation");
        for(int i = 0; i < 3; i++) {
            wait(150);
            System.out.print(".");
        }
        System.out.println();
        wait(1000);
        System.out.println("Creating new character");

        System.out.print("Enter Name: ");
        String name = sc.next();
        System.out.print("Enter Birth Month: ");
        int birthMonth = sc.nextInt();
        System.out.print("Enter Birth Year:  ");
        int birthYear = sc.nextInt();
        System.out.print("Enter Magic Type:  ");
        String magicType = sc.next();
        System.out.print("Would you like to enter an Intrinsic? [y/N]: ");
        String temp = sc.next();
        float intrinsic = -1.0f;
        if(temp.toLowerCase().equals("y")) {
            System.out.print("Enter Intrinsic: ");
            intrinsic = sc.nextFloat();
        }

        wait(200);
        System.out.print("Character Information Gathering Complete, creating character");
        for(int i = 0; i < 3; i++) {
            wait(150);
            System.out.print(".");
        }
        System.out.println();
        Shaman plr;
        if(intrinsic != 0.1) {
            plr = new Shaman(name, birthMonth, birthYear, magicType, intrinsic);
        } else {
            plr = new Shaman(name, birthMonth, birthYear, magicType);
        }

        // Begin Testing Class
        String[] birthData = plr.getBirthData().split(" ");
        System.out.println("On month " +  birthData[0] + " of year " + birthData[1] + ", a new " + plr.getMagicType() + " Shaman is born.");
        wait(1000);
        System.out.println("They pray to the " +  plr.getDeity() +".");
        wait(1000);
        System.out.println("They wield a " + plr.getWeaponCondition() + " " + plr.getWeaponType() + " wearing a " + plr.getRobeColor() + " robe in " + plr.getRobeCondition() + " condition.");
        wait(1000);
        System.out.print("They go by");
        for(int i = 0; i < 3; i++) {
            wait(150);
            System.out.print(".");
        }
        System.out.print(" " + plr.getName() + ". ");
        System.out.println();
        System.out.println(plr.getName() + " gets to work early training.");
        System.out.println("They attempt to attack a target dummy, using 10 mana.");
        int dmg = plr.attack();
        wait(750);
        System.out.print("Due to their hit chance of " + plr.getHitChance() + ", they ");
        if(dmg > 0) {
            System.out.print("hit their attack and deal " + dmg + " damage.");
        } else System.out.print("miss their attack and deal 0 damage.");

        System.out.println("They now have " + plr.getMana() + " out of " + plr.getMaxMana() + " mana.");
        wait(500);

        System.out.println("Next, they learn to dodge attacks. They encounter a wild zombie and engage in combat.");
        System.out.println("The zombie attacks for 10 damage.");
        System.out.print("Due to their dodge chance of " + plr.getDodgeChance() + ", they ");
        int dmgTaken = plr.takeDamage(10);
        if(dmgTaken < 0) {
            System.out.println("successfully dodge the attack, taking 0 damage.");
        } else {
            System.out.println("fail to dodge the attack and take " + dmgTaken + " damage, reducing their health to " + plr.getHealth()+ ".");
        }
        wait(750);
        System.out.println("Instead of killing the zombie outright, " + plr.getName() + " decides to reanimate it, using his shaman powers.");
        plr.reanimate("Zombie");
        wait(500);
        System.out.println("They also find a ghost to reanimate.");
        plr.reanimate("Ghost");
        wait(300);
        System.out.println(plr.getName() + " now has the following creature(s) on their side: ");
        for(String s : plr.getCreatures()) {
            if(s != null && s != "") {
                System.out.println(s);
            }
        }
        System.out.println("They now deanimate the zombie, leaving the following creature(s):");
        for(String s : plr.getCreatures()) {
            if(s != null && s != "") {
                System.out.println(s);
            }
        }
        wait(750);
        System.out.println("They then return home (5km away), taking " + plr.move(5) + " hour(s).");
        wait(750);
        System.out.println(plr.getName() + " then learns a new spell - " + plr.getDeity() + "\'s delight. ");
        wait(750);
        plr.gainSpell(plr.getDeity() + "\'s delight");
        System.out.println("They then rest for 8 hours.");
        plr.rest(8);
        wait(2000);
        System.out.println("They have " + plr.getHealth() + " out of " + plr.getMaxHealth() + " health and " + plr.getMana() + " out of " + plr.getMaxMana() + " mana.");
        wait(500);
        System.out.println("They are also able to level up from " + plr.getLevel() + " to level " + plr.levelUp());
        wait(750);
        System.out.println("Their stats are as follows:");
        System.out.println();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Name: " + plr.getName());
        System.out.println("Level: " + plr.getLevel());
        System.out.println("Base Damage: " + plr.getBaseDamage());
        System.out.println("Max Health: " + plr.getMaxHealth());
        System.out.println("Defence: " + plr.getDefence());
        System.out.println("Speed: " + plr.getSpeed());
        System.out.println("Hit Chance: " + plr.getHitChance());
        System.out.println("Dodge Chance: " + plr.getDodgeChance());
        System.out.println("Standing: " + plr.getStanding());
        System.out.println("Intrinsic: " + plr.getIntrinsic());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        wait(750);
        System.out.println();
        System.out.println("Since they leveled up, their standing with their deity has increased. They pray for good luck and a mana ring.");
        boolean cont = plr.pray();
        while(!cont) {
                cont = plr.pray();
                System.out.println("Their prayers are ignored...");
                System.out.println("They pray again.");
                System.out.println();
                wait(300);
        }
        System.out.println(plr.getName() + "\'s prayers are answered. Their luck is now " + plr.getLuck() + ".");
        wait(500);
        System.out.println();
        System.out.println("A blinding light comes down from above and a mana ring appears in their hands.");
        plr.equipManaRing();
        wait(750);
        System.out.println();
        System.out.println("A zombie sneaks up on " + plr.getName() + ". A battle ensues.");
        
        dmg = plr.attack();
        wait(750);
        System.out.println();
        System.out.print("Due to their hit chance of " + plr.getHitChance() + ", they ");
        if(dmg > 0) {
            System.out.print("hit their attack and deal " + dmg + " damage.");
        } else System.out.print("miss their attack and deal 0 damage.");
        wait(750);
        System.out.println();
        System.out.println(" They attack once more to try and kill the zombie.");
        System.out.print("Due to their hit chance of " + plr.getHitChance() + ", they ");
        if(dmg > 0) {
            System.out.print("hit their attack and deal " + dmg + " damage.");
        } else {
            System.out.print("miss their attack and deal 0 damage.");
            System.out.println(" However, in an event of divine intervention, the " + plr.getDeity() + " smites the zombie from above.");
        }
        wait(750);
        System.out.println();

        System.out.print("Currently, their mana ring is ");
        if(plr.isManaRingEquipped()) System.out.println("equipped");
        else System.out.println("not equipped.");
        wait(750);
        System.out.println();
        System.out.println("The zombie drops a mysterious scroll and a mana flower.");
        wait(500);
        System.out.println();
        System.out.println(plr.getName() + " decides to read the scroll and learns a new spell, amnesia.");
        wait(500);
        System.out.println();
        plr.gainSpell("Amnesia");
        System.out.println("They now know the following spells: ");
        for(String s : plr.getSpells()) {
            if(s != null && s != "") {
                System.out.println(s);
            }
        }

        System.out.println("They cast the Amnesia spell out of curiosity. ");
        wait(1000);
        System.out.println();
        plr.removeSpell(plr.getDeity() + "\'s delight");
        System.out.println("They now know the following spells: ");
        for(String s : plr.getSpells()) {
            if(s != null && s != "") {
                System.out.println(s);
            }
        }
        System.out.println("They also drop the mana ring out of surprise.");
        wait(500);
        System.out.println();
        plr.removeManaRing();
        System.out.println("They instead equip the mana flower.");
        wait(500);
        System.out.println();
        plr.equipManaFlower();
        System.out.println("They rest for 1 hour.");
        wait(1500);
        System.out.println();
        plr.rest(1);
        System.out.println("They quoff a medium potion.");
        wait(500);
        System.out.println();
        plr.quoffPotion(2);
        System.out.println("They now have " + plr.getMana() + " out of " + plr.getMaxMana() + " mana.");
        wait(500);
        
        System.out.println("They remove the mana flower due to the amnesia spell.");
        plr.removeManaFlower();
        wait(500);
        System.out.println();

        System.out.print("Currently, their mana flower is ");
        if(plr.isManaFlowerEquipped()) System.out.println("equipped");
        else System.out.println("not equipped.");
        System.out.println("\n\n");
        System.out.println("Program end.");

    }
    private static void wait(int ms) {
        try {
            Thread.sleep(ms);
            //Thread.sleep(1);
        } catch(Exception e) {}
    }
}
