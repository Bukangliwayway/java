import javax.swing.JTextArea;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
public class PreDefined2{
  public static void main(String[] args){
    DecimalFormat formatter = new DecimalFormat("###,###,###.###");
    /**
     * DecimalFormat lets you format your number to your preferred bs 
     * through its method 'format'
     */
    int base = Integer.parseInt(JOptionPane.showInputDialog("Enter the Base"));
    /*
     * JOptionPane.showInputDialog("message") creates an input dialog 
     * with a title that is the string that it uses as param 
     */
    
    JTextArea output = new JTextArea(10,10);
    /*
     * JTextArea is just a text field declared with a row and column
     * You may input string of rows there using its method "append" 
     */
    output.append("Table for Base " + base + " raised from 0-10\n\n\tPOWER\tRESULT\n");
    for(int i = 1; i <= 10; i++) output.append("\t" + i + "\t" + formatter.format(Math.pow(base, i)) + "\n");
    JOptionPane.showMessageDialog(null, output, "POWER", JOptionPane.PLAIN_MESSAGE);
    /*
     * This JOptionPane.showMessageDialog could handle either 2 params of 4 params
     * 2 params: null, message
     * 4 params: null, message, title, icon
     */
    System.exit(0);
  }
}
