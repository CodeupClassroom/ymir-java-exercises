package playtime;

public class Fighter {
    private int health;

    private String name;

    private int strength;

//    private String weaponName;
//    private int weaponDamage;

    private Weapon currentWeapon;

    public Fighter(String name) {
        this.name = name;
        health = 100;
        strength = 10;
    }

    // the fighter this is called on hits the otherFighter
    public void hit(Fighter otherFighter) {
        int otherHealth = otherFighter.getHealth();
        otherHealth -= (strength + currentWeapon.getDamage());
        otherFighter.setHealth(otherHealth);
    }

    @Override
    public String toString() {
        return "Fighter{" +
                "health=" + health +
                ", name='" + name + '\'' +
                ", strength=" + strength +
                ", currentWeapon=" + currentWeapon +
                '}';
    }

    // accessors

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public Weapon getCurrentWeapon() {
        return currentWeapon;
    }

    public void setCurrentWeapon(Weapon currentWeapon) {
        this.currentWeapon = currentWeapon;
    }
}
