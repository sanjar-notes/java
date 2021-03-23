public class Playerv1 {
    private String name;
    private String weapon;
    private int health = 100;

    public Playerv1(String name, int health, String weapon) {
        this.name = name;
        this.weapon = weapon;
        if (health > 0 && health <= 100)
            this.health = health;

    }

    public void loseHealth(int damage) {
        this.health -= damage;
        if (this.health <= 0) {
            this.health = 0;
            System.out.println(this.name + "'s dead.");
        }
    }

    public int healthRemaining() {
        return this.health;
    }
}
