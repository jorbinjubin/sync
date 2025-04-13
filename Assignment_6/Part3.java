import java.io.*;
import java.util.*;

public class Part3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input/Countries-Population.txt"));
        ArrayList<String> countries = new ArrayList<>();
        ArrayList<String> capitals = new ArrayList<>();
        ArrayList<Float> areas = new ArrayList<>();
        ArrayList<Integer> populations = new ArrayList<>();
        String line;
        while((line = br.readLine()) != null) {
            String[] splitString = line.split(" ");
            int splitLength = splitString.length;
            if (splitLength == 4) {
                countries.add(splitString[0]);
                capitals.add(splitString[1]);
                areas.add(Float.parseFloat(splitString[2].replaceAll(",", "")));
                populations.add(Integer.parseInt(splitString[3].replaceAll(",", "")));
            } else {
                if (splitString[0].equals("Andorra")) {
                    countries.add(splitString[0]);
                    capitals.add(splitString[1] + " " + splitString[2] + " " + splitString[3]);
                    areas.add(Float.parseFloat(splitString[4].replaceAll(",", "")));
                    populations.add(Integer.parseInt(splitString[5].replaceAll(",", "")));

                }

                if (splitString[0].equals("Antigua")) {
                    countries.add(splitString[0] + " " + splitString[1] + " " + splitString[2]);
                    capitals.add(splitString[3] + " " + splitString[4]);
                    areas.add(Float.parseFloat(splitString[5]));
                    populations.add(Integer.parseInt(splitString[6].replaceAll(",", "")));
                }

                if (splitString[0].equals("Argentina")) {
                    countries.add(splitString[0]);
                    capitals.add(splitString[1] + " " + splitString[2]);
                    areas.add(Float.parseFloat(splitString[3].replace(",", "")));
                    populations.add(Integer.parseInt(splitString[4].replace(",", "")));
                }

                if (splitString[0].equals("Belarus")) {
                    countries.add(splitString[0]);
                    capitals.add(splitString[1] + " " + splitString[2]);
                    areas.add(Float.parseFloat(splitString[3].replace(",", "")));
                    populations.add(Integer.parseInt(splitString[4].replace(",", "")));
                }

                if (splitString[0].equals("Bolivia")) {
                    countries.add(splitString[0]);
                    capitals.add(splitString[1] + " " + splitString[2]);
                    areas.add(Float.parseFloat(splitString[3].replace(",", "")));
                    populations.add(Integer.parseInt(splitString[4].replace(",", "")));
                }

                if (splitString[0].equals("Bosnia")) {
                    countries.add(splitString[0] + " " + splitString[1] + " " + splitString[2]);
                    capitals.add(splitString[3]);
                    areas.add(Float.parseFloat(splitString[4].replace(",", "")));
                    populations.add(Integer.parseInt(splitString[5].replace(",", "")));
                }

                if (splitString[0].equals("Brunei")) {
                    countries.add(splitString[0]);
                    capitals.add(splitString[1] + " " + splitString[2] + " " + splitString[3]);
                    areas.add(Float.parseFloat(splitString[4].replace(",", "")));
                    populations.add(Integer.parseInt(splitString[5].replace(",", "")));
                }

                if (splitString[0].equals("Burkina")) {
                    countries.add(splitString[0] + " " + splitString[1]);
                    capitals.add(splitString[2]);
                    areas.add(Float.parseFloat(splitString[3].replace(",", "")));
                    populations.add(Integer.parseInt(splitString[4].replace(",", "")));
                }

                if (splitString[0].equals("Cambodia")) {
                    countries.add(splitString[0]);
                    capitals.add(splitString[1] + " " + splitString[2]);
                    areas.add(Float.parseFloat(splitString[3].replace(",", "")));
                    populations.add(Integer.parseInt(splitString[4].replace(",", "")));
                }

                if (splitString[0].equals("Cape")) {
                    countries.add(splitString[0] + " " + splitString[1]);
                    capitals.add(splitString[2]);
                    areas.add(Float.parseFloat(splitString[3].replace(",", "")));
                    populations.add(Integer.parseInt(splitString[4].replace(",", "")));
                }

                if (splitString[0].equals("Central")) {
                    countries.add(splitString[0] + " " + splitString[1] + " " + splitString[2]);
                    capitals.add(splitString[3]);
                    areas.add(Float.parseFloat(splitString[4].replace(",", "")));
                    populations.add(Integer.parseInt(splitString[5].replace(",", "")));
                }

                if (splitString[0].equals("Chad")) {
                    countries.add(splitString[0]);
                    capitals.add(splitString[2]);
                    areas.add(Float.parseFloat(splitString[3].replace(",", "")));
                    populations.add(Integer.parseInt(splitString[4].replace(",", "")));
                }

                if (splitString[0].equals("Comoros")) {
                    countries.add(splitString[0]);
                    capitals.add(splitString[2]); // why double space??
                    areas.add(Float.parseFloat(splitString[3].replace(",", "")));
                    populations.add(Integer.parseInt(splitString[4].replace(",", "")));
                }

                if (splitString[0].equals("Congo,")) {
                    if (splitString[1].equals("Republic")) {
                        countries.add("Republic of Congo");
                        capitals.add("Brazzaville");
                        areas.add(132046f);
                        populations.add(3702314);
                    } else {
                        countries.add("Democratic Republic of Congo");
                        capitals.add("Kinshasa");
                        areas.add(905563f);
                        populations.add(62660551);
                    }
                }

                if (splitString[0].equals("Costa")) {
                    countries.add(splitString[0] + " " + splitString[1]);
                    capitals.add(splitString[2] + " " + splitString[3]);
                    areas.add(Float.parseFloat(splitString[4].replace(",", "")));
                    populations.add(Integer.parseInt(splitString[5].replace(",", "")));
                }

                if (splitString[0].equals("Côte")) {
                    countries.add(splitString[0] + " " + splitString[1]);
                    capitals.add(splitString[2]);
                    areas.add(Float.parseFloat(splitString[3].replace(",", "")));
                    populations.add(Integer.parseInt(splitString[4].replace(",", "")));
                }

                if (splitString[0].equals("Czech")) {
                    countries.add(splitString[0] + " " + splitString[1]);
                    capitals.add(splitString[2]);
                    areas.add(Float.parseFloat(splitString[3].replace(",", "")));
                    populations.add(Integer.parseInt(splitString[4].replace(",", "")));
                }

                if (splitString[0].equals("Dominican")) {
                    countries.add(splitString[0] + " " + splitString[1]);
                    capitals.add(splitString[2] + " " + splitString[3]);
                    areas.add(Float.parseFloat(splitString[4].replace(",", "")));
                    populations.add(Integer.parseInt(splitString[5].replace(",", "")));
                }

                if (splitString[0].equals("East")) {
                    countries.add(splitString[0] + " " + splitString[1]);
                    capitals.add(splitString[2]);
                    areas.add(Float.parseFloat(splitString[3].replace(",", "")));
                    populations.add(Integer.parseInt(splitString[4].replace(",", "")));
                }

                if (splitString[0].equals("El")) {
                    countries.add(splitString[0] + " " + splitString[1]);
                    capitals.add(splitString[2] + " " + splitString[3]);
                    areas.add(Float.parseFloat(splitString[4].replace(",", "")));
                    populations.add(Integer.parseInt(splitString[5].replace(",", "")));
                }

                if (splitString[0].equals("Equatorial")) {
                    countries.add(splitString[0] + " " + splitString[1]);
                    capitals.add(splitString[2]);
                    areas.add(Float.parseFloat(splitString[3].replace(",", "")));
                    populations.add(Integer.parseInt(splitString[4].replace(",", "")));
                }

                if (splitString[0].equals("Ethiopia")) {
                    countries.add(splitString[0]);
                    capitals.add(splitString[1] + " " + splitString[2]);
                    areas.add(Float.parseFloat(splitString[3].replace(",", "")));
                    populations.add(Integer.parseInt(splitString[4].replace(",", "")));
                }

                if (splitString[0].equals("Grenada")) {
                    countries.add(splitString[0]);
                    capitals.add(splitString[1] + " " + splitString[2]);
                    areas.add(Float.parseFloat(splitString[3].replace(",", "")));
                    populations.add(Integer.parseInt(splitString[4].replace(",", "")));
                }

                if (splitString[0].equals("Guatemala")) {
                    countries.add(splitString[0]);
                    capitals.add(splitString[1] + " " + splitString[2]);
                    areas.add(Float.parseFloat(splitString[3].replace(",", "")));
                    populations.add(Integer.parseInt(splitString[4].replace(",", "")));
                }

                if (splitString[0].equals("India")) {
                    countries.add(splitString[0]);
                    capitals.add(splitString[1] + " " + splitString[2]);
                    areas.add(Float.parseFloat(splitString[3].replace(",", "")));
                    populations.add(Integer.parseInt(splitString[4].replace(",", "")));
                }

                if (splitString[0].equals("Korea,")) {
                    if (splitString[1].equals("North")) {
                        countries.add("North Korea");
                        capitals.add("Pyongyang");
                        areas.add(46540f);
                        populations.add(23113019);
                    } else {
                        countries.add("South Korea");
                        capitals.add("Seoul");
                        areas.add(38023f);
                        populations.add(48846823);
                    }
                }

                if (splitString[0].equals("Kuwait")) {
                    countries.add(splitString[0]);
                    capitals.add(splitString[1] + " " + splitString[2]);
                    areas.add(Float.parseFloat(splitString[3].replace(",", "")));
                    populations.add(Integer.parseInt(splitString[4].replace(",", "")));
                }

                if (splitString[0].equals("Malaysia")) {
                    countries.add(splitString[0]);
                    capitals.add(splitString[1] + " " + splitString[2]);
                    areas.add(Float.parseFloat(splitString[3].replace(",", "")));
                    populations.add(Integer.parseInt(splitString[4].replace(",", "")));
                }

                if (splitString[0].equals("Marshall")) {
                    countries.add(splitString[0] + " " + splitString[1]);
                    capitals.add(splitString[2]);
                    areas.add(Float.parseFloat(splitString[3].replace(",", "")));
                    populations.add(Integer.parseInt(splitString[4].replace(",", "")));
                }

                if (splitString[0].equals("Mauritius")) {
                    countries.add(splitString[0]);
                    capitals.add(splitString[1] + " " + splitString[2]);
                    areas.add(Float.parseFloat(splitString[3].replace(",", "")));
                    populations.add(Integer.parseInt(splitString[4].replace(",", "")));
                }

                if (splitString[0].equals("Mexico")) {
                    countries.add(splitString[0]);
                    capitals.add(splitString[1] + " " + splitString[2]);
                    areas.add(Float.parseFloat(splitString[3].replace(",", "")));
                    populations.add(Integer.parseInt(splitString[4].replace(",", "")));
                }

                if (splitString[0].equals("Mongolia")) {
                    countries.add(splitString[0]);
                    capitals.add(splitString[1] + " " + splitString[2]);
                    areas.add(Float.parseFloat(splitString[3].replace(",", "")));
                    populations.add(Integer.parseInt(splitString[4].replace(",", "")));
                }

                if (splitString[0].equals("Myanmar")) {
                    countries.add(splitString[0] + " " + splitString[1]);
                    capitals.add(splitString[2]);
                    areas.add(Float.parseFloat(splitString[3].replace(",", "")));
                    populations.add(Integer.parseInt(splitString[4].replace(",", "")));
                }

                if (splitString[0].equals("New")) {
                    countries.add(splitString[0] + " " + splitString[1]);
                    capitals.add(splitString[2]);
                    areas.add(Float.parseFloat(splitString[3].replace(",", "")));
                    populations.add(Integer.parseInt(splitString[4].replace(",", "")));
                }

                if (splitString[0].equals("Panama")) {
                    countries.add(splitString[0]);
                    capitals.add(splitString[1] + " " + splitString[2]);
                    areas.add(Float.parseFloat(splitString[3].replace(",", "")));
                    populations.add(Integer.parseInt(splitString[4].replace(",", "")));
                }

                if (splitString[0].equals("Papua")) {
                    countries.add(splitString[0] + " " + splitString[1] + " " + splitString[2]);
                    capitals.add(splitString[3] + " " + splitString[4]);
                    areas.add(Float.parseFloat(splitString[5].replace(",", "")));
                    populations.add(Integer.parseInt(splitString[6].replace(",", "")));
                }

                if (splitString[0].equals("St.")) {
                    if (splitString[1].equals("Kitts")) {
                        countries.add("St. Kitts and Nevis");
                        capitals.add("Basseterre");
                        areas.add(101f);
                        populations.add(39129);
                    } else if (splitString[1].equals("Lucia")) {
                        countries.add("St. Lucia");
                        capitals.add("Castries");
                        areas.add(238f);
                        populations.add(168458);
                    } else {
                        countries.add("St. Vincent and the Grenadines");
                        capitals.add("Kingstown");
                        areas.add(150f);
                        populations.add(117848);
                    }
                }

                if (splitString[0].equals("San")) {
                    countries.add(splitString[0] + " " + splitString[1]);
                    capitals.add(splitString[2] + " " + splitString[3]);
                    areas.add(Float.parseFloat(splitString[4].replace(",", "")));
                    populations.add(Integer.parseInt(splitString[5].replace(",", "")));
                }

                if (splitString[0].equals("São")) {
                    countries.add(splitString[0] + " " + splitString[1] + " " + splitString[2] + " " + splitString[3]);
                    capitals.add(splitString[4] + " " + splitString[5]);
                    areas.add(Float.parseFloat(splitString[6].replace(",", "")));
                    populations.add(Integer.parseInt(splitString[7].replace(",", "")));
                }

                if (splitString[0].equals("Saudi")) {
                    countries.add(splitString[0] + " " + splitString[1]);
                    capitals.add(splitString[2]);
                    areas.add(Float.parseFloat(splitString[3].replace(",", "")));
                    populations.add(Integer.parseInt(splitString[4].replace(",", "")));
                }

                if (splitString[0].equals("Sierra")) {
                    countries.add(splitString[0] + " " + splitString[1]);
                    capitals.add(splitString[2]);
                    areas.add(Float.parseFloat(splitString[3].replace(",", "")));
                    populations.add(Integer.parseInt(splitString[4].replace(",", "")));
                }

                if (splitString[0].equals("Solomon")) {
                    countries.add(splitString[0] + " " + splitString[1]);
                    capitals.add(splitString[2]);
                    areas.add(Float.parseFloat(splitString[3].replace(",", "")));
                    populations.add(Integer.parseInt(splitString[4].replace(",", "")));
                }

                if (splitString[0].equals("South")) {
                    countries.add(splitString[0] + " " + splitString[1]);
                    capitals.add(splitString[2]);
                    areas.add(Float.parseFloat(splitString[3].replace(",", "")));
                    populations.add(Integer.parseInt(splitString[4].replace(",", "")));
                }

                if (splitString[0].equals("Sri")) {
                    countries.add(splitString[0] + " " + splitString[1]);
                    capitals.add(splitString[2]);
                    areas.add(Float.parseFloat(splitString[3].replace(",", "")));
                    populations.add(Integer.parseInt(splitString[4].replace(",", "")));
                }

                if (splitString[0].equals("Trinidad")) {
                    countries.add(splitString[0] + " " + splitString[1] + " " + splitString[2]);
                    capitals.add(splitString[3]);
                    areas.add(Float.parseFloat(splitString[4].replace(",", "")));
                    populations.add(Integer.parseInt(splitString[5].replace(",", "")));
                }

                if (splitString[0].equals("Ukraine")) {
                    countries.add(splitString[0]);
                    capitals.add(splitString[1] + " " + splitString[2]);
                    areas.add(Float.parseFloat(splitString[3].replace(",", "")));
                    populations.add(Integer.parseInt(splitString[4].replace(",", "")));
                }

                if (splitString[0].equals("United")) {
                    if (splitString[1].equals("Arab")) {
                        countries.add("United Arab Emirates");
                        capitals.add("Abu Dhabi");
                        areas.add(32000f);
                        populations.add(2602713);
                    } else if (splitString[1].equals("Kingdom")) {
                        countries.add("United Kingdom");
                        capitals.add("London");
                        areas.add(94525f);
                        populations.add(60609153);
                    } else {
                        countries.add("United States");
                        capitals.add("Washington, D.C.");
                        areas.add(3718691f);
                        populations.add(298444215);
                    }
                }

                if (splitString[0].equals("Vatican")) {
                    countries.add(splitString[0] + " " + splitString[1]);
                    capitals.add("No Capital");
                    areas.add(0.17f);
                    populations.add(932);
                }

                if (splitString[0].equals("Western")) {
                    countries.add(splitString[0] + " " + splitString[1]);
                    capitals.add("No Capital");
                    areas.add(102703f);
                    populations.add(Integer.parseInt(splitString[4].replace(",", "")));
                }
            }
        }
        /*
         * Well that was something. Some crude python knowledge certainly helped,
         * along with a large database of country names and capitals to cross reference.
         * A lot of fixing by hand.
         * I found the exceptions by just running through the list once and initially,
         * the else statement at :21 just
         * wrote the exception lines to a seperate file. I then used a bit of python to
         * cross reference
         * various country lists and capital cities.
         * Then, I used the Python to "generate" (more like fill in the blanks) Java
         * code.
         * I then compiled it and went through each of the errors the compiler yelled at
         * me for.
         * Finally, I arrived here. 400 lines.
         * 
         * Also, It asks you to take in capital cities and area but none of that
         * information is ever used.
         */
        PrintWriter alphaSorted = new PrintWriter(new File("output/sortedByCountry.txt"));
        PrintWriter popSorted = new PrintWriter(new File("output/sortedByPopulation.txt"));

        
        insertionSort(countries, populations, true);
        alphaSorted.write("Country\t\t\t\t\t\t\t\t\tPopulation\n");
        alphaSorted.write("------------------------------------------------------------\n");
        for (int i = 0; i < countries.size(); i++) {
            String a = countries.get(i);
            String b = format(populations.get(i));

            // StringBuilder class will be used to build output format.
            /*
             * String builder is a built-in Java class that was introduced prior to Java 8.
             * This will be used instead of the .repeat method (which I would have prefered)
             * due to it not being in Java 8.
             */
            StringBuilder sb = new StringBuilder();
            sb.append(a); // First, add a (the country name)
            for (int j = 0; j < 10 - Math.ceil(a.length() / 4); j++) {
                sb.append("\t"); // Then, append an appropriate number of \t characters
            }
            sb.append(b); // Finally, add b.
            alphaSorted.write(sb.toString() + '\n'); // Write it to file using toString() method to convert to String
        }
        alphaSorted.close();


        insertionSort(populations, countries);
        popSorted.write("Population\t\t\t\t\t\t\t\tCountry\n");
        popSorted.write("------------------------------------------------------------\n");
        for (int i = 0; i < countries.size(); i++) {
            String a = format(populations.get(i));
            String b = countries.get(i);

            StringBuilder sb = new StringBuilder();
            sb.append(a); // First, add a (the population)
            for (int j = 0; j < 10 - Math.ceil(a.length() / 4); j++) {
                sb.append("\t"); // Then, append an appropriate number of \t characters
            }
            sb.append(b); // Finally, add b.
            popSorted.write(sb.toString() + '\n'); // Write it to file using toString() method to convert to String
        }
        popSorted.close();
    }

    /**
     * Uses insertion sort to sort one array and modify another one in parallel.
     * 
     * @param pop   First array to be sorted numerically
     * @param alpha Second array to be modified in parallel
     */
    public static void insertionSort(ArrayList<Integer> pop, ArrayList<String> alpha) {
        for (int i = 1; i < pop.size(); i++) {
            int key = pop.get(i);
            String keyAlpha = alpha.get(i);
            int j = i - 1;

            // Shift elements that are smaller than key to the right
            while (j >= 0 && pop.get(j) < key) {
                pop.set(j + 1, pop.get(j));
                alpha.set(j + 1, alpha.get(j)); // Modify the names array list in parallel
                j--;
            }
            pop.set(j + 1, key);
            alpha.set(j + 1, keyAlpha);
        }
    }

    /**
     * Uses insertion sort to sort one array and modify another one in parallel.
     * 
     * @param alpha First array to be sorted alphabetically
     * @param pop   Second array to be modified in parallel
     * @param a     Overloading boolean variable
     */
    public static void insertionSort(ArrayList<String> alpha, ArrayList<Integer> pop, boolean a) {
        for (int i = 1; i < alpha.size(); i++) {
            String key = alpha.get(i); // Now properly a String
            int keyPop = pop.get(i); // Population value to move with the country
            int j = i - 1;

            // Compare strings using compareTo() (ascending order)
            while (j >= 0 && alpha.get(j).compareTo(key) > 0) {
                alpha.set(j + 1, alpha.get(j)); // Shift country right
                pop.set(j + 1, pop.get(j)); // Shift population in parallel
                j--;
            }
            alpha.set(j + 1, key); // Insert country in correct position
            pop.set(j + 1, keyPop); // Insert corresponding population
        }
    }

        /**
         * Uses StringBuilder to format numbers nicely, using commas every 3 digits.
         * Ex. 12345 -> 12,345
         * 
         * @param number    The number to format
         * @return          The formatter number
         */
    public static String format(int number) {
        StringBuilder result = new StringBuilder();
        int digitCount = 0;

        while (number > 0) {
            // Insert a comma every 3 digits (but not at the start)
            if (digitCount > 0 && digitCount % 3 == 0) {
                result.insert(0, ',');
            }

            // Extract the last digit and add to the front
            int digit = number % 10;
            result.insert(0, digit);
            number /= 10;
            digitCount++;
        }
        return result.toString();
    }
}