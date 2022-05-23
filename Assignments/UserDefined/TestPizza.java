import javax.swing.JOptionPane;

public class TestPizza {
  public static void main(String[] args) {
    Pizza newPizza = new Pizza();
    String toppings = "Marshmallow";
    int diameter = 12;
    newPizza.setFields(toppings, diameter);
    JOptionPane.showMessageDialog(null, "Toppings:  " + newPizza.getToppings() + "\nDiameter:  " + newPizza.getDiameter());
  }
}
