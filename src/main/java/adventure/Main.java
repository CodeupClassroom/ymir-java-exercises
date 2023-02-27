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
        screen.show();
        screen.handleUser();

        // main screen
        screen = ScreenBuilder.buildScreen(ScreenType.Main);
        screen.show();
        screen.handleUser();

        // when the main screen returns from handleUser, the user is ready to quit
        System.out.println("Bye");

    }

    public static Hero getHero() {
        return hero;
    }

    public static void setHero(Hero theHero) {
        Main.hero = theHero;
    }
}
