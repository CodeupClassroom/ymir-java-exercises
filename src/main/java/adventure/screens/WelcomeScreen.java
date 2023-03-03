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
        String stuff = Main.INPUT.getString();

        ScreenManager.setNextScreen(ScreenBuilder.buildScreen(ScreenType.Main));
        return new MenuChoice("", ScreenManager.NO_ACTION);
    }
}
