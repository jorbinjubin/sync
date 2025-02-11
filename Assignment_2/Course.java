public class Course {
    private String code;
    private String name;
    private String level;
    private float mark;
    private String status;
    private byte lates;
    private byte absences;

    /*
     * Creates a new instance of the Course class
     * @param   c   -> course code
     * @param   n   -> course name
     * @param   lev -> course level
     */
    public Course(String c, String n, String lev) {
        code = c;
        name = n;
        level = lev;
        mark = 0;
        status = "";
        lates = 0;
        absences = 0;
    }

    /*
     * Gets the letter grade of the mark in the course
     * @return the letter grade of the mark in the course
     */
    public String getMarkG() {
        if(mark>95) return "A+";
        else if(mark > 90) return "A";
        else if(mark > 80) return "B";
        else if(mark > 70) return "C";
        else if(mark > 60) return "D";
        else return "F";
    }

    /*
     * Gets the mark in the course
     * @return the mark in the course
     */
    public float getMark() {
        return mark;
    }

    /*
     * Gets the status in the course
     * @return the status in the course
     */
    public String getStatus() {
        return status;
    }

    /*
     * Gets the level in the course
     * @return the level in the course
     */
    public String getLevel() {
        return level;
    }

    /*
     * Gets the code of the course
     * @return the code of the course
     */
    public String getCode() {
        return code;
    }

    /*
     * Gets the name of the course
     * @return the name of the course
     */
    public String getName() {
        return name;
    }

    /*
     * Gets the number of lates in the course
     * @return the number of lates in the course
     */
    public byte getLates() {
        return lates;
    }

    /*
     * Gets the number of absences in the course
     * @return the number of absences in the course
     */
    public byte getAbsences() {
        return absences;
    }

    /*
     * Adds absences to the course
     * @param   num -> number of absences to add
     */
    public void addAbsences(byte num) {
        absences += num;
    }

    /*
     * Adds lates to the course
     * @param   num -> number of lates to add
     */
    public void addLates(byte num) {
        lates += num;
    }

    /*
     * Sets the mark in the course
     * @param   m   -> new mark to set to
     * @return  whether or not the operation was successfull
     */
    public boolean setMark(float m) {
        if(mark>=0) {
            mark = m;
            return true;
        } else {
            throw new IllegalArgumentException("Grade cannot be negative");
        }
    }
    
    /*
     * Sets the status of the course
     * @param   s   -> new status to set to
     * @return  whether or not the operation was succesful
     */
    public boolean setStatus(String s) {
        if(s.equals("completed") || s.equals("enrolled") || s.equals("failed")) {
            status = s;
            return true;
        } else {
            throw new IllegalArgumentException("Not a valid course status.");
        }
        
    }
}
