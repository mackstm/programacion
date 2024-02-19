package es.ies.puerto.abstractas;

import es.ies.puerto.interfaces.IRecomendable;

/**
 * Clase abstracta que extiende de producto e implementa la interfaz de de IRecomendable
 * @author Jose Maximiliano Boada Martin
 */
public abstract class ProductoRecomendable extends Producto implements IRecomendable {
    /**
     * Propiedades
     */
    private int popularidad;

    /**
     * Constructor por defecto
     */
    public ProductoRecomendable() {}

    /**
     * Constructor con parametro unico de identificador de producto
     * @param udi de producto
     */
    public ProductoRecomendable(String udi) {
        super(udi);
    }

    /**
     * Constructor con todos los parametros relevantes
     * @param nombre
     * @param precio
     * @param fechaEntrada
     * @param udi
     */
    public ProductoRecomendable(String nombre, float precio, String fechaEntrada, String udi, int popularidad) {
        super(nombre, precio, fechaEntrada, udi);
        this.popularidad = popularidad;
    }

    /**
     * Getters y setters
     */
    public int getPopularidad() {
        return popularidad;
    }

    public void setPopularidad(int popularidad) {
        this.popularidad = popularidad;
    }

    @Override
    public String toString() {
        return "{Nombre: " + getNombre() +
                ", precio normal: " + getPrecio() +
                ", precio maximo: " + precioMaximo() +
                ", nivel de popularidad: " + popularidad +
                ", fecha de entrada: " + getFechaEntrada() +
                ", UDI: " + getUdi() + "}";
    }
}
