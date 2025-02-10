import java.io.*;
import java.util.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //Students
        Student[] arr = new Student[5];
        String[] fLetter = {"B", "C", "D", "F", "G"};
        for(int i = 0; i < 5; i++) {
            arr[i] = new Student(fLetter[i] + "ark");
        }
        arr[0].setMarks(80, 82);
        arr[1].setMarks(90, 89);
        arr[2].setMarks(70, 62);
        arr[3].setMarks(90, 100);
        arr[4].setMarks(77, 88);

        Student[] classList = new Student[10];
        for(int i = 0; i < 5; i++) {
            classList[i] = arr[i];
        }
        classList[8] = new Student("Yustin");
        classList[8].setMarks(95, 98);
        for(Student s : classList) {
            if(s!=null) {
                s.calcAverage();
            }
        }
        int sAvg = 0;
        for(Student s : classList) {
            if(s!=null)
                sAvg += s.average;
        }
        sAvg/=6.0;
        System.out.println("Average mark of all students: " + sAvg + "%.");
        System.out.println();

        //Cars
        Car myCar = new Car("Nissan", "Altima", 38.4, 65.0);
        Car bobCar = new Car("Lexus", "RX350", 54.82, 85.7);
        myCar.drive(10);
        System.out.println("Driving myCar to school..." );
        bobCar.drive(5);
        System.out.println("Driving bobCar to gas station...");
        bobCar.gasUp();

        //House
        House barn = new House(123, "Joe Biden", "Ohio", "USA", "B4N4N4",333.3, true, 1);
        barn.displayAddress();
        House whiteHouse = new House(1600, "Pensylvannia Ave.", "Washington", "USA", "A1A1A1", 10_000, true, 8 );
        whiteHouse.displayAddress();

        //Animal
    }
}
