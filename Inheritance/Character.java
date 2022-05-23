public class Character {
  protected int damage, health;
  protected String name;
  protected Character(int damage, int health, String name) {
    this.damage = damage;
    this.health = health;
    this.name = name;
  }
  public static void attack(Character attacker, Character defender){
    defender.health -= attacker.damage;
  }
  public void stats(){
    System.out.println(this.name + " remaining health: " +this.health);
  }
}
