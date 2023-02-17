## Backend - Les 2 ##
### Versiebeheer ###
<kbd>0.0.1</kbd> Eerste opzet. 

DISCLAIMER: Code hieronder vermeld is geschreven voor daadwerkelijk te testen en zit waarschijnlijk vol fouten. Werkende code, althans _**hopelijk**_ werkende code in de daarvoor gebruikte bestanden.

### Opdracht ###

Het doel van de oefening is om te oefenen met klassen en methodes.\
De uitgebreide opdrachtomschrijving
is [hier](https://github.com/hogeschoolnovi/backend-java-objecten-en-klassen/blob/4d967f9b02b76ea1c00e3682208b0e0f6a747035/README.md)
te vinden.

### Opdrachtonderdelen en stappenplan: 
#### _Basisstappen:_ 1, 2, 3, etc. &emsp; _Extra- / Bonusopdrachten en eigen aanvullingen:_ B1, B2, etc. 

- [X] 1) New Project opstarten. <kbd>0.0.1</kbd><br><br>
- [x] 2) Klassen aanmaken <kbd>0.0.1</kbd>:
    - [x] Ingredient 
    - [x] ApplePieRecipe
    - [x] Main <br><br>
- [x] 3) In Main: Methodes: <kbd>0.0.1</kbd>
    - [x] ```public static main``` <br><br>
- [x] 4,5) In Ingredient: 3 Variabelen: <kbd>0.0.1</kbd>
    - [x] `private float amount;`
    - [x] `private String unit;`
    - [x] `private String name;`
      <br><br>
- [x] 6) In Ingredient: <kbd>0.0.1</kbd>
    - [x] Constructors:\
    &emsp;`public Ingredient(){};` en 
    `public Ingredient(float amount, String unit, String name){};` 
    - [x] getter, setter:
      ```java
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
      ```

<details>
<summary>
&emsp;&emsp;7) In ApplePieRecipe de volgende objecten plaatsen met " " om de strings en _f_ achter de floats: <kbd>0.0.1</kbd>
</summary>

- [x] `Ingredient roomboter = new Ingredient(200, g, roomboter);`
- [x] `Ingredient suikerBastardWit = new Ingredient(200, g, witte bastard suiker);`
- [x] `Ingredient bakmeelZelfrijzend = new Ingredient(400, g, zelfrijzend bakmeel);`
- [x] `Ingredient ei = new Ingredient(1, "", ei);`
- [x] `Ingredient vanillesuiker = new Ingredient(8, g, vanillesuiker);`
- [x] `Ingredient zout = new Ingredient(0.5, theelepel, roomboter);`
- [x] `Ingredient goudreinet = new Ingredient(1.5, kg, goudreinetten);`
- [x] `Ingredient suikerKristal = new Ingredient(75, g, kristal suiker);`
- [x] `Ingredient kaneel = new Ingredient(3, theelepels, kaneel);`
- [x] `Ingredient paneermeel = new Ingredient(15, g, paneermeel);` 

 </details>

&emsp; &cross; 
<span>8,9) <strike>Individuele methodes aanmaken om bereidingsstappen individueel weer te geven.</strike></span>

