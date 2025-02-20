public class Shaman extends Character {

    private String weaponType; //immutable attributes
    private String mType;
    private String robeColor;
    private String robeCondition;
    private String weaponCondition;

    private int mana; //mutable attributes
    private int manaRegenRate;
    private int maxMana;
    private boolean manaFlowerEquipped;
    private boolean manaRingEquipped;
    private String[] spells = new String[3];
    private String[] creatures = new String[5];

    public Shaman(String n, int bm, int by, String mType) { //random shaman
        super(n, bm, by);

        //set weapon based on intrinsic
        if(getIntrinsic() > 0.7) weaponType = "Wand";
        else if(getIntrinsic() > 0.4) weaponType = "Staff";
        else if(getIntrinsic() > 0.1) weaponType = "Tome";
        else weaponType = "Crystal";

        //set robe color based on intrinsic
        if(getIntrinsic() > 0.7) robeColor = "Red";
        else if(getIntrinsic() > 0.4) robeColor = "Blue";
        else if(getIntrinsic() > 0.1) robeColor = "Purple";
        else robeColor = "Gold";

        //set robe condition based on intrinsic
        if(getIntrinsic() > 0.7) robeCondition = "Ragged";
        else if(getIntrinsic() > 0.3) robeCondition = "Fair";
        else robeCondition = "Excellent";

        //set weapon condition based on intrinsic
        if(getIntrinsic() > 0.7) weaponCondition = "Shattered";
        else if(getIntrinsic() > 0.3) weaponCondition = "Cracked";
        else weaponCondition = "Pristine";

        //set magic type 
        this.mType = mType;
        mana = 100;
        maxMana = 100;

        manaRingEquipped = false;
        manaFlowerEquipped = false;

    
    }

    public Shaman(String n, int bm, int by, String mType, float i) { //seeded shaman
        super(n, bm, by, i);
        setIntrinsic(i);

        //set weapon based on intrinsic
        if(getIntrinsic() > 0.7) weaponType = "Wand";
        else if(getIntrinsic() > 0.4) weaponType = "Staff";
        else if(getIntrinsic() > 0.1) weaponType = "Tome";
        else weaponType = "Crystal";

        //set robe color based on intrinsic
        if(getIntrinsic() > 0.7) robeColor = "Red";
        else if(getIntrinsic() > 0.4) robeColor = "Blue";
        else if(getIntrinsic() > 0.1) robeColor = "Purple";
        else robeColor = "Gold";

        //set robe condition based on intrinsic
        if(getIntrinsic() > 0.7) robeCondition = "Ragged";
        else if(getIntrinsic() > 0.3) robeCondition = "Fair";
        else robeCondition = "Excellent";

        //set weapon condition based on intrinsic
        if(getIntrinsic() > 0.7) weaponCondition = "Crude";
        else if(getIntrinsic() > 0.3) weaponCondition = "Refined";
        else weaponCondition = "Masterfully Crafted";

        //set magic type 
        this.mType = mType;
        mana = 100;
        maxMana = 100;

        manaRingEquipped = false;
        manaFlowerEquipped = false;
    }

    private void regenMana() { //regenerates mana (per turn passive regen)
        if(mana + manaRegenRate < 100) mana += manaRegenRate;
        else mana = 100;
    }

    public int attack() { //consumes mana, so mana is not regenerated
        mana -= 10;
        return super.attack();
    }

    public int move(int d) {  //does not consume mana, so mana is regenerated
        regenMana();
        return super.move(d);
    }
    
    public void rest(int time) { //regenerates both health and mana
        super.rest(time);
        if(manaFlowerEquipped) {
            if(mana + 7*time < maxMana) {
                mana += 7*time;
            } else mana = maxMana;
        } else {
            if(mana + 5*time < maxMana) {
                mana += 5*time;
            } else mana = maxMana;
        }
    }

    public int quoffPotion(int size) { //analogous to drink potion but in many old rogue-likes the 'D' hotkey was used for 'drop item' and 'd' was 'move right'
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
        mana = Math.min(mana, maxMana);
        return 0;
    }

    public boolean reanimate(String cre) { //the shaman class specializes in reanimating monsters it has previously killed, but they instead fight for the shaman.
        mana -= 30;
        return addToStringArray(creatures, cre);
    }

    public boolean deanimate(String cre) {
        return removeFromStringArray(creatures, cre);
    }

    public boolean gainSpell(String spell) {
        return addToStringArray(spells, spell);
    }

    public boolean removeSpell(String spell) {
        return removeFromStringArray(spells, spell);
    }


    private boolean addToStringArray(String[] sa, String s) { //adds a string to a string array (for creatures and spells)
        for(int i = 0; i < sa.length; i++) {
            if(sa[i] == null) {
                sa[i] = s;
                return true; //successfully added
            }
        }
        return false; //failed to add due to no space
    }

    private boolean removeFromStringArray(String[] sa, String s) { //removes a string from a string array
        for(int i = 0; i < sa.length; i++) {
            if(sa[i] != null && sa[i].equals(s)) {
                sa[i] = null;
                return true; //successfully removed
            }
        }
        return false; //failed to remove due to element not being present
    }
    
    public boolean equipManaRing() { 
        if(!manaRingEquipped) {
            manaRingEquipped = true;
            maxMana += 30;
            mana = maxMana;
            return true; //return if operation was successsful
        }
        return false;
    }

    public boolean equipManaFlower() {
        if(!manaFlowerEquipped) {
            manaFlowerEquipped = false;
            return true; //return if operation was successsful
        }
        return false;
    }

    public boolean removeManaRing() {
        if(manaRingEquipped) {
            manaRingEquipped = false;
            maxMana -= 30;
            mana = Math.min(mana, maxMana);
            return true;
        }
        return false;
    }

    public boolean removeManaFlower() {
        if(manaFlowerEquipped) {
            manaFlowerEquipped = false;
            return true;
        } 
        return false;
    }

    public int getMana() {
        return mana;
    }

    public int getMaxMana() {
        return maxMana;
    }

    public String getWeaponType() {
        return weaponType;
    }

    public String getMagicType() {
        return mType;
    }

    public String[] getSpells() {
        return spells;
    }

    public String[] getCreatures() {
        return creatures;
    }

    public boolean isManaFlowerEquipped() {
        return manaFlowerEquipped;
    }
    public boolean isManaRingEquipped() {
        return manaRingEquipped;
    }
    public String getRobeColor() {
        return robeColor;
    }

    public String getRobeCondition() {
        return robeCondition;
    }

    public String getWeaponCondition() {
        return weaponCondition;
    }
}