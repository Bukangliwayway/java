import javax.swing.JOptionPane;
import java.util.Collections;
import java.util.Arrays; 
//The Better
public class PreDefined1a {
  public static void main(String[] args){
    int num[] = new int[5];
    for(int i = 1; i <= num.length; i++) num[i-1] = Integer.parseInt(JOptionPane.showInputDialog("Input #"+i +" Integer"));
    Integer[] boxedNum = Arrays.stream(num).boxed().toArray(Integer[]::new);
    JOptionPane.showMessageDialog(null, "Min: " + Collections.min(Arrays.asList(boxedNum)) + "\nMax: " + Collections.max(Arrays.asList(boxedNum)));
    System.exit(0);
  }
}


