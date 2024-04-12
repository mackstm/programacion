package es.ies.puerto;

/**
 * Natural number sum
 * @author Jose Maximiliano Boada Martin
 */
public class Ejercicio3 {
    public int sumNumbersTrad(int number) {
        int result = 0;
        for (int i = number; i > 0; i--) {
            result += i;
        }
        return result;
    }

    public int sumNumbersRecursive(int number) {
        if (number == 1) {
            return 1;
        }
        return number + sumNumbersRecursive(number - 1);
    }
}
