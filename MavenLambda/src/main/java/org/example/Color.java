package org.example;

public enum Color {
    RED("FF0000"),
    GREEN("00FF00"),
    BLUE("0000FF");

    private final String hexCode;

    Color(String hexCode) {
        this.hexCode = hexCode;
    }

    public String getHexCode() {
        return hexCode;
    }

    public String getColorName() {
        return name();
    }

    public void printInfo() {
        System.out.println("Color: " + getColorName() + ", Hex Code: " + getHexCode());
    }
}
