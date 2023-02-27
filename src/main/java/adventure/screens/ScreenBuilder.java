package adventure.screens;

public class ScreenBuilder {

    public static Screen buildScreen(ScreenType screenType) {
        return switch(screenType) {
            case Welcome -> new WelcomeScreen();
            case Main -> new MainScreen();
            default -> new ErrorScreen();
        };
    }
}
