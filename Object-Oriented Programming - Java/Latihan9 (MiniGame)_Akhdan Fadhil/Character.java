public class Character {
    private String name;
    private int health;
    private int XP;
    private String item;

    public Character(String name, int health, String item) {
        this.name = name;
        this.health = health;
        this.XP = 0;
        this.item = null;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
        if (this.health < 0) this.health = 0;
    }

    public void addXP(int additionalXP) {
        this.XP += additionalXP;
    }

    public String getName() { return name; }
    public int getHealth() { return health; }
    public int getXP() { return XP; }
    public String getItem() { return item; }
    public void setItem(String item) { this.item = item; }
}