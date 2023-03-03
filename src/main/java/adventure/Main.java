package adventure;

import adventure.screens.Screen;
import adventure.screens.ScreenBuilder;
import adventure.screens.ScreenManager;
import adventure.screens.ScreenType;
import docrob.util.Input;

public class Main {
    public static final Input INPUT = new Input();

    // GAME INFO     ****************
    private static Hero hero = null;
    // END GAME INFO ****************

    public static void main(String[] args) {
        // show welcome
        Screen screen = ScreenBuilder.buildScreen(ScreenType.Welcome);

        // screen manager is now the main screen loop
        // when a screen fully exits, the screen manager loads the next screen
        ScreenManager.setNextScreen(screen);
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
