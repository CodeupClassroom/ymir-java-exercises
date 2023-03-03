package adventure.screens;

import adventure.Main;
import adventure.menu.Menu;
import adventure.menu.MenuAction;
import adventure.misc.ConsoleColors;

public class DungeonEntrance extends Screen {
    public DungeonEntrance() {
        super();
        menu.addChoice("Retreat back to town!!", () -> {
            ScreenManager.setNextScreen(ScreenBuilder.buildScreen(ScreenType.Town));
        });
        menu.addChoice("View Hero", viewHero);
        menu.addChoice("Punch generic monster", punchGenericMonster);
    }

    @Override
    public void show() {
        System.out.printf("""
        
        You are in the dungeon entrance.
        """);
        super.show();
    }

    private MenuAction viewHero = () -> {
        Main.getHero().printMe();
    };

    private MenuAction punchGenericMonster = () -> {
        int health = Main.getHero().getHealth();
        int gold = Main.getHero().getGold();
        if(Math.random() < .5) {
            System.out.printf("""
                            
                    You punch a generic monster. It showers you in gore and %sGOLD%s. You brute.
                    """, ConsoleColors.ANSI_YELLOW, ConsoleColors.ANSI_RESET);
            gold += 10;
            Main.getHero().setGold(gold);
        } else {
            System.out.printf("""
                            
                    Ouch!, the generic monster %spunches YOU!!%s 
                    """, ConsoleColors.ANSI_RED, ConsoleColors.ANSI_RESET);
            health -= 10;
            Main.getHero().setHealth(health);
        }
    };

}
