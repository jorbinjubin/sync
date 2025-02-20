public class Wizard extends Character {
    private String weaponType;
    private String mType;
    private int mana;
    private int manaRegenRate;
    private String color;
    
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
    public int cast() {
        mana -= 10;
        return attack();
        
    }
}