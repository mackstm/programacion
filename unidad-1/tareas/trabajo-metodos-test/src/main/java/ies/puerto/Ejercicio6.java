package ies.puerto;

public class Ejercicio6 {

    /**
     * Función que verifica si un número es Armstrong
     * @param number para verificar
     * @return true o false
     */
    public boolean isArmstrong(int number) {
        int sum = 0;
        int extractedDigit;
        int numAuxiliar = number;
        int numOfDigits = numberOfDigits(number);

        for (int i = 0; i < numOfDigits; i++) {
            extractedDigit = numAuxiliar % 10;
            numAuxiliar /= 10;
            sum += calcPower(extractedDigit, numOfDigits);
        }

        return sum == number;
    }

    /**
     * Función que devuelve el número de dígitos
     * @param number numero del cual se quiere obtener los dígitos
     * @return número de dígitos
     */
    public int numberOfDigits(int number) {
        int digitCounter = 0;

        while (number > 0) {
            number /= 10;
            digitCounter++;
        }

        return digitCounter;
    }

    /**
     * Función para calcular la potencia
     * @param base base de la potencia
     * @param exponent exponente de la potencia
     * @return retorna la potencia del número, empleando recursividad para llegar hasta exponent = 0
     */
    public int calcPower(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        return base * calcPower(base, exponent - 1);
    }
}