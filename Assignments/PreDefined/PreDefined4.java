import javax.swing.JOptionPane;

public class PreDefined4 {
  public static void main(String[] args) {
    int mid = 0;
    String sentence = JOptionPane.showInputDialog("Enter a sentence"), word = "", processedSentence = "";
    for(int i = 0; i < sentence.length(); i++){
      if(sentence.charAt(i) == ' ' || i == sentence.length()-1){
        if(i == sentence.length()-1 && sentence.charAt(i) != ' ') word += sentence.charAt(i);
        mid = word.length()/2;
        processedSentence += word.substring(0, mid) + word.substring(mid+1) + word.substring(mid, mid+1) + "AVA ";
        word = "";
        continue;
      }
      word += sentence.charAt(i);
    }
    JOptionPane.showMessageDialog(null, processedSentence);
  }
}    