public class Person {

    private String fName;
    private String lName;
    private String DOB;
    private double height;
    private double weight;

    public Person(String first, String last, String dob, double h, double w) {
        fName = first;
        lName = last;
        DOB = dob; //format is mm/dd/yyyy
        height = h;
        weight = w;
    }    

    /* 
     * Sets the name of the person
     * @param   first -> New first name of person
     * @param   last  -> New last name of person
     */
    public void setName (String first, String last) {
        fName = first;
        lName = last;
    }
    /*
     * Gets the name of the person
     * @return the name of the person
     */
    public String getName() {
        return fName + " " + lName;
    }
    /*
     * Sets the weight of the persom
     * @param   w -> New weight of person
     * @return  whether or not the operation was successful
     */
    public boolean setWeight(double w) {
        weight = w;
        return true;
    }

    /*
     * Sets the height of the person
     * @param w -> New height of person
     * @return  whether or not the operation was successful
     */
    public boolean setHeight(double h) {
        height = h;
        return true;
    }

    /*
     * Gets the weight of the person
     * @return the weight of the person
     */
    public double getWeight() {
        return weight;
    }

    /*
     * Gets the height of the person
     * @return the height of the person
     */
    public double getHeight() {
        return height;
    }

    /*
     * Gets the date of birth
     * @return  the date of birth
     */
    public String getDOB() {
        if(DOB==null) {
            throw new IllegalStateException("No date of birth assigned");
        }
        return DOB;
    }

    /*
     * Gets the year of birth
     * @return year of birth of person
     * @throws IllegalStateException if no date of birth has been assigned or format is invalid.
     */
    public String getDOB_year() {
        if(DOB==null) {
            throw new IllegalStateException("No date of birth assigned");
        }
        try {
            return DOB.substring(7);
        } catch(IndexOutOfBoundsException iobe) {
            throw new IllegalStateException("Invalid date of birth format.");
        }
        
    }

    /*
     * Gets the month of birth
     * @return month of birth of person
     * @throws IllegalStateException if no date of birth has been assigned or format is invalid.
     */
    public String getDOB_month() {
        if(DOB==null) {
            throw new IllegalStateException("No date of birth assigned");
        }
        try {
            return DOB.substring(0,2);
        } catch(IndexOutOfBoundsException iobe) {
            throw new IllegalStateException("Invalid date of birth format.");
        }
    }

    /*
     * Gets the day of birth
     * @return day of birth of person
     * @throws IllegalStateException if no date of birth has been assigned or format is invalid.
     */
    public String getDOB_day() {
        if(DOB==null) {
            throw new IllegalStateException("No date of birth assigned");
        }
        try {
            return DOB.substring(4, 6);
        } catch(IndexOutOfBoundsException iobe) {
            throw new IllegalStateException("Invalid date of birth format.");
        }
    }

} // Person class