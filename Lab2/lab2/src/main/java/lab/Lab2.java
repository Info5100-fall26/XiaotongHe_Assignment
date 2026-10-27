/*The program describes animals.
Animals can be birds, land, fish animals
Design and develop a program that describes the animals using their common features (like typical size, typical weight, predator or vegetarian and some other features) and features specific for fish, birds, and land animals only (like species name, number of legs, wingspan, number of fins, etc.).
Classes “Bird”, “LandAnimal”, and “Fish” are derived from class “Animals” */

package lab;

public class Lab2 {

    static abstract class Animals{
            private String name;
            private double typicalSize;    
            private double typicalWeight;  
            private boolean predator;      // true = predator, false = vegetarian

            public Animals(String name, double typicalSize, double typicalWeight, boolean predator){
                this.name = name;
                this.typicalSize = typicalSize;
                this.typicalWeight = typicalWeight;
                this.predator = predator;
            }
            
            public String getName(){return name;}
            public double getTypicalSize()  { return typicalSize; }
            public double getTypicalWeight(){ return typicalWeight; }
            public boolean isPredator()     { return predator; }

            public String getDiet(boolean predator){
                if(predator) return "Predator"; else return "Vegetarian";
            }

            public abstract String move();

              public String describe() {
                return "Species: " + name
                 + "\n  Typical size: " + typicalSize + " cm"
                 + "\n  Typical weight: " + typicalWeight + " kg"
                 + "\n  Predator or Vegetarian: " + getDiet(predator)
                 + "\n  Moves by: " + move();
            }
        }

    static class Bird extends Animals{
            private double wingspan;  
            private boolean canFly;
 
            public Bird(String speciesName, double typicalSize, double typicalWeight,
                boolean predator, double wingspan, boolean canFly) {
            super(speciesName, typicalSize, typicalWeight, predator);
        this.wingspan = wingspan;
        this.canFly = canFly;
    }
 
            public double getWingspan() { return wingspan; }
            public boolean canFly()     { return canFly; }
 
            @Override
            public String move() {
                if(canFly) return "flying"; else return "walking/running";
            }
 
            @Override
            public String describe() {
             return super.describe()
             + "\n  Type: Bird"
             + "\n  Wingspan: " + wingspan + "cm";
            }
    }
        static class LandAnimal extends Animals{
            private int numberofLegs;

            public LandAnimal(String name, double typicalSize, double typicalWeight,
                boolean predator,int numberofLegs){
                    super(name,typicalSize, typicalWeight, predator);
                    this.numberofLegs = numberofLegs;
                }

            public int getNumberofLegs(){return numberofLegs;}

            @Override 
            public String move(){return "walking/running with " + numberofLegs + "legs.";}

            @Override 
            public String describe(){
                return super.describe()
                + "\n  Type: Land Animal";
            }



        }
        static class Fish extends Animals{
            private int numberofFins;
            private String waterType;

            public Fish(String name, double typicalSize, double typicalWeight,
                boolean predator, int numberofFins, String waterType){
                    super(name,typicalSize, typicalWeight, predator);
                    this.numberofFins = numberofFins;
                    this.waterType = waterType;

                }

            public int getNumberofFins(){return numberofFins; }
            public String waterType(){return waterType;}

            @Override 
            public String move(){
                return "swimming";
            }

            @Override
            public String describe(){
                return super.describe()
                +"\n Type: Fish"
                +"\n Number of fins: " + numberofFins
                +"\n Water Type: " +waterType;
            }
        }




    public static void main( String[] args ){
        
        Animals[] Animals = {new Bird("Eagle",90,5,true,220,true),
        new Bird("Ostrich", 230, 110, false, 200, false),
        new LandAnimal("Lion", 200, 190, true, 4),
        new LandAnimal("Rabbit", 40, 2.0, false, 4),
        new Fish("Great White Shark", 450, 1000, true, 5, "saltwater"),
        new Fish("Goldfish", 15, 0.3, false, 5, "freshwater")
        };

        System.out.println("Animals in the list:");
        for(Animals animal: Animals){
            System.out.print(animal.getName()+" ");
        }

        System.out.println("\n Description of the animals");
        for(Animals animal: Animals){
            System.out.println(animal.describe());
        }


    
}
}