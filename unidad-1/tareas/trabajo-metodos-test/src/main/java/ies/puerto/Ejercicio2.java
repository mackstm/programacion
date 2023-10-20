package ies.puerto;

/**
 * Clase que tiene como objetivo realizar el MCD de un número
 * @author
 */
public class Ejercicio2 {
    public static void main(String[] args) {

    }

    /**
     * Funcion que calcula el MCD de dos numeros dados
     * @param number1 para el calculo
     * @param number2 para el calculo
     * @return MCD de los numeros dados
     */
    public int mcd(int number1, int number2) {
        int result = 0;
        boolean found = false;
        int greater = number2;

        if (number1 > number2) {
            greater = number1;
        }

        int i = greater / 2;
        while (!found && i > 0) {
            if ((number1 % i) == 0 && (number2 % i) == 0) {
                result = i;
                found = true;
            }
            i--;
        }

        return result;
    }

}