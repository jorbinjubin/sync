public class Car {
    private String brand;
    private String model;
    private int kilometres;
    private double gas;
    private double tankCapacity;
    /*
     * Constructor 'Car'
     * @param String b -> brand of car
     * @param String m -> model of car
     * @param String g -> gas level of car
     * @param String tCap -> gas tank capacity of car
     */
    public Car(String b, String m, double g, double tCap) {
        brand = b;
        model = m;
        kilometres = 0;
        gas = g;
        tankCapacity = tCap;
    }

    /*
     * Method 'drive'
     * Description: Drives a certain distance, consuming fuel and increasing kilometers driven
     * @param double distance -> distance to be traveled
     */
    public void drive(double distance) {
        kilometres += distance;
        gas -= distance / 5.0;
    }
    
    /*
     * Method 'gasUp'
     * Description: refills the gas tank to full
     */
    public void gasUp() {
        gas = tankCapacity;
    }
} // Car class