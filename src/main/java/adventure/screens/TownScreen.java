package adventure.screens;

import adventure.menu.Menu;

public class TownScreen extends Screen {

    public TownScreen() {
        super();
        menu.addChoice("Run Away!!", Menu.EXIT_SCREEN_ACTION);
        menu.addChoice("Go Shopping", null);
        menu.addChoice("Enter ze Dungeon", null);
    }

}
