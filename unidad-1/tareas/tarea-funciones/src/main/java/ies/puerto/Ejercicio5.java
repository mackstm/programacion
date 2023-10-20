package ies.puerto;

/**
 * Crea una función que tome como parámetro un número e indique si es primo o no.
 * @author José Maximiliano Boada Martín
 */
public class Ejercicio5 {

    /**
     * Función que verifica si un número es primo
     * @param number número a revisar
     * @return true o false
     */
    public boolean isPrimeNumber(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}