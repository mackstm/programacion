package es.ies.puerto.abstractas;

import es.ies.puerto.interfaces.ISaludable;

public abstract class ProductoFresco extends Producto implements ISaludable {
    /**
     * Propiedades
     */
    private String fechaCaducidad;

    /**
     * Constructor por defecto
     */
    public ProductoFresco() {}

    /**
     * Constructor que pide solamente el identificador
     * @param udi del producto
     */
    public ProductoFresco(String udi) {
        super(udi);
    }

    /**
     * Constructor con todos los datos relevantes a esta clase
     * @param nombre del producto
     * @param precio del producto
     * @param fechaEntrada del producto
     * @param udi del producto
     * @param fechaCaducidad del producto
     */
    public ProductoFresco(String nombre, float precio, String fechaEntrada, String udi, String fechaCaducidad) {
        super(nombre, precio, fechaEntrada, udi);
        this.fechaCaducidad = fechaCaducidad;
    }

    /**
     * Getters y setters
     */
    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public String toString() {
        return "{Nombre: " + getNombre() +
                ", precio: " + getPrecio() +
                ", fecha de entrada: " + getFechaEntrada() +
                ", UDI: " + getUdi() +
                ", Fecha de caducidad: " + fechaCaducidad + "}";
    }
}
