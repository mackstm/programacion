package ies.puerto;

/**
 * Crea una función que tome dos parámetros numéricos y calcule el máximo de los dos números. Crear una nueva función con el mismo nombre, que tome tres parámetros, y calcule el máximo de los tres números. Esta segunda función debe hacer uso de la primera.
 * @author José Maximiliano Boada Martín
 */

public class Ejercicio4 {

    /**
     * Función que revisa cuál número es mayor.
     * @param numberA primer número
     * @param numberB segundo número
     * @return el número mayor
     */
    public int greaterNumber(int numberA, int numberB) {

        if (numberA > numberB) {
            return numberA;
        }
        else {
            return numberB;
        }
    }

    /**
     * Función que revisa cuál número es mayor de entre tres números. Sobrecarga de la función anterior
     * @param numberA primer número
     * @param numberB segundo número
     * @param numberC tercer número
     * @return el número mayor
     */
    public int greaterNumber(int numberA, int numberB, int numberC) {
        return greaterNumber(greaterNumber(numberA, numberB), numberC);
    }
}