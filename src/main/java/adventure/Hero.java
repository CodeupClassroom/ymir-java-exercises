package adventure;

public class Hero {
    private String name;
    private int health;
    private int attackStrength;

    public Hero(String name) {
        this.name = name;
        health = 100;
        attackStrength = 10;
    }

    @Override
    public String toString() {
        return "Hero " + name + ", health: " + health;
    }

    // accessors

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttackStrength() {
        return attackStrength;
    }

    public void setAttackStrength(int attackStrength) {
        this.attackStrength = attackStrength;
    }
}
