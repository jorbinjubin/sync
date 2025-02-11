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
     * Drives the car
     * @param distance -> distance to drive the car
     * @return returns whether or not the destination was reached successfully with enough gas
     */
    public boolean drive(int distance) {
        km += distance;
        gas-=distance/20.0;
        if(gas<=0) {
            gas = 0;
            return false;
        } else {
            return true;
        }
    }

    /* 
     * Gets the type of the car
     * @return the type of the car
     */
    public String getType() {
        return type;
    }

    /*
     * Gets the manufacturer of the car
     * @return the manufacturer of the car
     */
    public String getManufact() {
        return manufacturer;
    }

    /*
     * Gets the model of the car
     * @return the model of the car
     */
    public String getModel() {
        return model;
    }

    /*
     * Gets the year of the car
     * @return the year of the car
     */
    public short getYear() {
        return year;
    }

    /*
     * Gets the color  of the car
     * @return the color of the car
     */
    public String getColor() {
        return color;
    }

    /*
     * Gets the number of doors of the car
     * @return the number of doors of the car
     */
    public byte getDoors() {
        return numOfDoors;
    }

    /*
     * Gets the tank size of the car
     * @return the tank size of the car
     */
    public float getTankSize() {
        return gasTankSize;
    }

    /*
     * Gets the amount of gas left in the car
     * @return the amount of gas left in the car
     */
    public float getGasLeft() {
        return gas;
    }
}