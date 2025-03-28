import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(0);
        numbers.add(2);
        numbers.add(4);
        numbers.add(5);
        for (int k = numbers.size() - 1; k >= 0; k--)

        {

            if (numbers.get(k) > k)

            {

                System.out.print(k + " ");

            }

        }
    }

    public static void removeElement(ArrayList<Integer> data, int target) {
        for (int j = 0; j < data.size(); j++) {
            if (data.get(j).equals(target)) {
                data.remove(j);
            }
        }
        System.out.println(data);
    }
}