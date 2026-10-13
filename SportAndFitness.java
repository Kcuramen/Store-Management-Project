// Represents sport and fitness as the main class
public class SportAndFitness{
  private String name;
  private double price;
  private boolean beingUsed;


  //no-argument constructor 
  public SportAndFitness(){
    this("No name", 0.0, false);
  }

  // Parameterized Constructor 
  public SportAndFitness(String name, double price, boolean beingUsed){
    this.name = name;
    this.price = price;
    this.beingUsed = beingUsed;
  }

  //Accessor Method for name
  public String getName(){
    return name;
  }
//Mutator method
public void setName(String name){
  this.name = name;
}

  
  //Accessor Method for Price
  public double getPrice(){
    return price;
  }
//Mutator Method
  public void setPrice(Double price){
    this.price = price;
  }
// Accessor method for beingUsed
  public boolean getBeingUsed(){
    return beingUsed;
  }

  //Mutator method
public void setBeingUsed(boolean beingUsed){
  this.beingUsed = beingUsed;
    }

  // ToString() method override
  public String toString(){
    return "Name: " + name + "\nPrice: " + price + "\nIs it being used? " + beingUsed;
  
  }
}