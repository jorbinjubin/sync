import java.util.*;
class Scroll extends Item {
    int strength;
    String text;
    Scroll(String condition, String desc) {
        super();
        description = "Piece of paper with stuff on it";
        String[] jokes = {
            "Failing to plan is planning to become an entry in an unemployment survey. - Sun Tzu",
            "Go go gadget, bench extender",
            "I wonder what happens if I connect these wires",
            "Idiocy, bigotry, ignorance, facism. Somehow the USA is led by a combination of those qualities.",
            "How many programmers does it take to change a light bulb? None, that's a hardware problem.",
            "This code resembles my favourite italian noodle dish."
        };
        text = jokes[new Random().nextInt(6)];
    }

    String getDescription() {
        return description;   
    }

    public String getName() {
        return condition + " " + name;
    }

    String use() {
        return text;
    }

    float getValue() {
        return 3;
    }
}