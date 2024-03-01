package es.ies.puerto.modelo.implementa;

import es.ies.puerto.modelo.abstractas.Producto;

import java.util.*;

/**
 * Clase tienda que contiene listas, sets y maps de todos los productos
 * @author Jose Maximiliano Boada Martin
 */
public class Tienda {
    /**
     * Propiedades
     */
    private List<Producto> alimentos;
    private Set<Producto> aparatos;
    private Map<String, Producto> souvenirMap;
    private Set<Producto> productosCuidado;

    /**
     * Constructor por defecto
     */
    public Tienda () {
        alimentos = new ArrayList<>();
        aparatos = new HashSet<>();
        souvenirMap = new HashMap<>();
        productosCuidado = new HashSet<>();
    }

    /**
     * Getters y setters
     */
    public List<Producto> getAlimentos() {
        return alimentos;
    }

    public void setAlimentos(List<Producto> alimentos) {
        this.alimentos = alimentos;
    }

    public Set<Producto> getAparatos() {
        return aparatos;
    }

    public void setAparatos(Set<Producto> aparatos) {
        this.aparatos = aparatos;
    }

    public Map<String, Producto> getSouvenirMap() {
        return souvenirMap;
    }

    public void setSouvenirMap(Map<String, Producto> souvenirMap) {
        this.souvenirMap = souvenirMap;
    }

    public Set<Producto> getProductosCuidado() {
        return productosCuidado;
    }

    public void setProductosCuidado(Set<Producto> productosCuidado) {
        this.productosCuidado = productosCuidado;
    }

    @Override
    public String toString() {
        return "(" +
                "\nAlimentos: " + alimentos +
                "\nAparatos=" + aparatos +
                "\n SouvenirMap=" + souvenirMap +
                "\n ProductosCuidado=" + productosCuidado + ")";
    }
}
