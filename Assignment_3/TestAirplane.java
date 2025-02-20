public class TestAirplane { //airplane tester class
    public static void main(String[] args) {
        Airplane A380 = new Airplane();
        System.out.println("Doors are " + A380.getDoorStatus());
        System.out.println("Landing gear is " + A380.getDoorStatus());
        delay(1200);
        System.out.println("Current passenger count: " + A380.getPassengers());
        
        System.out.println("Preparing for takeoff...");
        delay(1500);
        A380.takeOff();

        System.out.println("Takeoff complete, retracting gear...");

        A380.doneTakeOff();
        delay(1400);
        System.out.println("Commencing normal flight...");
        A380.normalFlight(40);
        delay(2200);
        
        System.out.println("Preparing for landing, gas level is " + A380.getGasLevel() + " out of 100");
        A380.prepLanding();
        delay(1400);
        System.out.println("Landing gear is " + A380.getDoorStatus()+ " ,landing...");
        delay(1200);
        A380.land();

        System.out.println("Landed successfully, unloading passengers...");
        A380.unloadPass(80); // 20 crew members stay on board
        delay(1800);
        System.out.println("Loading new passengers...");
        A380.loadPass(1600);
        delay(1800);
        System.out.println("Filling up...");
        delay(1600);
        A380.fillUp();
        System.out.println("Routine end.");
    }
    private static void delay(int ms) {
        try {
            Thread.sleep(ms);
        } catch (Exception e) {
            System.err.println("Exception occured");
        }
    }
}
