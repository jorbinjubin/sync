class Medication extends Item {
    int strength;

    Medication(String condition, String desc) {
        super(condition);
        if(condition.equals("Terrible")) {
            strength = -3;
            description = "Bottle of rat droppings";
            multiplier = 0.5f;
        } else if (condition.equals("Bad")) {
            description = "Flask of Muddy water";
            strength = -1;
            multiplier = 0.75f;
        } else if (condition.equals("Fair")) {
            description = "Unopened sterile bandages";
            strength = 2;
            multiplier = 1;
        } else if (condition.equals("Good")) {
            description = "Knock-off Anti-Rad pills";
            strength = 3;
            multiplier = 1.25f;
        } else if (condition.equals("Excellent")) {
            description = "AR-2 Anti-Rad Injector";
            strength = 4;
            multiplier = 1.5f;
        } else if (condition.equals("Perfect")) {
            description = "Unknown object with a powerful aura";
            strength = 5;
            multiplier = 2;
        } else {
            description = "You don't know what this is.";
            strength = 0;
        }
        baseValue = 2;
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