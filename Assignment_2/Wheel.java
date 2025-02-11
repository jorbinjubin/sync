public class Wheel {
    private String brand;
    private String model;
    private int size;
    private String season;
    private int KM_usage;
    private String tread_condition;
    /*
     * Creates a new instance of the Wheel object
     * @param   br  -> brand of the wheel
     * @param   mod -> model of the wheel
     * @param   siz -> size of the wheel
     * @param   sea -> season of the wheel
     */
    public Wheel(String br, String mod, int siz, String sea) {
        brand = br;
        model = mod;
        size = siz;
        season = sea;
        KM_usage = 0;   //set default value
        tread_condition = "new"; //set default value
    }

    /*
     * Updates the KM_usage
     * @param   km -> amount of distance the wheel was used for
     * @throws  IllegalArgumentException if km is negative
     */
    public void update_KM_usage(int km) {
        if(km<0) {
            throw new IllegalArgumentException("km cannot be negative");
        }
        KM_usage += km;
        if(KM_usage > 80000) {
            tread_condition = "dangerous";
        } else if(KM_usage > 75000) {
            tread_condition = "bad";
        } else if(KM_usage > 70000) {
            tread_condition = "needs changing";
        } else if(KM_usage > 10000) {
            tread_condition = "good";
        } else {
            tread_condition = "new";
        }
    }

    /*
     * Gets the brand of the wheel
     * @return brand of the wheel
     */
    public String getBrand() {
        return brand;
    }

    /*
     * Gets the model of the wheel
     * @return model of the wheel
     */
    public String getModel() {
        return model;
    }

    /*
     * Gets the size of the wheel
     * @return size of the wheel
     */
    public int getSize() {
        return size;
    }

    /*
     * Gets the season of the wheel
     * @return season of the wheel
     */
    public String getSeason() {
        return season;
    }

    /*
     * Gets the KM_usage of the wheel
     * @return KM_usage of the wheel
     */
    public int getKM() {
        return KM_usage;
    }

    /*
     * Gets the Tread Condition of the wheel
     * @return Tread Condition of the wheel
     */
    public String getTreadCondition() {
        return tread_condition;
    }

}
