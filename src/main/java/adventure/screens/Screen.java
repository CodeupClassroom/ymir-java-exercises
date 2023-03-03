package adventure.screens;

import adventure.Main;
import adventure.menu.FlowAction;
import adventure.menu.Menu;
import adventure.menu.MenuChoice;

public abstract class Screen {
    private boolean showMenuEachIteration = true;

    protected Menu menu;

    public Screen() {
        menu = new Menu();
    }

    // easy to use function that both shows and handles
    public MenuChoice go() {
        show();
        return handleUser();
    }

    public MenuChoice go(boolean showMenuEachIteration) {
        show();
        return handleUser(showMenuEachIteration);
    }

    // show() is responsible for displaying the screen info
    public void show() {
        System.out.println();
        for (MenuChoice choice : menu.getChoices()) {
            System.out.println(choice);
        }
    }

    // handleUser is responsible for responding to user interaction
    public MenuChoice handleUser() {
        MenuChoice choice;

        // loop while user does not choose an action that changes screen flow
        while(true) {

            choice = menu.getChoiceFromUser(Main.INPUT);

            // process user's choice
            choice.doAction();

            // if user quits then break
            if(choice.getAction() instanceof FlowAction) {
                break;
            }

            if(showMenuEachIteration) {
                show();
            }
        }

        return choice;
    }

    public MenuChoice handleUser(boolean showMenuEachIteration) {
        this.showMenuEachIteration = showMenuEachIteration;
        return handleUser();
    }
}
