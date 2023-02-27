package adventure.screens;

public class MenuChoice {
    private int id;
    private String label;

    public MenuChoice(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return id + ": " + label;
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
}
