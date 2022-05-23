import javax.swing.JOptionPane;

public class Predefined3 {
  public static void main(String[] args) {
    int count = 0;
    String in = JOptionPane.showInputDialog("Enter a sentence"), word = "";
    for(int i = 0; i < in.length(); i++){
      word += in.charAt(i);
      if(in.charAt(i) == ' ') word = "";
      if(word.equalsIgnoreCase("java")) count++;
    }
    JOptionPane.showMessageDialog(null, "There is/are " + count + " Java word/s in the sentence.");
    System.exit(0);
  }
}
