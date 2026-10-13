public class WaterSport extends SportAndFitness {
  private boolean canFloat;
  private int duration;

  public WaterSport() {
    super("no name", 15.0, false);
  }

  public WaterSport(String name , boolean canFloat, int duration){
    super(name , 0.0, false);
    this.canFloat = canFloat;
    this.duration = duration; 
    double newPrice = 15.0;
      if(canFloat) {
      newPrice *= 1.5;
        }
    newPrice += duration * 0.05;
    setPrice(newPrice);
        }
  
   public int getDuration() {
    return duration;
  }
  
  public void setDuration(int duration) {
    this.duration = duration;
  } 
  
 public boolean getCanFloat() {
    return canFloat;
  }
  
  /**
   * Mutator Method for height
   */
  public void setCanFloat(boolean canFloat) {
    this.canFloat = canFloat;
  }
  public String toString(){
    boolean canFloat = true;
    if (canFloat) {
      canFloat =  true;     
  }
    return super.toString() + "(" + duration + "minutes)" +canFloat + "\nPrice $" + getPrice();
  }   
  
  
}
        
    
  
