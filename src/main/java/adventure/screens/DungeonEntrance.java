package adventure.screens;

import adventure.Main;
import adventure.menu.MenuAction;
import adventure.misc.ConsoleColors;

public class DungeonEntrance extends Screen {
    public DungeonEntrance() {
        super();
    }

    @Override
    public void setupMenu() {
        super.setupMenu();
        menu.addChoice("Retreat back to town!!", ScreenBuilder.buildScreen(new TownScreen()));
        menu.addChoice("View Hero", viewHero);
        menu.addChoice("Punch generic monster", punchGenericMonster);
    }

    @Override
    public void show() {
        System.out.print("""
        
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
