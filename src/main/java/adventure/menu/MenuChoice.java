package adventure.menu;

public class MenuChoice {
    private int id;
    private String label;

    private MenuAction action;

    private int myIntVal;

    public MenuChoice(String label) {
        this.label = label;
        this.action = null;
        this.myIntVal = -1;
    }

    public MenuChoice(String label, MenuAction action) {
        this(label);
        this.action = action;
    }

    public MenuChoice(String label, int myIntVal) {
        this(label);
        this.myIntVal = myIntVal;
    }

    public MenuChoice(String label, MenuAction action, int myIntVal) {
        this(label, action);
        this.myIntVal = myIntVal;
    }

    @Override
    public String toString() {
        return id + ": " + label;
    }

    public void doAction() {
        action.doAction();
    }

    // accessors

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public MenuAction getAction() {
        return action;
    }

    public void setAction(MenuAction action) {
        this.action = action;
    }

    public int getMyIntVal() {
        return myIntVal;
    }

    public void setMyIntVal(int myIntVal) {
        this.myIntVal = myIntVal;
    }
}
