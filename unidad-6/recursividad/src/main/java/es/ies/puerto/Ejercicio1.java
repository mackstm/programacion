package es.ies.puerto;

public class Ejercicio1 {
    public int factorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public int factorialRecursive(int number) {
        if (number == 0) {
            return 1;
        }
        return number * factorialRecursive(number - 1);
    }
}
