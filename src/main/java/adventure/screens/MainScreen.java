package adventure.screens;

import adventure.Hero;
import adventure.Main;
import adventure.menu.Menu;
import adventure.menu.MenuAction;

public class MainScreen extends Screen {

    public MainScreen() {
        super();
        menu.addChoice("Exit", Menu.EXIT_SCREEN_ACTION);
        menu.addChoice("Create Hero", createHero);
        menu.addChoice("View Hero", viewHero);
        menu.addChoice("Start the adventure", startAdventure);
    }

    private MenuAction createHero = () -> {
        String name = Main.INPUT.getString("Enter your hero's name: ");
        Main.setHero(new Hero(name));
    };

    private MenuAction viewHero = () -> {
        System.out.println(Main.getHero());
    };

    private MenuAction startAdventure = () -> {
        ScreenBuilder.buildScreen(ScreenType.Town).go();
    };

}