import java.util.Random;
import java.util.Scanner;

public class Part1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] animals = { "Bat", "Cat", "Cow", "Dog", "Elk", "Fly", "Fox", "Gnu", "Hen", "Owl", "Pig", "Rat", "Yak" }; // Thanks for making all the animals 3 letters long, really helps with multicursor
        System.out.println("Unsorted array: ");
        randomizeArray(animals);
        for(String s : animals) System.out.print(s + " ");
        System.out.println("\n");

        insertionSort(animals);

        System.out.println("Sorted array: ");
        for(String s : animals) System.out.print(s + " ");

        System.out.println("\n");

        System.out.print("Please enter the entry you would like to search for: ");
        String target = sc.next();
        if(search(animals, target) >= 0) System.out.println("Target was found in position " + search(animals, target));
        else System.out.println("Target not found.");
    }

    /**
     * Uses bisection method, AKA binary search (on sorted array) to search the string array
     * @param s
     * @param tgt
     * @return -1 if value not found, key if value is found
     */
    public static int search(String[] s, String tgt) {
        int left = 0;
        int right = s.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (s[mid].equals(tgt)) {
                return mid;
            } else if (s[mid].compareTo(tgt) < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
    /**
     * Uses insertion sort to sort the array 
     * @param s the string array to be sorted
     */
    public static void insertionSort(String[] s) {
        int n = s.length;
        for (int i = 1; i < n; i++) {
            String key = s[i];
            int j = i - 1;

            // Compare the first letters alphabetically
            while (j >= 0 && !s[j].isEmpty() && !key.isEmpty() && s[j].charAt(0) > key.charAt(0)) {
                s[j + 1] = s[j];
                j = j - 1;
            }
            s[j+1] = key;
        }
    }

    /**
     * Randomizes the string array using Random class
     * @param s String array to be randomized
     */
    public static void randomizeArray(String[] s) {
        Random r = new Random();
        for (int i = s.length - 1; i > 0; i--) {
            int j = r.nextInt(i + 1);
            String temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
    }
}
// "Write a small program to..."
// haha ok, 84 lines
// ok well now it's 85