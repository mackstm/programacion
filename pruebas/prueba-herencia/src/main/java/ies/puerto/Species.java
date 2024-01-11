package ies.puerto;

public class Species extends Animal {
    private String speciesName;

    public Species() {}

    public Species(String speciesName, String name, int chip) {
        super(name, chip);
        this.speciesName = speciesName;
    }

    public String getSpeciesName() {
        return speciesName;
    }

    public void setSpeciesName(String speciesName) {
        this.speciesName = speciesName;
    }
}
