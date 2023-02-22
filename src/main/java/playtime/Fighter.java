package playtime;

import java.util.ArrayList;
import java.util.Objects;

public class Fighter {
    private final int MAX_HEALTH = 100;

    private int health;

    private String name;

    protected int strength;

//    private String weaponName;
//    private int weaponDamage;

    private Weapon currentWeapon;

    // a fighter can have many weapons
    private ArrayList<Weapon> weapons;

    public Fighter() {
        this.name = "Unknown fighter";
        health = MAX_HEALTH;
        strength = 10;
        weapons = new ArrayList<>();
    }

    public Fighter(String name) {
        this.name = name;
        health = 100;
        strength = 10;
        weapons = new ArrayList<>();
    }

    public Fighter(String name, int strength) {
        this.name = name;
        this.strength = strength;
        weapons = new ArrayList<>();
    }

    public String toFileString() {
        return String.format("%s,%d,%d", name, health, strength);
    }

    public static Fighter fromFileString(String fileString) {
        // file format is name,health,strength
        String [] pieces = fileString.split(",");
        Fighter fighter = new Fighter(pieces[0]);
        fighter.setHealth(Integer.parseInt(pieces[1]));
        fighter.setStrength(Integer.parseInt(pieces[2]));
        return fighter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fighter fighter = (Fighter) o;
        return Objects.equals(name, fighter.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
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

    public void addWeapon(Weapon weapon) {
        weapons.add(weapon);
    }

    public Weapon getWeapon(int index) {
        return weapons.get(index);
    }


    @Override
    public String toString() {
        return "Fighter{" +
                "health=" + health +
                ", name='" + name + '\'' +
                ", strength=" + strength +
                ", weapons=" + weapons +
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
