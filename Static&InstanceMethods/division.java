public class division {
  // Private Variables
  private float a, b; 
  // Instance Methods
  public float divide(){
    return (this.a / this.b);
  }
  // For setting private variables
  public void setAnB(float a, float b){
    this.a = a;
    this.b = b;
  }
  // Static / Class Method
  static void message(){
    System.out.println("Division");
  }

}