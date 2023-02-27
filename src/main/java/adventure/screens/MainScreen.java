package adventure.screens;

import adventure.Hero;
import adventure.Main;

public class MainScreen extends Screen {

    @Override
    public void show() {
        System.out.println("""
            0 - exit
            1 - create character
            2 - load character
            3 - view your character
            4 - start the Ga'eme
            """);
    }

    @Override
    public void handleUser() {
        // loop until user quits
        while(true) {

            MenuChoiceOld choice = MenuChoiceOld.fromInt(Main.INPUT.getInt(MenuChoiceOld.minVal(), MenuChoiceOld.maxVal(), "Enter your choice: "));

            // process user's choice
            doChoice(choice);

            // if user quits then break
            if(MenuChoiceOld.Exit.equals(choice)) {
                break;
            }

            show();
        }

    }

    private void doChoice(MenuChoiceOld choice) {
        switch (choice) {
            case CreateHero -> Main.setHero(createHero());
            case ViewHero -> viewHero();
        }
    }

    private void viewHero() {
        System.out.println(Main.getHero());
    }

    private Hero createHero() {
        String name = Main.INPUT.getString("Enter your hero's name: ");
        Hero hero = new Hero(name);
        return hero;
    }


}
