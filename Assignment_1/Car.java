public class Car {
    private String brand;
    private String model;
    private int kilometres;
    private double gas;
    private double tankCapacity;

    /*
     * Creates a new instance of the Car class
     * @param b     -> brand of car
     * @param m     -> model of car
     * @param g     -> gas level of car
     * @param tCap  -> gas tank capacity of car
     */
    public Car(String b, String m, double g, double tCap) {
        brand = b;
        model = m;
        kilometres = 0;
        gas = g;
        tankCapacity = tCap;
    }

    /*
     * Drives a certain distance, consuming fuel and increasing kilometers driven
     * @param distance -> distance to be traveled
     */
    public void drive(double distance) {
        kilometres += distance;
        gas -= distance / 5.0;
    }
    
    /*
     * Refills the gas tank to full
     */
    public void gasUp() {
        gas = tankCapacity;
    }
} // Car class