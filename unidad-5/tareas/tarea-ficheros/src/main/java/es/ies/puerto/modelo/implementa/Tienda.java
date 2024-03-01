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
    private Set<Producto> souvenirs;
    private Map<String, Producto> pCuidadoMap;

    /**
     * Constructor por defecto
     */
    public Tienda () {
        alimentos = new ArrayList<>();
        aparatos = new HashSet<>();
        souvenirs = new HashSet<>();
        pCuidadoMap = new HashMap<>();
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

    public Set<Producto> getSouvenirs() {
        return souvenirs;
    }

    public void setSouvenirs(Set<Producto> souvenirs) {
        this.souvenirs = souvenirs;
    }

    public Map<String, Producto> getPCuidadoMap() {
        return pCuidadoMap;
    }

    public void setPCuidadoMap(Map<String, Producto> pCuidadoMap) {
        this.pCuidadoMap = pCuidadoMap;
    }

    @Override
    public String toString() {
        return "(" +
                "\nAlimentos: " + alimentos +
                "\nAparatos=" + aparatos +
                "\n Souvenirs=" + souvenirs +
                "\n pCuidadoMap=" + pCuidadoMap + ")";
    }
}
