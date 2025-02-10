public class Animal{
    private String name;
    private boolean tired;
    private boolean hungry;
    private double weight;
    /*
     * Constructor 'Animal'
     * @param   String n -> name of animal
     * @param   double w -> weight of the animal
     */
    public Animal(String n, double w){
        name = n;
        tired = true;
        hungry = true;
        weight = w;
    }

    /*
     * Method 'feed'
     * Description: Feeds the animal, making it not hungry. 
     * @param   String v -> type of food to feed the animal
     *          If v is vegetable, its weight increases by 2
     *          If v is mean, its weight increases by 4
     *          Otherwise, its weight decreases by 1
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
     * Method 'sleep'
     * Description: makes the animal not tired and lighter by 3 weight.
     */
    public void sleep(){
        tired = false;
        weight -=3;
    }
} // Animal class