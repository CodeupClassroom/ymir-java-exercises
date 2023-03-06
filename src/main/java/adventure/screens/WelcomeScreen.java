package adventure.screens;

import adventure.Main;
import adventure.menu.MenuChoice;

public class WelcomeScreen extends Screen {

    public WelcomeScreen() {
        super();
    }

    @Override
    public void show() {
        System.out.print("""
    Welcome to a console adventure game!
    
    Press Enter to continue.
    """);
    }

    @Override
    public MenuChoice handleUser() {
        // wait for user to press enter
        Main.INPUT.getString();

        MenuChoice choice = new MenuChoice("", ScreenBuilder.buildScreen(new MainScreen()));
        choice.doAction();
        return choice;
    }
}
