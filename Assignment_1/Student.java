public class Student {
    public String name;
    public int mark1;
    public int mark2;
    public double average;

    /*
     * Creates new instance of Student class
     * @param   String n -> Name of created student
     */
    public Student(String n) {
        name = n;
        mark1 = 0;
        mark2 = 0;
        average = 0.0;
    }

    /*
     * Sets the marks of the student
     * @param   x -> first mark input
     * @param   y -> second mark input
     */
    public void setMarks(int x, int y) {
        mark1 = x;
        mark2 = y;
    }

    /*
     * Calculates the average of the 2 given marks 
     */

    public void calcAverage() {
        average = (mark1 + mark2) / 2.0;
    }

    /*
     * Creates a message containing the average of the student
     * 
     * @return message of the mark the student got
     */
    public String message() {
        return name + " You got an " + average;
    }
} // Student class