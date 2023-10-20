package ies.puerto;

/**
 * Realiza una función que realiza el cálculo del área en cuadrado y un rectángulo.
 * @author José Maximiliano Boada Martín
 */
public class Ejercicio3 {

    /**
     * Función para calcular el área de un cuadrado
     * @param lado del cuadrado
     * @return lado * lado, área del cuadrado
     */
    public int areaCuadrado(int lado) {
        return lado * lado;
    }

    /**
     * Función para calcular el área de un rectángulo
     * @param ladoA base del rectángulo
     * @param ladoB altura del rectángulo
     * @return base * altura, área del rectángulo
     */
    public int areaRectangulo(int ladoA, int ladoB) {
        return ladoA * ladoB;
    }
}