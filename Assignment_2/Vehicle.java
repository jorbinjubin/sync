public class Vehicle {
    private String manufacturer;
    private String type;
    private String model;
    private short year;
    private String color;
    private byte numOfDoors;
    private float gasTankSize;
    private float gas;
    private int km;

    /*
     * Creates new instance of the Vehicle class
     * @param   typ -> type of vehicle
     * @param   manu-> manufacturer of vehicle
     * @param   mod -> model of the vehicle
     * @param   yea -> year of the vehicle
     * @param   col -> color of the vehicle
     * @param nDoors-> number of doors of the vehicle
     * @param  tankS-> tank size of the vehicle
     */
    public Vehicle(String typ, String manu, String mod, short yea, String col, byte nDoors, float tankS) {
        type = typ;
        manufacturer = manu;
        model = mod;
        year = yea;
        color = col;
        numOfDoors = nDoors;
        gasTankSize = tankS;
        gas = 0.0f;
        km = 0;
    }

    /*
     * Changes the color of the car
     * @param color -> the new color of the car
     */
    public void paint(String color) {
        this.color = color;
    }

    /*
     * Refills the gas tank of the car
     * @param   liters -> number of liters to fill with
     * @throws IllegalArgumentException if 'liters' is greater than the capacity of the tank
     */
    public void gasUp(int liters) {
        if(liters<0) {
            throw new IllegalArgumentException("Cannot put negative fuel into car");
        } else if(liters>(gasTankSize-gas)) {
            throw new IllegalArgumentException("Cannot fill with more fuel than remaining space");
        } else {
            gas += liters;
        }
    }

    /*
     * 
     */
}