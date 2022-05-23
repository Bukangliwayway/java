import javax.swing.JOptionPane;

public class Commission {
  private double sales, dRate;
  private int rate;
  public void computeCommision(double sales, double rate){
    this.sales = sales;
    this.dRate = rate;
    JOptionPane.showMessageDialog(null, this.sales * this.dRate);
  }
  public void computeCommision(double sales, int rate){
    this.sales = sales;
    this.rate = rate;
    JOptionPane.showMessageDialog(null, this.rate/100*this.sales);
  }
}
