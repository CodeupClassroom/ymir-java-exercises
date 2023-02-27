package adventure;

public class Hero {
    private String name;
    private int health;
    private int attackStrength;

    private int defenseStrength;

    private int gold;

    public Hero(String name) {
        this.name = name;
        health = 100;
        attackStrength = 10;
        gold = 0;
        defenseStrength = 10;
    }

    @Override
    public String toString() {
        return "Hero " + name + ", health: " + health;
    }

    public void printMe() {
        System.out.printf("""
                
                %s the Hero
                \tHealth: %d
                \tAttack: %d
                \tDefense: %d
                \tGold: %d
                """, name, health, attackStrength, defenseStrength, gold);
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

    public int getDefenseStrength() {
        return defenseStrength;
    }

    public void setDefenseStrength(int defenseStrength) {
        this.defenseStrength = defenseStrength;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }
}
