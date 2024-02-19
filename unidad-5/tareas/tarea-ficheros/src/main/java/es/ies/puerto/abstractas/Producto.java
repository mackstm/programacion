package es.ies.puerto.abstractas;

import es.ies.puerto.interfaces.IVendible;

import java.util.Objects;

/**
 * Clase abstracta para productos que implementa la interfaz IVendible
 * @author Jose Maximiliano Boada Martin
 */
public abstract class Producto implements IVendible {
    /**
     * Propiedades
     */
    private String nombre;
    private float precio;
    private String fechaEntrada;
    private String udi;

    /**
     * Constructor por defecto
     */
    public Producto() {}

    /**
     * Constructor que pide solamente el identificador del producto
     * @param udi del producto
     */
    public Producto(String udi) {
        this.udi = udi;
    }

    /**
     * Constructor con todos los datos relevantes al producto
     * @param nombre del producto
     * @param precio del producto
     * @param fechaEntrada del producto
     * @param udi del producto
     */
    public Producto(String nombre, float precio, String fechaEntrada, String udi) {
        this.nombre = nombre;
        this.precio = precio;
        this.fechaEntrada = fechaEntrada;
        this.udi = udi;
    }

    /**
     * Getters y setters
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public String getUdi() {
        return udi;
    }

    public void setUdi(String udi) {
        this.udi = udi;
    }

    @Override
    public String toString() {
        return "{Nombre: " + nombre +
                ", precio: " + precio +
                ", fecha de entrada: " + fechaEntrada +
                ", UDI: " + udi + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return Objects.equals(udi, producto.udi);
    }

    @Override
    public int hashCode() {
        return Objects.hash(udi);
    }
}
