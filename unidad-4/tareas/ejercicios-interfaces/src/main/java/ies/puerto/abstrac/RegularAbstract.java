package ies.puerto.abstrac;

public abstract class RegularAbstract {
    private float base;
    private float height;

    public RegularAbstract() {}

    public RegularAbstract(float base, float height) {
        this.base = base;
        this.height = height;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }


}
