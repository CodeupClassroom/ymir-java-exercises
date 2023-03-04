package adventure.screens;

import adventure.menu.FlowAction;

import java.util.HashMap;

public class ScreenBuilder {
    // we can save screens in a cache to reuse them later
    private static final HashMap<String, Screen> screenCache = new HashMap<>();

    public static FlowAction buildScreen(Screen screen) {
        Screen nextScreen = getCachedScreen(screen);
        ScreenManager.setNextScreen(nextScreen);
        return () -> {

        };
    }

//    public static Screen buildScreen(ScreenType screenType) {
//        return switch(screenType) {
//            case Welcome -> new WelcomeScreen();
//            case Main -> new MainScreen();
//            case Town -> getCachedScreen(screenType, new TownScreen());
//            case DungeonEntrance -> getCachedScreen(screenType, new DungeonEntrance());
//            default -> new ErrorScreen();
//        };
//    }

    private static Screen getCachedScreen(Screen screen) {
        String screenClassName = screen.getClass().getSimpleName();
        if(!screenCache.containsKey(screenClassName)) {
            screenCache.put(screenClassName, screen);
        }
        return screenCache.get(screenClassName);
    }

//    private static Screen getCachedScreen(ScreenType screenType, Screen newScreen) {
//        if(!screenCache.containsKey(screenType)) {
//            screenCache.put(screenType, newScreen);
//        }
//        return screenCache.get(screenType);
//    }
}
