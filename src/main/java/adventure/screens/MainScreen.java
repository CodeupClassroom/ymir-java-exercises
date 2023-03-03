package adventure.screens;

import adventure.Hero;
import adventure.Main;
import adventure.menu.FlowAction;
import adventure.menu.Menu;
import adventure.menu.MenuAction;

public class MainScreen extends Screen {

    public MainScreen() {
        super();
        menu.addChoice("Exit", ScreenManager.EXIT_APPLICATION_ACTION);
        menu.addChoice("Create Hero", createHero);
        menu.addChoice("View Hero", viewHero);
        menu.addChoice("Start the adventure", startAdventure);
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

    private FlowAction startAdventure = () -> {
        ScreenManager.setNextScreen(ScreenBuilder.buildScreen(ScreenType.Town));
    };

}