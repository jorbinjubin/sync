class Weapon extends Item {
    int strength;

    Weapon(String condition, String desc) {
        super(condition);
        if(condition.equals("Terrible")) {
            strength = 1;
            description = "Wet paper towel";
            multiplier = 0.5f;
        } else if (condition.equals("Bad")) {
            description = "Thin stick";
            strength = 2;
            multiplier = 0.75f;
        } else if (condition.equals("Fair")) {
            description = "Tree branch";
            strength = 3;
            multiplier = 1;
        } else if (condition.equals("Good")) {
            description = "Wooden training sword";
            strength = 4;
            multiplier = 1.25f;
        } else if (condition.equals("Excellent")) {
            description = "Lightly used Rapier";
            strength = 5;
            multiplier = 1.5f;
        } else if (condition.equals("Perfect")) {
            description = "A loaded firearm";
            strength = 6;
            multiplier = 2;
        } else {
            description = "You don't know what this is.";
            strength = 0;
        }
        baseValue = 3;
    }

    String getDescription() {
        return description;   
    }

    public String getName() {
        return condition + " " + name;
    }

    String use() {
        return strength + "";
    }

    float getValue() {
        return (float)(multiplier*baseValue);
    }
}