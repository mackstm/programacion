package ies.puerto;

/**
 * Crea una funcion que tome dos parametros numericos y calcule el maximo de los dos numeros.
 * Crear una nueva funcion con el mismo nombre, que tome tres parametros, y calcule el maximo de los tres numeros.
 * Esta segunda funcion debe hacer uso de la primera.
 * @author Jose Maximiliano Boada Martin
 */

public class Ejercicio4 {

    /**
     * Funcion que revisa cual numero es mayor.
     * @param numberA primer numero
     * @param numberB segundo numero
     * @return el numero mayor
     */
    public int greaterNumber(int numberA, int numberB) {
        int result = numberB;
        if (numberA > numberB) {
            result = numberA;
        }
            return result;
    }

    /**
     * Funcion que revisa cual numero es mayor de entre tres numeros. Sobrecarga de la funcion anterior
     * @param numberA primer numero
     * @param numberB segundo numero
     * @param numberC tercer numero
     * @return el numero mayor
     */
    public int greaterNumber(int numberA, int numberB, int numberC) {
        return greaterNumber(greaterNumber(numberA, numberB), numberC);
    }
}