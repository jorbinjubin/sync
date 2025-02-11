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
     * Creates a new instance of the House class
     * @param   n  -> House number on its street
     * @param   s  ->  Street name
     * @param   c  ->  City name
     * @param   pv -> Province name
     * @param   si -> Size of the house
     * @param   d  -> whether or not the house is detached
     * @param   l  -> number of floors in the house
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
     * Prints out information about the house
     */
    public void displayAddress(){
        System.out.println(street_num + " " + street);
        System.out.println(city + ", " + province);
        System.out.println(postal_code);
    }
} // House class