package es.ies.puerto.implementa;

import es.ies.puerto.abstractas.Producto;

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
     * Constructor con todos los parametros relevantes
     * @param alimentos de tienda
     * @param aparatos de tienda
     * @param souvenirMap de tienda
     * @param productosCuidado de tienda
     */
    public Tienda(List<Producto> alimentos, Set<Producto> aparatos, Map<String, Producto> souvenirMap, Set<Producto> productosCuidado) {
        this.alimentos = alimentos;
        this.aparatos = aparatos;
        this.souvenirMap = souvenirMap;
        this.productosCuidado = productosCuidado;
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

    /**
     * Agrega un alimento a la lista
     * @param alimento a agregar
     * @return 0 si no hubo error, 1 si el elemento ya existe
     */
    public boolean agregarAlimento(Alimento alimento) {
        if (!alimentos.contains(alimento)) {
            alimentos.add(alimento);
            return false;
        }
        return true;
    }

    /**
     * Retira un alimento de la lista
     * @param alimento a retirar
     * @return 0 si no hubo error, 1 si el elemento no existia
     */
    public boolean eliminarAlimento(Alimento alimento) {
        if (alimentos.contains(alimento)) {
            alimentos.remove(alimento);
            return false;
        }
        return true;
    }

    /**
     * Obtiene el alimento por su identificador
     * @param udi del alimento
     * @return alimento
     */
    public Alimento obtenerAlimento(String udi) {
        Alimento alimento = new Alimento(udi);
        for (Alimento elemento : alimentos) {
            if (elemento.equals(alimento)) {
                return elemento;
            }
        }
        return null;
    }

    /**
     * Agrega un aparato al set
     * @param aparato a agregar
     * @return 0 si no hubo error, 1 si el elemento ya existe
     */
    public boolean agregarAparato(Aparato aparato) {
        if (!aparatos.contains(aparato)) {
            aparatos.add(aparato);
            return false;
        }
        return true;
    }

    /**
     * Retira un aparato del set. Un set no puede contener elementos duplicados, pero el boolean puede servir para
     * notificar al usuario de que su producto no se ha podido agregar
     * @param aparato a retirar
     * @return 0 si no hubo error, 1 si el elemento no existia
     */
    public boolean eliminarAparato(Aparato aparato) {
        if (aparatos.contains(aparato)) {
            aparatos.remove(aparato);
            return false;
        }
        return true;
    }

    /**
     * Obtiene el aparato por su identificador
     * @param udi del aparato
     * @return aparato
     */
    public Aparato obtenerAparato(String udi) {
        Aparato aparato = new Aparato(udi);
        for (Aparato elemento : aparatos) {
            if (elemento.equals(aparato)) {
                return elemento;
            }
        }
        return null;
    }

    /**
     * Agrega un souvenir al map
     * @param souvenir a agregar
     * @return 0 si no hubo error, 1 si el elemento ya existe
     */
    public boolean agregarSouvenir(Souvenir souvenir) {
        if (!souvenirMap.containsKey(souvenir.getUdi())) {
            souvenirMap.put(souvenir.getUdi(), souvenir);
            return false;
        }
        return true;
    }

    /**
     * Retira un souvenir del map
     * @param souvenir a retirar
     * @return 0 si no hubo error, 1 si el elemento no existia
     */
    public boolean eliminarSouvenir(Souvenir souvenir) {
        if (souvenirMap.containsKey(souvenir.getUdi())) {
            souvenirMap.remove(souvenir.getUdi());
            return false;
        }
        return true;
    }

    /**
     * Obtiene el souvenir por su identificador
     * @param udi del souvenir
     * @return souvenir
     */
    public Souvenir obtenerSouvenir(String udi) {
        Souvenir souvenir = new Souvenir(udi);
        for (Souvenir elemento : souvenirMap.values()) {
            if (elemento.equals(souvenir)) {
                return elemento;
            }
        }
        return null;
    }

    /**
     * Agrega un producto de cuidado personal al set. Un set no puede contener elementos duplicados, pero el boolean
     * puede servir para notificar al usuario de que su producto no se ha podido agregar
     * @param cuidadoPersonal a agregar
     * @return 0 si no hubo error, 1 si el elemento ya existe
     */
    public boolean agregarCuidadoPersonal(CuidadoPersonal cuidadoPersonal) {
        if (!productosCuidado.contains(cuidadoPersonal)) {
            productosCuidado.add(cuidadoPersonal);
            return false;
        }
        return true;
    }

    /**
     * Retira un producto de cuidado personal del set
     * @param cuidadoPersonal a retirar
     * @return 0 si no hubo error, 1 si el elemento no existia
     */
    public boolean eliminarCuidadoPersonal(CuidadoPersonal cuidadoPersonal) {
        if (productosCuidado.contains(cuidadoPersonal)) {
            productosCuidado.remove(cuidadoPersonal);
            return false;
        }
        return true;
    }

    /**
     * Obtiene el producto de cuidado personal por su identificador
     * @param udi del producto
     * @return producto de cuidado personal
     */
    public CuidadoPersonal obtenerCuidadoPersonal(String udi) {
        CuidadoPersonal cuidadoPersonal = new CuidadoPersonal(udi);
        for (CuidadoPersonal elemento : productosCuidado) {
            if (elemento.equals(cuidadoPersonal)) {
                return elemento;
            }
        }
        return null;
    }

    /**
     * Calcula el precio total de los alimentos (los caducados no se pueden vender)
     * @return precio total
     */
    public float precioTotalAlimentos() {
        float resultado = 0f;
        if (alimentos.isEmpty()) {
            return resultado;
        }

        float suma = 0;
        for (Alimento alimento : alimentos) {
            if (!alimento.verificarCaducidad()) {
                suma += alimento.getPrecio();
            }
        }
        return resultado;
    }

    /**
     * Calcula el precio total de los aparatos
     * @return precio total
     */
    public float precioTotalAparatos() {
        float resultado = 0f;
        if (alimentos.isEmpty()) {
            return resultado;
        }

        float suma = 0;
        for (Aparato aparato : aparatos) {
            suma += aparato.getPrecio();
        }
        return resultado;
    }

    /**
     * Calcula el precio total de los souvenirs
     * @return precio total
     */
    public float precioTotalSouvenirs() {
        float resultado = 0f;
        if (souvenirMap.isEmpty()) {
            return resultado;
        }

        float suma = 0;
        for (Souvenir souvenir : souvenirMap.values()) {
            suma += souvenir.getPrecio();
        }
        return resultado;
    }

    /**
     * Calcula el precio total de los productos de cuidado personal
     * @return precio total
     */
    public float precioTotalCuidadoPersonal() {
        float resultado = 0f;
        if (productosCuidado.isEmpty()) {
            return resultado;
        }

        float suma = 0;
        for (CuidadoPersonal cuidadoPersonal : productosCuidado) {
            suma += cuidadoPersonal.getPrecio();
        }
        return resultado;
    }

    /**
     * Calcula el precio total de los productos de la tienda
     * @return precio total
     */
    public float precioTotalTienda() {
        return precioTotalAlimentos() + precioTotalAparatos() + precioTotalSouvenirs() + precioTotalCuidadoPersonal();
    }

    /**
     * Calcula la ganancia total de los alimentos (los caducados no se pueden vender)
     * @return ganancia total
     */
    public float gananciaTotalAlimentos() {
        float resultado = 0f;
        if (alimentos.isEmpty()) {
            return resultado;
        }

        float suma = 0;
        for (Alimento alimento : alimentos) {
            if (!alimento.verificarCaducidad()) {
                suma += alimento.precioMaximo();
            }
        }
        return resultado;
    }

    /**
     * Calcula la ganancia total de los aparatos
     * @return ganancia total
     */
    public float gananciaTotalAparatos() {
        float resultado = 0f;
        if (alimentos.isEmpty()) {
            return resultado;
        }

        float suma = 0;
        for (Aparato aparato : aparatos) {
            suma += aparato.precioMaximo();
        }
        return resultado;
    }

    /**
     * Calcula el precio total de los souvenirs
     * @return ganancia total
     */
    public float gananciaTotalSouvenirs() {
        float resultado = 0f;
        if (souvenirMap.isEmpty()) {
            return resultado;
        }

        float suma = 0;
        for (Souvenir souvenir : souvenirMap.values()) {
            suma += souvenir.precioMaximo();
        }
        return resultado;
    }

    /**
     * Calcula el precio total de los productos de cuidado personal
     * @return ganancia total
     */
    public float gananciaTotalCuidadoPersonal() {
        float resultado = 0f;
        if (productosCuidado.isEmpty()) {
            return resultado;
        }

        float suma = 0;
        for (CuidadoPersonal cuidadoPersonal : productosCuidado) {
            suma += cuidadoPersonal.precioMaximo();
        }
        return resultado;
    }

    /**
     * Calcula las ganancias totales de la tienda
     * @return ganancia total
     */
    public float gananciaTotalTienda() {
        return gananciaTotalAlimentos() + gananciaTotalAparatos() + gananciaTotalSouvenirs() +
                gananciaTotalCuidadoPersonal();
    }

    /**
     * Muestra las cantidades de cada tipo de producto
     * @return informacion sobre cantidades
     */
    public String mostrarCantidades() {
        return "Alimentos: " + alimentos.size() +
                "\nAparatos: " + aparatos.size() +
                "\nSouvenirs: " + souvenirMap.size() +
                "\nProductos de cuidado personal: " + productosCuidado.size();
    }

    /**
     * Muestra los productos de cuidado personal recomendados
     * @return informacion sobre productos recomendados
     */
    public String mostrarRecomendados() {
        String resultado = "";
        if (productosCuidado.isEmpty()) {
            return resultado;
        }

        resultado = "Los productos recomendados son:";
        for (CuidadoPersonal cuidadoPersonal : productosCuidado) {
            if (cuidadoPersonal.recomendarProducto()) {
                resultado += "\n" + cuidadoPersonal;
            }
        }
        return resultado;
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
