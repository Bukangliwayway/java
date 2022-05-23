import javax.swing.JOptionPane;
//The Answer
public class PreDefined1b {
  public static void main(String[] args){
    int num[] = new int[5], min = 0, max = 0;
    for(int i = 0, j = 1; i < num.length; i++){
      num[i] = Integer.parseInt(JOptionPane.showInputDialog("Input #"+ (i+1) +" Integer"));
      if(i == 0){
        min = max = num[i];
        continue;
      }
      min = Math.min(min, num[i]);
      max = Math.max(max, num[i]);
    }

    JOptionPane.showMessageDialog(null, "Min: " + min + "\nMax: " + max);
    System.exit(0);
  }

}