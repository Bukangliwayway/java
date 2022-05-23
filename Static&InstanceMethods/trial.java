// Trial for access modifier private and public
// Static and Instance Properties
// And Class calling

public class trial {
  public static void main(String[] args) {
    division s = new division(); // Class Calling
    division.message(); // Calling a Static Method
    s.setAnB(1, 4); // Setting Values that are Private
    System.out.println(s.divide()); // Calling an Instance Method
  }
}