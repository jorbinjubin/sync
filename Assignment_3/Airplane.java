
public class Airplane {

    private int gasLevel; // how much gas the plane has, max = 100
    private String landingGear; //status of the landing gear, "Up" or "Down"
    private String doorStatus; //status of the door, "Open" or "Closed"
    private int passengers; //number of passengers on the plane

    public Airplane() { //constructor
        gasLevel = 100;
        landingGear = "Down";
        doorStatus = "Open";
        passengers = 100;
    }

    public void openDoor() { 
        doorStatus = "Open";
    }

    public void closeDoor() {
        doorStatus = "Closed";
    }

    public void fillUp() {
        gasLevel = 100;
    }

    public void takeOff() {
        gasLevel -= 30;
    }

    public void doneTakeOff() {
        landingGear = "Up";
    }

    public void normalFlight(int gasUsed) {
        gasLevel -= gasUsed;
    }

    public void prepLanding() {
        landingGear = "Down";
    }

    public void land() {
        gasLevel -= 15;
    }

    public void loadPass(int num) {
        passengers += num;
    }

    public void unloadPass(int num) {
        passengers -= num;
    }

    public int getGasLevel() {
        return gasLevel;
    }

    public String getDoorStatus() {
        return doorStatus;
    }

    public int getPassengers() {
        return passengers;
    }

    public String getLandingGear() {
        return landingGear;
    }
}