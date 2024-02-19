package es.ies.puerto.implementa;

import es.ies.puerto.abstractas.Producto;

/**
 * Clase de souvenirs que extienden producto
 * @author Jose Maximiliano Boada Martin
 */
public class Souvenir extends Producto {

    /**
     * Constructor por defecto
     */
    public Souvenir() {}

    /**
     * Constructor con identificador como parametro
     * @param udi del souvenir
     */
    public Souvenir(String udi) {
        super(udi);
    }

    /**
     * Constructor con todos los parametros
     * @param nombre del souvenir
     * @param precio del souvenir
     * @param fechaEntrada del souvenir
     * @param udi del souvenir
     */
    public Souvenir(String nombre, float precio, String fechaEntrada, String udi) {
        super(nombre, precio, fechaEntrada, udi);
    }

    /**
     * Calcula el precio maximo para los souvenirs
     * @return precio máximo
     */
    @Override
    public float precioMaximo() {
        return getPrecio() * 1.3f;
    }

    /**
     * Cantidad disponible de souvenirs
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
