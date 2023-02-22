package adventure;

import docrob.util.Input;

public class Main {
    private static final Input input = new Input();

    private static Hero theHero = null;

    public static void main(String[] args) {
        // show welcome
        printWelcome();

        // loop until user quits
        while(true) {
            // print menu
            printMenu();

            MenuChoice choice = MenuChoice.fromInt(input.getInt(0, 5, "Enter your choice: "));

            // process user's choice
            doChoice(choice);

            // if user quits then break
            if(MenuChoice.Exit.equals(choice)) {
                break;
            }
        }

        System.out.println("Bye");

    }

    private static void doChoice(MenuChoice choice) {
        switch (choice) {
            case CreateHero -> theHero = createHero();
            case ViewHero -> viewHero();
        }
    }

    private static void viewHero() {
        System.out.println(theHero);
    }

    private static Hero createHero() {
        String name = input.getString("Enter your hero's name: ");
        Hero hero = new Hero(name);
        return hero;
    }

    private static void printWelcome() {
        System.out.println("Welcome to Ga'eme.");
    }

    private static void printMenu() {
        System.out.println("""
                0 - exit
                1 - create character
                2 - load character
                3 - view your character
                4 - start the Ga'eme
                """);
    }
}
