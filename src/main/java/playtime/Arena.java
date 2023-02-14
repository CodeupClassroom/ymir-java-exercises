package playtime;

public class Arena {

    public static void main(String[] args) {
        Fighter bob = new Fighter("Bob");
        Fighter ragnar = new Fighter("Ragnar");
        ragnar.setStrength(20);

        // hand out the weapons
        Weapon club = new Weapon("Club", 5);
        Weapon battleAxe = new Weapon("Axe", 15);
        bob.setCurrentWeapon(club);
        ragnar.setCurrentWeapon(battleAxe);

        // bob starts the fight
        bob.hit(ragnar);
        System.out.printf("Bob's health: %d%n", bob.getHealth());
        System.out.printf("Ragnar's health: %d%n", ragnar.getHealth());

        ragnar.hit(bob);
        ragnar.hit(bob);
        System.out.printf("Bob's health: %d%n", bob.getHealth());
        System.out.printf("Ragnar's health: %d%n", ragnar.getHealth());
    }
}
