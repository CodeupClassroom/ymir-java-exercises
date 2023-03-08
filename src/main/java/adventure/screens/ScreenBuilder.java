package adventure.screens;

import adventure.menu.FlowAction;
import java.util.HashMap;

public class ScreenBuilder {
    // we can save screens in a cache to reuse them later
    private static final HashMap<String, Screen> screenCache = new HashMap<>();

    public static FlowAction buildScreen(Screen screen) {
        Screen nextScreen = getCachedScreen(screen);
        return () -> {
            ScreenManager.setNextScreen(nextScreen);
        };
    }

    private static Screen getCachedScreen(Screen screen) {
        String screenClassName = screen.getClass().getSimpleName();
        if(!screenCache.containsKey(screenClassName) || screen instanceof NotCacheable) {
            if(!(screen instanceof NotCacheable)) {
                screenCache.put(screenClassName, screen);
            }
            screen.setupMenu();
        }
        return screenCache.get(screenClassName);
    }
}
