public class Player {
    private int health = 100;
    private String weapon;
    private String armor;
    private String guntlet;

    void player(String name,String items[]){
        this.health = health;
        this.weapon = items[0];
        this.armor = items[1];
    }
}
