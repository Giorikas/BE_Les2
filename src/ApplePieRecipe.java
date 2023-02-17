import java.util.ArrayList;
public class ApplePieRecipe {

Ingredient roomboter = new Ingredient(200f, "g", "roomboter");
Ingredient suikerBastardWit = new Ingredient(200f, "g", "witte bastard suiker");
Ingredient bakmeelZelfrijzend = new Ingredient(400f, "g", "zelfrijzend bakmeel");
Ingredient ei = new Ingredient(1f, "", "ei");
Ingredient vanillesuiker = new Ingredient(8f, "g", "vanillesuiker");
Ingredient zout = new Ingredient(0.5f, "theelepel", "roomboter");
Ingredient goudrenet = new Ingredient(1.5f, "kg", "goudrenetten");
Ingredient suikerKristal = new Ingredient(75f, "g", "kristal suiker");
Ingredient kaneel = new Ingredient(3f, "theelepels", "kaneel");
Ingredient paneermeel = new Ingredient(15f, "g", "paneermeel");

public Ingredient[] ingredientList = {roomboter, suikerBastardWit, bakmeelZelfrijzend,ei, vanillesuiker,zout,goudrenet,suikerKristal,kaneel,paneermeel};
    public String[] arrStepsHardCodedCooking = {
        "Verwarm de oven van te voren op 170 graden Celsius (boven en onderwarmte)",
        "Klop het ei los en verdeel deze in twee delen. De ene helft is voor het deeg, het andere deel is voor het bestrijken van de appeltaart.",
        "Meng de boter, bastard suiker, zelfrijzend bakmeel, één helft van het ei, vanille suiker en een snufje zout tot een stevig deeg en verdeel deze in 3 gelijke delen.",
        "Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel.",
        "Vet de springvorm in en bestrooi deze met bloem.",
        "Gebruik een deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van het deeg om de rand van de springvorm te bekleden. Strooi het paneermeel op de bodem van de beklede vorm. De paneermeel neemt het vocht van de appels op.",
        "Doe de heft van de appels in de vorm en strooi hier 1/3 van het kaneel-suiker mengsel overheen. Meng de ander helft van de appels met het overgebleven kaneel-suiker mengsel en leg deze in de vorm.",
        "Rol het laatste deel van de deeg uit tot een dunne lap en snij stroken van ongeveer 1 cm breed.",
        "Leg de stroken kruislings op de appeltaart. Met wat extra deegstroken werk je de rand rondom af. Gebruik het overgebleven ei om de bovenkant van het deeg te bestrijken.",
        "Zet de taart iets onder het midden van de oven. Bak de taart in 60 minuten op 170 graden Celsius (boven en onderwarmte) gaar en goudbruin."};

public ArrayList<String> stepsCooking = new ArrayList<String>();

    public String strFromArrayString(String[] arrString, int i){
        //System.out.println("strArrayString"); //chk komt app tot hier?
        return arrString[i];
    }

    public void addStrToArrayList(String str, ArrayList<String> arrListStr, int i){
        //System.out.println("addStrToArrayList"); //chk komt app tot hier?
        arrListStr.add(i, str);
    }

    public void makeCookingSteps(){
        //System.out.println("makeCookingSteps"); //chk komt app tot hier?
        for (int i =0; i< arrStepsHardCodedCooking.length;i++){
            String str = strFromArrayString(arrStepsHardCodedCooking, i);
            addStrToArrayList(str, stepsCooking, i);
        };
    }

    public void printCookingSteps(){
        for (int i =0; i< stepsCooking.size();i++){
            System.out.println(stepsCooking.get(i));
        };
    }
    public void printIngredients(){
        for (Ingredient ing: ingredientList)
              { System.out.println(ing.getAmount() + " " + ing.getUnit() + " " + ing.getName());
        }

    }

}
