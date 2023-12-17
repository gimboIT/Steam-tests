package ui.localizationtesting;

public enum Locale {
    EN("English (английский)"),
    RU("Русский (Russian)");
    private final String description;
    Locale(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
}
