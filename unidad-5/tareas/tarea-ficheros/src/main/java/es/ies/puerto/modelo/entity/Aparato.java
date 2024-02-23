package es.ies.puerto.modelo.entity;

import es.ies.puerto.modelo.abstractas.Producto;

/**
 * Clase para los aparatos de la tienda
 * @author Jose Maximiliano Boada Martin
 */
public class Aparato extends Producto {

    /**
     * Constructor por defecto
     */
    public Aparato() {}

    /**
     * Constructor con identificador como parametro
     * @param udi del aparato
     */
    public Aparato(String udi) {
        super(udi);
    }

    /**
     * Constructor con todos los parametros
     * @param nombre del aparato
     * @param precio del aparato
     * @param fechaEntrada del aparato
     * @param udi del aparato
     */

    public Aparato(String nombre, float precio, String fechaEntrada, String udi) {
        super(nombre, precio, fechaEntrada, udi);
    }

    /**
     * Calcula el precio maximo para los aparatos
     * @return precio máximo
     */
    @Override
    public float precioMaximo() {
        return getPrecio() * 1.42f;
    }

    /**
     * Cantidad disponible de aparatos
     * @return cantidad disponible
     */
    @Override
    public int cantidadDisponible() {
        return 0;
    }

    @Override
    public String toString() {
        return "{Nombre: " + getNombre() +
                ", precio normal: " + getPrecio() +
                ", precio maximo: " + precioMaximo() +
                ", fecha de entrada: " + getFechaEntrada() +
                ", UDI: " + getUdi() + "}";
    }
}
