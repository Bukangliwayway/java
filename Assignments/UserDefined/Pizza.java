public class Pizza {
  private String toppings;
  private int diameter;
  public void setFields(String toppings, int diameter){
    this.toppings = toppings;
    this.diameter = diameter;
  }
  public String getToppings(){
    return this.toppings;
  }
  public int getDiameter(){
    return this.diameter;
  }
}
