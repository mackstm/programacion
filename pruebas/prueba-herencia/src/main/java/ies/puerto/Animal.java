package ies.puerto;

public abstract class Animal {
    private String name;
    private int chip;
    public Animal() {}

    public Animal(String name, int chip) {
        this.name = name;
        this.chip = chip;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChip() {
        return chip;
    }

    public void setChip(int chip) {
        this.chip = chip;
    }

    public String makeSound() {
        return "";
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nChip: " + chip;
    }
}