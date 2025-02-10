public class Student {
    public String name;
    public int mark1;
    public int mark2;
    public double average;

    /*
     * Constructor 'Student'
     * @param   String n -> Name of created student
     */
    public Student(String n) {
        name = n;
        mark1 = 0;
        mark2 = 0;
        average = 0.0;
    }

    /*
     * Method 'setMarks'
     * Description: sets the marks of the student
     * @param   int x -> first mark input
     * @param   int y -> second mark input
     */
    public void setMarks(int x, int y) {
        mark1 = x;
        mark2 = y;
    }

    /*
     * Method 'calcAverage'
     * Description: Calculates the average of the 2 given marks 
     */

    public void calcAverage() {
        average = (mark1 + mark2) / 2.0;
    }

    /*
     * Method 'message'
     * Description: Creates a message containing the average of the student
     * @return String -> Message of the mark the stuent got
     */
    public String message() {
        return name + " You got an " + average;
    }
} // Student class