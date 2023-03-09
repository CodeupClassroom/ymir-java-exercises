package adventure.menu;

import adventure.Main;
import util.Input;

import java.util.ArrayList;

public class Menu {
    private int idCounter = 0;

    private ArrayList<MenuChoice> choices;

    public Menu() {
        choices = new ArrayList<>();
    }

    public Menu(int idStartingVal) {
        this();
        idCounter = idStartingVal;
    }

    public void addChoice(String label) {
        MenuChoice choice = new MenuChoice(label);
        choice.setId(idCounter++);
        choices.add(choice);
    }

    public void addChoice(String label, MenuAction action) {
        addChoice(label);
        MenuChoice choice = getChoiceFromLabel(label);
        choice.setAction(action);
    }

    public void addChoice(String label, int myIntVal) {
        addChoice(label);
        MenuChoice choice = getChoiceFromLabel(label);
        choice.setMyIntVal(myIntVal);
    }

    private MenuChoice getChoiceFromLabel(String label) {
        for (MenuChoice choice : choices) {
            if(choice.getLabel().equals(label)) {
                return choice;
            }
        }
        throw new MenuException("Invalid menu choice requested: " + label);
    }

    // accessors

    public ArrayList<MenuChoice> getChoices() {
        return choices;
    }

    public MenuChoice getChoiceFromUser(Input input) {
        int num = Main.INPUT.getInt("Enter your choice: ");
        // check if num is a valid menu choice
        for (MenuChoice choice : choices) {
            if(choice.getId() == num) {
                return choice;
            }
        }

        // did not select a valid choice num so do again
        System.out.print("That was not a valid choice! ");
        return getChoiceFromUser(input);
    }
}
