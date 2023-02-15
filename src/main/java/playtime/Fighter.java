package playtime;

public class Fighter {
    private final int MAX_HEALTH = 100;

    private int health;

    private String name;

    protected int strength;

//    private String weaponName;
//    private int weaponDamage;

    private Weapon currentWeapon;

    public Fighter() {
        this.name = "Unknown fighter";
        health = MAX_HEALTH;
        strength = 10;
    }

    public Fighter(String name) {
        this.name = name;
        health = 100;
        strength = 10;
    }

    public Fighter(String name, int strength) {
        this.name = name;
        this.strength = strength;
    }

    // the fighter this is called on hits the otherFighter
    public void hit(Fighter otherFighter) {
        //  + currentWeapon.getDamage())
        int otherHealth = otherFighter.getHealth();
        otherHealth -= strength;
        otherFighter.setHealth(otherHealth);
    }

    public void taunt() {
        System.out.println("Your mama wears combat boots!");
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
