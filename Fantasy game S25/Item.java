class Item {

    int baseValue;
    float multiplier;
    String condition;
    String name;
    String description;

    Item(String condition) {
        this.condition = condition;
    }
    Item() {
    }
    String getName() {
        return name;
    }
    String use() {
        return "It's some sort of doohickey or doodad you can't figure out.";
    }
    String getCondition() {
        return condition;
    }
    float getValue() {
        return 0;
    }
}