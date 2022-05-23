import javax.swing.JOptionPane;

public class Circle {
  private int radius, area, diameter;
  public void setRadius(int radius){
    this.radius = radius;
  }
  public int getRadius(){
    return this.radius;
  }
  public int computeRadius(){
    return this.radius*2;
  }
  public double computeArea(){
    return Math.PI * Math.pow(this.radius, 2);
  }
}
