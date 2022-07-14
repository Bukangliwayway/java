import java.applet.Applet;
import java.awt.*; 
import javax.swing.*;
public class addApplet extends Applet { 
  double sum;
  public void init(){ 
    String input;
    double no1, no2;
    input = JOptionPane.showInputDialog("Enter first double number");
    no1 = Double.parseDouble(input);
    input = JOptionPane.showInputDialog("Enter second double number");
    no2 = Double.parseDouble(input);
    sum = no1 + no2;
  }
  
  public void paint (Graphics g){ 
    g.drawRect(15,10,270,20);
    g.drawString("The sum is "+ sum, 25,25);
  }
}