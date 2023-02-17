public class Ingredient {

    // VARS:
    private float amount;
    private String unit;
    private String name;


    // CONSTRUCTORS

    public Ingredient(){};
    public Ingredient(float amount, String unit, String name){
        this.amount = amount;
        this.unit = unit;
        this.name = name;
    }

    //======================================= getters
    public float getAmount(){
        return amount;
    }
    public String getUnit(){
        return unit;
    }
    public String getName(){
        return name;
    }
    //======================================= setters
    public void setAmount(float nwAmount){
        this.amount = nwAmount;
    }
    public void setunit(String nwUnit){
        this.unit = nwUnit;
    }
    public void setName(String nwName){
        this.name = nwName;
    }



}
