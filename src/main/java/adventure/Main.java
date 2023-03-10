package adventure;

import adventure.screens.*;
import util.Input;

public class Main {
    public static final Input INPUT = new Input();

    // GAME INFO     ****************
    private static Hero hero = null;
    // END GAME INFO ****************

    public static void main(String[] args) {
        // show welcome
        Screen screen = new WelcomeScreen();
        ScreenBuilder.buildScreen(screen);
        ScreenManager.setNextScreen(screen);
        // screen manager is now the main screen loop
        // when a screen fully exits, the screen manager loads the next screen
        ScreenManager.start();

        // when the screen manager returns, the app is ready to quit
        // i.e., the user has exited from the main screen
        System.out.println("Bye");

    }

    public static Hero getHero() {
        return hero;
    }

    public static void setHero(Hero theHero) {
        Main.hero = theHero;
    }
}
