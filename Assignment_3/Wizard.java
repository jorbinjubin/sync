public class Wizard extends Character {
    private String weaponType;
    private String mType;
    private int mana;
    private int manaRegenRate;
    private String color;
    private int maxMana;
    private String[] spells = new String[3];
    public Wizard(String n, int bm, int by, String mType) { //random wizard
        super(n, bm, by);

        //set weapon based on intrinsic
        if(getIntrinsic() > 0.7) weaponType = "Wand";
        else if(getIntrinsic() > 0.4) weaponType = "Staff";
        else if(getIntrinsic() > 0.1) weaponType = "Tome";
        else weaponType = "Crystal";

        //set robe color based on intrinsic
        if(getIntrinsic() > 0.7) weaponType = "Red";
        else if(getIntrinsic() > 0.4) weaponType = "Blue";
        else if(getIntrinsic() > 0.1) weaponType = "Purple";
        else weaponType = "Gold";

        //set magic type 
        this.mType = mType;
        mana = 100;
        maxMana = 100;
    }

    public Wizard(String n, int bm, int by, String mType, float i) { //seeded wizard
        super(n, bm, by, i);
        setIntrinsic(i);

        //set weapon based on intrinsic
        if(getIntrinsic() > 0.7) weaponType = "Wand";
        else if(getIntrinsic() > 0.4) weaponType = "Staff";
        else if(getIntrinsic() > 0.1) weaponType = "Tome";
        else weaponType = "Crystal";

        //set robe color based on intrinsic
        if(getIntrinsic() > 0.7) weaponType = "Red";
        else if(getIntrinsic() > 0.4) weaponType = "Blue";
        else if(getIntrinsic() > 0.1) weaponType = "Purple";
        else weaponType = "Gold";

        //set magic type 
        this.mType = mType;
    }

    private void regenMana() {
        if(mana + manaRegenRate < 100) mana += manaRegenRate;
        else mana = 100;
    }

    public int attack() {
        mana -= 10;
        return super.attack();
    }

    public int move(int d) {
        regenMana();
        return super.move(d);
    }

    public int quoffPotion(int size) {
        if(size == 1) {
            mana += 10;
            return 10;
        } else if (size == 2) {
            mana += 20;
            return 20;
        } else if(size == 3) {
            mana += 30;
            return 30;
        }
        return 0;
    }


}