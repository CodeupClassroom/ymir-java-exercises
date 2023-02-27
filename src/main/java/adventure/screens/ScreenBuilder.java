package adventure.screens;

import java.util.HashMap;

public class ScreenBuilder {
    // we can save screens in a cache to reuse them later
    private static HashMap<ScreenType, Screen> screenCache = new HashMap<>();

    public static Screen buildScreen(ScreenType screenType) {
        return switch(screenType) {
            case Welcome -> new WelcomeScreen();
            case Main -> new MainScreen();
            case Town -> getCachedScreen(screenType, new TownScreen());
            case DungeonEntrance -> getCachedScreen(screenType, new DungeonEntrance());
            default -> new ErrorScreen();
        };
    }

    private static Screen getCachedScreen(ScreenType screenType, Screen newScreen) {
        if(!screenCache.containsKey(screenType)) {
            screenCache.put(screenType, newScreen);
        }
        return screenCache.get(screenType);
    }
}
