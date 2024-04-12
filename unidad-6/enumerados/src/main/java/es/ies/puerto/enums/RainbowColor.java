package es.ies.puerto.enums;

public enum RainbowColor {
    RED,
    ORANGE,
    YELLOW,
    GREEN,
    BLUE;
    private String color;

    RainbowColor() {}

    RainbowColor(String color) {
        this.color = color;
    }

    public static RainbowColor getValueByName(String color){
        return valueOf(color.toUpperCase());
    }
}
