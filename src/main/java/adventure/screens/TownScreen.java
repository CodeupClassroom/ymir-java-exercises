package adventure.screens;

import adventure.Main;
import adventure.menu.Menu;
import adventure.menu.MenuAction;
import adventure.misc.ConsoleColors;

public class TownScreen extends Screen {

    public TownScreen() {
        super();
        menu.addChoice("Run Away!!", Menu.EXIT_SCREEN_ACTION);
        menu.addChoice("View Hero", viewHero);
//        menu.addChoice("Go Shopping", null);
        menu.addChoice("Enter ze Dungeon", null);
    }

    @Override
    public void show() {
        System.out.printf("""

        You enter the town of %sKILLUDED%s. %s        
        """, ConsoleColors.ANSI_RED, ConsoleColors.ANSI_RESET, getRandomAtmosphere());
        super.show();
    }

    private String getRandomAtmosphere() {
        switch((int) (Math.random() * 4)) {
            case 0:
                return "A wolf howls in the distance.";
            case 1:
                return "You smell horse poop.";
            case 2:
                return "The hair on the back of your neck stands up.";
            default:
                return "It is strangely quiet.";
        }
    }

    private MenuAction viewHero = () -> {
        Main.getHero().printMe();
    };

}
