package adventure.screens;

import adventure.Main;
import adventure.menu.Menu;
import adventure.menu.MenuChoice;

public abstract class Screen {
    private boolean showMenuEachIteration = true;

    protected Menu menu;

    public Screen() {
        menu = new Menu();
    }

    // easy to use function that both shows and handles
    public void go() {
        show();
        handleUser();
    }

    public void go(boolean showMenuEachIteration) {
        show();
        handleUser(showMenuEachIteration);
    }

    // show() is responsible for displaying the screen info
    public void show() {
        System.out.println();
        for (MenuChoice choice : menu.getChoices()) {
            System.out.println(choice);
        }
    }

    // handleUser is responsible for responding to user interaction
    public void handleUser() {
        // loop until user quits
        while(true) {

            MenuChoice choice = menu.getChoiceFromUser(Main.INPUT);

            // if user quits then break
            if(choice.getAction() == Menu.EXIT_SCREEN_ACTION) {
                break;
            }

            // process user's choice
            choice.doAction();

            if(showMenuEachIteration) {
                show();
            }
        }

    }

    public void handleUser(boolean showMenuEachIteration) {
        this.showMenuEachIteration = showMenuEachIteration;
        handleUser();
    }
}
