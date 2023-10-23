package ies.puerto;

/**
 * Realiza una funcion que realiza el calculo del area en cuadrado y un rectangulo.
 * @author Jose Maximiliano Boada Martin
 */
public class Ejercicio3 {

    /**
     * Funcion para calcular el area de un cuadrado
     * @param lado del cuadrado
     * @return lado * lado, area del cuadrado
     */
    public int areaCuadrado(int lado) {
        return areaRectangulo(lado, lado);
    }

    /**
     * Funcion para calcular el area de un rectangulo
     * @param ladoA base del rectangulo
     * @param ladoB altura del rectangulo
     * @return base * altura, area del rectangulo
     */
    public int areaRectangulo(int ladoA, int ladoB) {
        return ladoA * ladoB;
    }
}