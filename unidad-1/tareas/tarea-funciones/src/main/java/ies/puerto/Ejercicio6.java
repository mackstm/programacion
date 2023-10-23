package ies.puerto;

/**
 * Crear una funcion que convierte de grados Fahrenheit a Celsius.
 * @author Jose Maximiliano Boada Martin
 */
public class Ejercicio6 {

    /**
     * Funcion que convierte una temperatura dada de Fahrenheit a Celsius
     * @param temperature temperatura a convertir
     * @return temperatura en celsius
     */
    public double fahrenheitToCelsius(double temperature) {
        return (5.0 / 9.0) * (temperature - 32.0);
    }
}