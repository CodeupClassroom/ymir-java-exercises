package adventure.screens;

import adventure.Hero;
import adventure.Main;
import adventure.menu.MenuAction;

public class MainScreen extends Screen {

    public MainScreen() {
        super();
        menu.addChoice("Exit", ScreenManager.EXIT_APPLICATION_ACTION);
        menu.addChoice("Create Hero", createHero);
        menu.addChoice("View Hero", viewHero);
        menu.addChoice("Start the adventure", ScreenBuilder.buildScreen(new TownScreen()));
    }

    @Override
    public void show() {
        System.out.println("\nMain Menu");
        super.show();
    }

    private MenuAction createHero = () -> {
        String name = Main.INPUT.getString("\nEnter your hero's name: ");
        Main.setHero(new Hero(name));
    };

    private MenuAction viewHero = () -> {
        Main.getHero().printMe();
    };

}