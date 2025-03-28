import java.io.*;
import java.util.*;

public class Part2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("A7-1.txt"));
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> marks = new ArrayList<>();

        for (int i = 0; i < 70; i++) { // Since the testing file will be identical to the one given, the line number is going to be hard coded.
            names.add(br.readLine());
            marks.add(br.readLine());
        }

        // Subtask 1: Print out the original data in columns
        System.out.println("\n\n<-------------- Unsorted Data -------------->");
        System.out.println("Name\t\t\t\tMark"); // Note: there is not a peron named Mark in the data.
        System.out.println("-------------------------------------");
        for (int i = 0; i < 35; i++) {
            System.out.println(names.get(i) + (names.get(i).equals("Goldeneyes") ? "\t\t\t" : "\t\t\t\t") + marks.get(i)); // Ternary operator :P
        }

        // Subtask 2: Sort the data alphabetically
        /**
         * One way to approach this task would be to main 2 parallel array lists.
         * As you shift around the elements in the 'names' array list, you also shift
         * around the marks.
         * However, over a plate of rice and vegetables, I thought of another idea.
         * Since the task is alphabetically, why not just concatenate the marks with the
         * name, then separate them later?
         * This could also be implemented by pairing them up using a custom Pair class,
         * or 2 element String array, but...
         */

        String[] combinedData = new String[35];
        for (int i = 0; i < 35; i++) {
            combinedData[i] = names.get(i) + " " + marks.get(i); // Combine the data from the 2 arrays, ensuring the name goes first
        }

        // Use insertion sort to sort the array
        insertionSort(combinedData);

        // Now that the array is sorted, it can be turned back into array lists.

        ArrayList<String> sortedNames = new ArrayList<>();
        ArrayList<String> sortedMarks = new ArrayList<>();
        for (String s : combinedData) {
            String[] temp = s.split(" "); // Alternatively you could use StringTokenizer from java.util
            sortedNames.add(temp[0]);
            sortedMarks.add(temp[1]);
        }

        // Finally, print the sorted data
        System.out.println("\n\n<-------------- Sorted Data -------------->");
        System.out.println("Name\t\t\t\tMark");
        System.out.println("-------------------------------------");
        for (int i = 0; i < 35; i++) {
            System.out.println(sortedNames.get(i) + (sortedNames.get(i).equals("Goldeneyes") ? "\t\t\t" : "\t\t\t\t")
                    + sortedMarks.get(i));
        }

        // Subtask 3: Sort the data by mark, in descending order
        ArrayList<Integer> convertedMarks = new ArrayList<>();
        for (String s : marks) {
            try {
                convertedMarks.add(Integer.parseInt(s));
            } catch (NumberFormatException nfe) {
                break;
            }
        }

        // Sort the arrays by the marks using the overloaded sorting method
        insertionSort(convertedMarks, names); 
        
        // Finally, print it
        System.out.println("\n\n<-------------- Sorted Data By Marks -------------->");
        System.out.println("Name\t\t\t\tMark");
        System.out.println("-------------------------------------");
        for (int i = 0; i < 35; i++) {
            System.out.println(names.get(i) + (names.get(i).equals("Goldeneyes") ? "\t\t\t" : "\t\t\t\t") + convertedMarks.get(i));
        }
        System.out.println("\n\nProgram end.");
    }


    /**
     * Sorts an array of strings in ascending order based on the first character of each string
     * using insertion sort.
     * 
     * This method compares the first character of each string and rearranges the elements
     * such that strings with lower alphabetical first letters come before those with higher ones.
     * 
     * @param s The array of strings to be sorted.
     */
    public static void insertionSort(String[] s) {
        int n = s.length;
        for (int i = 1; i < n; i++) {
            String key = s[i];
            int j = i - 1;
            // Compare the first letter alphabetically
            while (j >= 0 && !s[j].isEmpty() && !key.isEmpty() && s[j].charAt(0) > key.charAt(0)) {
                s[j + 1] = s[j];
                j = j - 1;
            }
            s[j + 1] = key;
        }
    }
    /**
     * Sorts two parallel array lists using insertion sort.
     * The first array list is sorted in descending order, and the second array list
     * is modified in parallel to maintain the relationship between the elements.
     * 
     * The elements in the first array list (m) are compared and rearranged in descending
     * order, and the corresponding elements in the second array list (n) are shifted accordingly.
     * 
     * @param m The first array list to be sorted in descending order.
     * @param n The second array list that is modified in parallel.
     */
    public static void insertionSort(ArrayList<Integer> m, ArrayList<String> n) {
        for (int i = 1; i < m.size(); i++) {
            int key = m.get(i);
            String keyN = n.get(i);
            int j = i - 1;

            // Shift elements that are smaller than key to the right
            while (j >= 0 && m.get(j) < key) {
                m.set(j + 1, m.get(j));
                n.set(j + 1, n.get(j)); // Modify the names array list in parallel
                j--;
            }
            m.set(j + 1, key);
            n.set(j + 1, keyN);
        }
    }
}
