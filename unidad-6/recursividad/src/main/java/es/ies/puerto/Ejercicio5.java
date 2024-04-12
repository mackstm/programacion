package es.ies.puerto;

/**
 * Power
 * @author Jose Maximiliano Boada Martin
 */
public class Ejercicio5 {
    public int powerTrad(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        int result = base;
        for (int i = 2; i <= exponent; i++) {
            result *= base;
        }
        return result;
    }
    public int powerRecursive(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        if(exponent == 1) {
            return base;
        }
        return base * powerRecursive(base, exponent - 1);
    }
}
