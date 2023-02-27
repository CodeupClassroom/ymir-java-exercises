package adventure;

import adventure.screens.Screen;
import adventure.screens.ScreenBuilder;
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
        screen.go();
        // when welcome screen returns, proceed to the main screen

        // main screen
        screen = ScreenBuilder.buildScreen(ScreenType.Main);
        screen.go();

        // when the main screen returns, the user is ready to quit
        System.out.println("Bye");

    }

    public static Hero getHero() {
        return hero;
    }

    public static void setHero(Hero theHero) {
        Main.hero = theHero;
    }
}
