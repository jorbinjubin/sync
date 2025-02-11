public class Animal{
    private String name;
    private boolean tired;
    private boolean hungry;
    private double weight;
    /*
     * Creates a new instance of the Animal class
     * @param   n -> name of animal
     * @param   w -> weight of the animal
     */
    public Animal(String n, double w){
        name = n;
        tired = true;
        hungry = true;
        weight = w;
    }

    /*
     * Feeds the animal, making it not hungry. 
     * @param   v -> type of food to feed the animal
     */
    public void feed(String v){
        hungry = false;
    if (v.equals("vegetables"))
        weight +=2;
    else if (v.equals("meat"))
        weight +=4;
    else
        weight +=1;
    }

    /*
     * Makes the animal not tired and lighter by 3 weight.
     */
    public void sleep(){
        tired = false;
        weight -=3;
    }
} // Animal class