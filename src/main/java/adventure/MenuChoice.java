package adventure;

public enum MenuChoice {
    Exit, CreateHero, ViewHero, LoadGame, SaveGame;

    public static MenuChoice fromInt(int choice) {
        return MenuChoice.values()[choice];
    }

}
