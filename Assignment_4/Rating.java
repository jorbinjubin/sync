//Justin Jiang
//ICS4U1
//Mrs. Krasteva
//Arrays assignment: rate a series of things according to a number of criteria

import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Comparator;
import java.io.*;

public class Rating { // Rating class

    static int mChoice;
    static BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException { // Main method
        // Set up file reader
        BufferedReader br = new BufferedReader(new FileReader("data.txt"));

        // Read data from file
        String[] distros = br.readLine().split(" ");
        String[] parentDistro = br.readLine().split(" ");
        StringTokenizer st = new StringTokenizer(br.readLine());
        boolean[] hasGuiInstaller = new boolean[distros.length];
        for (int i = 0; i < 6; i++) {
            hasGuiInstaller[i] = Boolean.parseBoolean(st.nextToken());
        }
        String[] stability = br.readLine().split(" ");
        st = new StringTokenizer(br.readLine());
        int[] packageBaseSize = new int[6];
        for (int i = 0; i < 6; i++) {
            packageBaseSize[i] = Integer.parseInt(st.nextToken());
        }
        br.close();
        mChoice = 0;

        System.out.println("Welcome to Justin\'s Linux Distro Ranker\n");
        while (mChoice != 5) {

            menu();
            if (mChoice == 1) {
                System.out.println("You picked: List distros\n");
                System.out.print("Distro" + " ".repeat(8));
                System.out.print("|Based On" + " ".repeat(6));
                System.out.print("|Has GUI installer" + " ");
                System.out.print("|Stability" + " ".repeat(7));
                System.out.println("|Package Base Size");
                System.out.println(
                        "------------------------------------------------------------------------------------");
                for (int i = 0; i < 6; i++) {
                    System.out.print(distros[i] + " ".repeat(15 - distros[i].length() - 1) + "|");
                    System.out.print(parentDistro[i] + " ".repeat(15 - parentDistro[i].length() - 1) + "|");
                    System.out.print(hasGuiInstaller[i] ? "Yes" + " ".repeat(15) + "|" : "No" + " ".repeat(16) + "|");
                    System.out.print(
                            stability[i].replaceAll("_", " ") + " ".repeat(17 - stability[i].length() - 1) + "|");
                    System.out.print(packageBaseSize[i]);
                    System.out.println();
                }
                int lpb = Integer.MIN_VALUE;
                int maxIndex = -1;
                for(int i = 0; i < 6; i++) {
                    if(packageBaseSize[i] > lpb) {
                        lpb = packageBaseSize[i]; maxIndex = i;
                    }
                }
                System.out.println("The distro with the largest package base is " + distros[maxIndex] + " with " + lpb + " packages in its combined repositories.");
                System.out.println("The most stable distro is Debian."); //not sure how to even do this based on the values I used
                delay(2000);
                System.out.println("\n");
            } else if (mChoice == 2) {
                int rankChoice = 0;
                System.out.println("You picked: Rank Distros\n");
                System.out.println("Distros can be ranked over 2 criteria:");
                System.out.println("1. Beginner-friendliness");
                System.out.println("2. Convenience/Ease of Use");
                System.out.print("Enter your choice (default=1): ");
                do {
                    try {
                        rankChoice = Integer.parseInt(inp.readLine());
                    } catch (NumberFormatException nfe) {
                        rankChoice = 1; // error driven programming
                    }
                } while (!(1 <= rankChoice && rankChoice <= 2));
                if (rankChoice == 1) {
                    int bestBF = Integer.MIN_VALUE;
                    int[] bestRanking = new int[6];
                    for (int i = 0; i < 6; i++) {
                        int cur = 0;
                        if (hasGuiInstaller[i]) {
                            cur += 50;
                        }
                        if (parentDistro[i].equals("Ubuntu")) {
                            cur += 30;
                        }
                        if (parentDistro[i].equals("Debian")) {
                            cur += 15;
                        }
                        if (packageBaseSize[i] < 100000) {
                            cur += 10;
                        }
                        if (stability[i].equals("High") || stability[i].equals("Extremely_High")) {
                            cur += 10;
                        }
                        if (stability[i].equals("Medium")) {
                            cur -= 5;
                        }
                        if (stability[i].equals("Low")) {
                            cur -= 10;
                        }
                        bestRanking[i] = cur;
                        if (cur > bestBF) {
                            bestBF = cur;
                        }
                    }
                    // Create a list of indices to sort based on scores
                    Integer[] indices = new Integer[distros.length];
                    for (int i = 0; i < indices.length; i++) {
                        indices[i] = i;
                    }

                    // Sort indices based on scores in descending order
                    Arrays.sort(indices, (a, b) -> Integer.compare(bestRanking[b], bestRanking[a]));

                    // Generate the sorted distros and scores
                    String[] sortedDistros = new String[distros.length];
                    int[] sortedScores = new int[bestRanking.length];
                    for (int i = 0; i < sortedDistros.length; i++) {
                        sortedDistros[i] = distros[indices[i]];
                        sortedScores[i] = bestRanking[indices[i]];
                    }
                    System.out.println("The most beginner-friendly distro is " + sortedDistros[0] + " with a score of "
                            + sortedScores[0]);
                    System.out.println(
                            "The second most beginner-friendly distro is " + sortedDistros[1] + " with a score of "
                                    + sortedScores[1]);
                } else if (rankChoice == 2) {
                    
                    int[] bestRanking = new int[6];
                    for(int i = 0; i < 6; i++) {
                        int cur = 0;
                        if(hasGuiInstaller[i]) {
                            cur += 10;
                        }
                        if(packageBaseSize[i] > 100000) cur += 10;
                        if(packageBaseSize[i] > 110000) cur += 15;
                        if(stability[i].equals("High")) {
                            cur += 20;
                        } else if(stability[i].equals("Extremely_High")) {
                            cur += 30;
                        }
                        else if(stability[i].equals("Low")) {
                            cur -= 30;
                        }
                        bestRanking[i] = cur;
                    }

                    // Create a list of indices to sort based on scores
                    Integer[] indices = new Integer[distros.length];
                    for (int i = 0; i < indices.length; i++) {
                        indices[i] = i;
                    }

                    // Sort indices based on scores in descending order
                    Arrays.sort(indices, (a, b) -> Integer.compare(bestRanking[b], bestRanking[a]));

                    // Generate the sorted distros and scores
                    String[] sortedDistros = new String[distros.length];
                    int[] sortedScores = new int[bestRanking.length];
                    for (int i = 0; i < sortedDistros.length; i++) {
                        sortedDistros[i] = distros[indices[i]];
                        sortedScores[i] = bestRanking[indices[i]];
                    }
                    System.out.println("The most convenient distro is " + sortedDistros[0] + " with a score of " + sortedScores[0]);
                    System.out.println("The second most convenient distro is " + sortedDistros[1] + " with a score of " + sortedScores[1]);
                }
                delay(2000);
                System.out.println("\n");
            } else if (mChoice == 3) {
                System.out.println("You have picked Help.");
                System.out.println("When prompted to enter a number, enter a choice that is closest to what you want.");
                System.out.println("If information is given, it will be printed, then 2 seconds will pass before you are promted again.");
                System.out.println("Choose 4 to exit.");
            }
        }
    }

    public static void menu() throws IOException {
        System.out.println("Please choose an option:");
        System.out.println("1. List distros");
        System.out.println("2. Rank distros");
        System.out.println("3. Help");
        System.out.println("4. Exit");
        System.out.print("Enter an option (default=4): ");
        do {
            try {
                mChoice = Integer.parseInt(inp.readLine());
            } catch (NumberFormatException nfe) {
                mChoice = 4; // error driven programming
            }
        } while (!(1 <= mChoice && mChoice <= 4));
        System.out.println("\n");
    }

    public static void delay(int ms) { // try catch who?
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ie) { // catching Exception e is inefficient, so by reading java documentation...

        }
    }
}
