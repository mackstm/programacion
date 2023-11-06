package ies.puerto;

/**
 * Rectangle class to calculate area and perimeter
 * @author Jose Maximiliano Boada Martin
 */
public class Rectangle {
    /**
     * Properties
     */
    private float base;
    private float height;

    /**
     * Default constructor
     */
    public Rectangle() {}

    /**
     *Constructor with base and height parameters
     * @param base of rectangle
     * @param height of rectangle
     */
    public Rectangle(float base, float height) {
        this.base = base;
        this.height = height;
    }

    /**
     * Getters and setters
     */

    public float getBase() {
        return base;
    }

    public float getHeight() {
        return height;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    /**
     * Calculates area of rectangle
     * @return base x height
     */
    public float calcArea() {
        return base * height;
    }

    /**
     * Calculates perimeter of rectangle
     * @return sum of all sides
     */
    public float calcPerimeter() {
        return base * 2 + height * 2;
    }
}
