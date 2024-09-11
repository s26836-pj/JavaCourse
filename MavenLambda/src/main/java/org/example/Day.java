package org.example;

public enum Day {
    MONDAY("Start of the work week"),
    FRIDAY("End of the work week"),
    SATURDAY("Weekend"),
    SUNDAY("Weekend");

    private final String description;

    Day(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    static {
        System.out.println("Day enum loaded");
    }
}
