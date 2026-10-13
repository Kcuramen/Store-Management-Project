//Represents FitnessEquipment
public class FitnessEquipment extends SportAndFitness{
  private int weight;


  public FitnessEquipment(){
    super("no name", 25.0 , false);
  }

  public FitnessEquipment (String name, int weight){
    super("Fitness Equipment:" + name, 25.0 + weight * 5, false);
    this.weight = weight;
  }

  
  public FitnessEquipment(String name){
    super(name, 25.0, false);
  }

  
  public int getWeight(){
    return weight;
  }
public void setWeight(int weight){
  this.weight = weight;
}
   public String toString() {
    return super.toString() + " (" + weight +"Lb)" + "\nPrice $" + getPrice();
  }
}