package ies.puerto;

/**
 * Crear una función que convierte de grados Fahrenheit a Celsius.
 * @author José Maximiliano Boada Martín
 */
public class Ejercicio6 {

    /**
     * Función que convierte una temperatura dada de Fahrenheit a Celsius
     * @param temperature temperatura a convertir
     * @return temperatura en celsius
     */
    public double fahrenheitToCelsius(double temperature) {
        return (5.0 / 9.0) * (temperature - 32.0);
    }
}