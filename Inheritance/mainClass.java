public class mainClass {
  public static void main(String[] args){
    Tank a = new Tank();
    Mage b = new Mage();
    Character.attack(a,b);
    Character.attack(b,a);
    a.stats();
    b.stats();
  }
}