package ies.puerto;

/**
 * Crea una funcion que tome como parametro un numero e indique si es primo o no.
 * @author José Maximiliano Boada Martín
 */
public class Ejercicio5 {

    /**
     * Funcion que verifica si un numero es primo
     * @param number numero a revisar
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