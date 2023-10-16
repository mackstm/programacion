package ies.puerto;

/**
 * Clase que tiene como objetivo realizar el cálculo del factorial
 * @author José Maximiliano Boada Martín
 */
public class CalculoFactorial {
    public static void main(String[] args) {

        int number = 5;

        System.out.println("Calculando el factorial de " + number + ", resultado: " + factorialRecursive(number));
    }

    /**
     * Método que calcula el factorial del número dado
     * @param number Valor sobre el que se realiza el cálculo
     * @return factorial del número dado
     */
    public static int calculoFactorial(int number) {
        int result = 1;

        for (int i = 2; i <= number; i++) {
            result *= i;
        }

        return result;
    }

    public static int factorialRecursive(int number) {
        if (number == 0) {
            return 1;
        }
        else {
            return number * factorialRecursive(number - 1);
        }
    }
}