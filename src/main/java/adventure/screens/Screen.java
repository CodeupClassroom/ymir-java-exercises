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
        MenuChoice choice = null;

        // loop while user does not choose an action that changes screen flow
        while(true) {

            choice = menu.getChoiceFromUser(Main.INPUT);

            // if user quits then break
            if(choice.getAction() instanceof FlowAction) {
                break;
            }

            // process user's choice
            choice.doAction();

            if(showMenuEachIteration) {
                show();
            }
        }

        // perform the flow action
        choice.doAction();
    }

    public void handleUser(boolean showMenuEachIteration) {
        this.showMenuEachIteration = showMenuEachIteration;
        handleUser();
    }
}