- [x] B1) Een methode maken die alle stappen uitprint uit een array/arraylist.<kbd>0.0.1</kbd>\ 
  - [x] Variabele `arrStepsHardCodedCooking` type `String[]` aanmaken met de stappen.
  - [x] Het lege object `ArrayList<String> stepsCooking` aanmaken. 
  - [x] Methodes schrijven voor het inlezen van de array en het schrijven naar de arraylist\
    \
   _Het principe:_
    ```
    Loop van :
    Methode 1: arrStepsHardCodedCooking[i] inlezen --> string 'i' aanbieden aan Methode 2`
    Methode 2: string aan stepsCooking[i] toevoegen. 
    Einde loop.
    ```
    \
    _De array met de stappen. en de lege ArrayList:_
    ```java
    public String[] arrStepsHardCodedCooking = {
    "Verwarm de oven van te voren op 170 graden Celsius (boven en onderwarmte)",
    "Klop het ei los en verdeel deze in twee delen. De ene helft is voor het deeg, het andere deel is voor het bestrijken van de appeltaart.",
    "Meng de boter, bastard suiker, zelfrijzend bakmeel, één helft van het ei, vanille suiker en een snufje zout tot een stevig deeg en verdeel deze in 3 gelijke delen.", 
    "Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel.",
    "Vet de springvorm in en bestrooi deze met bloem.",
    "Gebruik een deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van het deeg om de rand van de springvorm te bekleden. Strooi het paneermeel op de bodem van de beklede vorm. De paneermeel neemt het vocht van de appels op.",
    "Doe de heft van de appels in de vorm en strooi hier 1/3 van het kaneel-suiker mengsel overheen. Meng de ander helft van de appels met het overgebleven kaneel-suiker mengsel en leg deze in de vorm.",
    "Rol het laatste deel van de deeg uit tot een dunne lap en snij stroken van ongeveer 1 cm breed."
    "Leg de stroken kuislings op de appeltaart. Met wat extra deegstroken werk je de rand rondom af. Gebruik het overgebleven ei om de bovenkant van het deeg te bestrijken.",
    "Zet de taart iets onder het midden van de oven. Bak de taart in 60 minuten op 170 graden Celsius (boven en onderwarmte) gaar en goudbruin."};
    
    public ArrayList<String> stepsCooking = new ArrayList<String>(); //import.util.ArrayList niet vergeten.
    ```
    \
  _Het uitlezen van de array, (aan)vullen van de ArrayList en de loop._
    ```java
    public String strFromArrayString(String[] arrString, int i){
        System.out.println("strArrayString"); //chk komt app tot hier?
        return arrString[i];
    }
    ```
    ```java
    public void addStrToArrayList(String str, ArrayList<String> arrListStr<String>, int i){
        System.out.println("addStrToArrayList"); //chk komt app tot hier?        
        arrListStr.add(str,i);
    }
    ```
    ```java
    public void makeCookingSteps(){  
        System.out.println("makeCookingSteps"); //chk komt app tot hier?
        for (int i =0; i< arrStepsHardCodedCooking.length;i++){
            String str = strArrayString(arrStepsHardCodedCooking, i);
            addStrToArrayList(str, stepsCooking, i);
        };
    }
    ```
  
- [ ] 10, 11) Object aanmaken van het type `ApplePieRecipe` en vanuit `Main` aanroepen. <kbd>0.0.1</kbd>
- [ ] 12, 13) JHx Methode `public void printIngredients()` in `ApplePieRecipe` aanmaken die voor ieder object `System.out.println("object.getAmount() + " " + object.getUnit() + " " + object.getName())` uitvoert. <kbd>0.0.1</kbd>

- [ ] JHx) Methode `printCookingSteps()` aanmaken. <kbd>0.0.1</kbd>  
 \
 _Weergeven van de bereiding van het gerecht._
  ```java
    public void printCookingSteps(){
        for (int i =0; i< stepsCooking.size();i++){
            System.out.println(stepsCooking.get(i));
        };
    }
    
    ```
  \
  _Het proces in `main`._ 
    ```java
    public static void main(String[] arg){
        ApplePieRecipe AppelGebak = new ApplePieRecipe();
        Appelgebak.makeCookingSteps();
        Appelgebak.printIngredients();
        Appelgebak.printCookingSteps();
      }
    ```


### Randvoorwaarden ###

- [X] Drie klassen: Ingredient, ApplePieRecipe, Main; <kbd>0.0.1</kbd>
- [X] Minimaal 3 variabelen, 2 constructors en getters en setters in Ingredient. <kbd>0.0.1</kbd>
- [X] Per ingredient een object instantiëren.<kbd>0.0.1</kbd>
- [ ] ~~~Per stap (bereiding van het gerecht) een methode uit laten voeren die de stap via `System.out.println()` weergeeft op het scherm.~~~
- [X] Minimaal één object van het type `ApplePieRecipe` om de tekst via `System.out.println()` weer geven op het scherm. <kbd>0.0.1</kbd>

### Versiebeheer ###

<kbd>0.0.1</kbd> Eerste opzet. 



