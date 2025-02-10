public class House {
    private int street_num;
    private String street;
    private String city;
    private String province;
    private String postal_code;
    private double size;
    private boolean detached;
    private int stories;

    /*
     * Constructor 'House'
     * @param   int n -> House number on its street
     * @param   String s ->  Street name
     * @param   String c ->  City name
     * @param   String pv -> Province name
     * @param   double si -> Size of the house
     * @param   boolean d -> whether or not the house is detached
     * @param   int l -> number of floors in the house
     */
    public House(int n, String s, String c, String pv, String p, double si, boolean d, int l) {
        street_num = n;
        street = s;
        city = c;
        province = pv;
        postal_code = p;
        size = si;
        detached = d;
        stories = l;
    }

    /*
     * Method 'displayAddress'
     * Description: Prints out information about the house
     */
    public void displayAddress(){
        System.out.println(street_num + " " + street);
        System.out.println(city + ", " + province);
        System.out.println(postal_code);
    }
} // House class