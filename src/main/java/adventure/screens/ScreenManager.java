package adventure.screens;

import adventure.menu.FlowAction;
import adventure.menu.MenuAction;
import adventure.menu.MenuChoice;

public class ScreenManager {
    private static Screen nextScreen = null;

    public static final FlowAction EXIT_APPLICATION_ACTION = () -> {
        // empty action function that just indicates the user selected an choice to return the current screen to the caller
    };

    public static final MenuAction NO_ACTION = () -> {
        // empty action function that just indicates the user selected an choice to return the current screen to the caller
    };

    public static void start() {
        MenuChoice choice;
        do {
            if(nextScreen == null) {
                throw new ScreenException("Next screen has not been set!");
            }

            Screen currentScreen = nextScreen;
            nextScreen = null;
            choice = currentScreen.go();
        } while(choice.getAction() != EXIT_APPLICATION_ACTION);
    }

    public static void setNextScreen(Screen nextScreen) {
        ScreenManager.nextScreen = nextScreen;
    }
}
