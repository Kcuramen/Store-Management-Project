import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {

    // Creates a Scanner object - feel free to delete if not using!
    Scanner input = new Scanner(System.in);
  boolean didBuyEquipment = false;

    System.out.println("Welcome to the Sport And Fitness! What would you like to do today?");
    System.out.println("1. Sport Equipments");
    System.out.println("2. Fitness Equipemnt");
    System.out.println("3. Water Sport");
    System.out.print("> "); 
    int userSelection = input.nextInt();

 
    if (userSelection == 1) {
      System.out.println("Whats the name of the Equipment?");
      System.out.print("> ");  
      String SportEquipmentName = input.nextLine();
      SportEquipmentName = input.nextLine(); 
      System.out.println("How much equipment");
      System.out.print("> ");  
      int SportnumOfEquipment = input.nextInt();

   
      System.out.println(); 
      SportEquipment newSportEquipment = new SportEquipment(SportEquipmentName, SportnumOfEquipment);
      System.out.println("Here's your Sport Equipment:");
      System.out.println();
      System.out.println(newSportEquipment);

    
      didBuyEquipment = true;
    }
    
  
    if (userSelection == 2) {
      System.out.println("Whats the name of the Fitness Equipment?");
      System.out.print("> ");  
      String fitnessName = input.nextLine();
      fitnessName = input.nextLine(); 
      System.out.println("How many pounds?");
      System.out.print("> ");  
      int fitnessWeight = input.nextInt();
     
      
      // create the image
      System.out.println(); 
      FitnessEquipment newFitness = new FitnessEquipment(fitnessName, fitnessWeight);
      System.out.println("Here's your Equipment:");
      System.out.println(); 
      System.out.println(newFitness);

      // for corect goodbye message
      didBuyEquipment = true;
    }
    
    
    if (userSelection == 3) {
      System.out.println("Whats the name of Water Sport Equipment?");
      System.out.print("> ");  
      String waterName = input.nextLine();
      waterName = input.nextLine(); // prevents skipping bug in terminal
      
      System.out.println("Whats the duration (in minutes)?");
      System.out.print("> ");  
      int waterDur = input.nextInt();
      System.out.println("Can if FLoat (1 - Yes / 2 - No)?");
      System.out.print("> ");  
      int waterNumCanFloat = input.nextInt();
      boolean waterCanFloat = false;
      if (waterNumCanFloat == 1) {
        waterCanFloat = true;
      }
      
      // create the video
      System.out.println(); // blank line
      WaterSport newWater = new WaterSport(waterName, waterCanFloat, waterDur);
      System.out.println("Here's your Equipment:");
      System.out.println(); // blank line
      System.out.println(newWater);

      // for corect goodbye message
      didBuyEquipment = true;
    }

    System.out.println(); // blank line
    
    // Finishes transaction by saying Goodbye based on if they purchased anything
    if (didBuyEquipment){
      System.out.println("Thank you for your purchase. Come again!");
    } else {
      System.out.println("Thank for visiting. Maybe next time you'll buy something!");
    }
     





    // Closes the Scanner object
    input.close();
    }
}