package ies.puerto;

/**
 * Circle class with methods for area and circumference
 * @author Jose Maximiliano Boada Martin
 */
public class Circle {
    /**
     * Properties
     */
    private double radio;

    /**
     * Default constructor
     */
    public Circle() {}

    /**
     * Constructor with radio parameter
     * @param radio of circle
     */
    public Circle(double radio) {
        this.radio = radio;
    }

    /**
     * Getter and setter
     */
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    /**
     * Calculates area of circle object
     * @return area of circle
     */
    public double calcArea() {
        return Math.PI * (radio * radio);
    }

    /**
     * Calculates circumference of circle object
     * @return circumference of circle
     */
    public double calcCircumference() {
        return 2 * Math.PI * radio;
    }
}
