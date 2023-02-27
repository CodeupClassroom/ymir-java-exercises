package adventure.menu;

public enum MenuChoiceOld {
    Exit, CreateHero, ViewHero, LoadGame, SaveGame;

    public static MenuChoiceOld fromInt(int choice) {
        return MenuChoiceOld.values()[choice];
    }

    public static int minVal() {
        return MenuChoiceOld.values()[0].ordinal();
    }

    public static int maxVal() {
        return MenuChoiceOld.values()[MenuChoiceOld.values().length - 1].ordinal();
    }

}
