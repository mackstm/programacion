package es.ies.puerto.modelo.implementa;

import java.util.*;

/**
 * Clase tienda que contiene listas, sets y maps de todos los productos
 * @author Jose Maximiliano Boada Martin
 */
public class Tienda {
    /**
     * Propiedades
     */
    private List<Alimento> alimentos;
    private Set<Aparato> aparatos;
    private Map<String, Souvenir> souvenirMap;
    private Set<CuidadoPersonal> productosCuidado;

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
    public List<Alimento> getAlimentos() {
        return alimentos;
    }

    public void setAlimentos(List<Alimento> alimentos) {
        this.alimentos = alimentos;
    }

    public Set<Aparato> getAparatos() {
        return aparatos;
    }

    public void setAparatos(Set<Aparato> aparatos) {
        this.aparatos = aparatos;
    }

    public Map<String, Souvenir> getSouvenirMap() {
        return souvenirMap;
    }

    public void setSouvenirMap(Map<String, Souvenir> souvenirMap) {
        this.souvenirMap = souvenirMap;
    }

    public Set<CuidadoPersonal> getProductosCuidado() {
        return productosCuidado;
    }

    public void setProductosCuidado(Set<CuidadoPersonal> productosCuidado) {
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
