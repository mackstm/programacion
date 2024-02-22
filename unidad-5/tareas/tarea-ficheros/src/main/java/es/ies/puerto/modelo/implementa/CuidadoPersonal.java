package es.ies.puerto.modelo.implementa;

import es.ies.puerto.modelo.abstractas.ProductoRecomendable;

/**
 * Clase para productos de cuidado personal
 * @author Jose Maximiliano Boada Martin
 */
public class CuidadoPersonal extends ProductoRecomendable {

    /**
     * Constructor por defecto
     */
    public CuidadoPersonal() {}

    /**
     * Constructor con identificador como parametro
     * @param udi del producto de cuidado personal
     */
    public CuidadoPersonal(String udi) {
        super(udi);
    }

    /**
     * Constructor con todos los parametros
     * @param nombre del producto de cuidado personal
     * @param precio del producto de cuidado personal
     * @param fechaEntrada del producto de cuidado personal
     * @param udi del producto de cuidado personal
     */
    public CuidadoPersonal(String nombre, float precio, String fechaEntrada, String udi, int popularidad) {
        super(nombre, precio, fechaEntrada, udi, popularidad);
    }

    /**
     * Recomienda el producto si tiene una popularidad de 7 o mas
     * @return
     */
    @Override
    public boolean recomendarProducto() {
        return  getPopularidad() >= 7;
    }

    /**
     * Calcula el precio maximo para los productos de cuidado personal
     * @return precio máximo
     */
    @Override
    public float precioMaximo() {
        return getPrecio() * 1.8f;
    }

    /**
     * Cantidad disponible de productos de cuidado personal
     * @return cantidad disponible
     */
    @Override
    public int cantidadDisponible() {
        return 0;
    }
}
