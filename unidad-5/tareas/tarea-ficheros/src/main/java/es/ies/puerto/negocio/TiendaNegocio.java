package es.ies.puerto.negocio;

import es.ies.puerto.modelo.abstractas.Producto;
import es.ies.puerto.modelo.entity.*;
import es.ies.puerto.modelo.fichero.implementa.csv.FileCsv;
import es.ies.puerto.modelo.implementa.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementa metodos para trabajar con datos almacenados en la tienda
 * @author Jose Maximiliano Boada Martin
 */
public class TiendaNegocio {
    private Tienda tienda;
    private FileCsv fileCsv;
    public TiendaNegocio() {
        fileCsv = new FileCsv();
        tienda = new Tienda();
        tienda.setAlimentos(fileCsv.obtenerAlimentos());
        tienda.setAparatos(fileCsv.obtenerAparatos());
        tienda.setSouvenirs(fileCsv.obtenerSouvenirs());
        tienda.setPCuidadoMap(fileCsv.obtenerCuidados());
    }

    /**
     * Agrega un alimento a la lista
     * @param alimento a agregar
     * @return 0 si no hubo error, 1 si el elemento ya existe
     */
    public boolean agregarAlimento(Producto alimento) {
        if (!tienda.getAlimentos().contains(alimento)) {
            tienda.getAlimentos().add(alimento);
            return false;
        }
        return true;
    }

    /**
     * Retira un alimento de la lista
     * @param alimento a retirar
     * @return 0 si no hubo error, 1 si el elemento no existia
     */
    public boolean eliminarAlimento(Producto alimento) {
        if (tienda.getAlimentos().contains(alimento)) {
            tienda.getAlimentos().remove(alimento);
            return false;
        }
        return true;
    }

    /**
     * Obtiene el alimento por su identificador
     * @param udi del alimento
     * @return alimento
     */
    public Producto obtenerAlimento(String udi) {
        Producto alimento = new Alimento(udi);
            if (tienda.getAlimentos().contains(alimento)) {
                int pos = tienda.getAlimentos().indexOf(alimento);
                return tienda.getAlimentos().get(pos);
            }
        return null;
    }

    /**
     * Agrega un aparato al set
     * @param aparato a agregar
     * @return 0 si no hubo error, 1 si el elemento ya existe
     */
    public boolean agregarAparato(Producto aparato) {
        if (!tienda.getAparatos().contains(aparato)) {
            tienda.getAparatos().add(aparato);
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
    public boolean eliminarAparato(Producto aparato) {
        if (tienda.getAparatos().contains(aparato)) {
            tienda.getAparatos().remove(aparato);
            return false;
        }
        return true;
    }

    /**
     * Obtiene el aparato por su identificador
     * @param udi del aparato
     * @return aparato
     */
    public Producto obtenerAparato(String udi) {
        Producto aparato = new Aparato(udi);
        //En el caso de los set, hay que recorrerlo con for y equals si o si, puesto que los set no tienen indices
        for (Producto elemento : tienda.getAparatos()) {
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
    public boolean agregarSouvenir(Producto souvenir) {
        if (!tienda.getSouvenirs().contains(souvenir)) {
            tienda.getSouvenirs().add(souvenir);
            return false;
        }
        return true;
    }

    /**
     * Retira un souvenir del map
     * @param souvenir a retirar
     * @return 0 si no hubo error, 1 si el elemento no existia
     */
    public boolean eliminarSouvenir(Producto souvenir) {
        if (tienda.getSouvenirs().contains(souvenir)) {
            tienda.getSouvenirs().remove(souvenir);
            return false;
        }
        return true;
    }

    /**
     * Obtiene el souvenir por su identificador
     * @param udi del souvenir
     * @return souvenir
     */
    public Producto obtenerSouvenir(String udi) {
        Producto souvenir = new Souvenir(udi);
        for (Producto elemento : tienda.getSouvenirs()) {
            if (elemento.equals(souvenir)) {
                return elemento;
            }
        }
        return null;
    }

    /**
     * Agrega un producto de cuidado personal
     * @param cuidadoPersonal a agregar
     * @return 0 si no hubo error, 1 si el elemento ya existe
     */
    public boolean agregarCuidadoPersonal(Producto cuidadoPersonal) {
        if (!tienda.getPCuidadoMap().containsKey(cuidadoPersonal.getUdi())) {
            tienda.getPCuidadoMap().put(cuidadoPersonal.getUdi(), cuidadoPersonal);
            return false;
        }
        return true;
    }

    /**
     * Retira un producto de cuidado personal del set
     * @param cuidadoPersonal a retirar
     * @return 0 si no hubo error, 1 si el elemento no existia
     */
    public boolean eliminarCuidadoPersonal(Producto cuidadoPersonal) {
        if (tienda.getPCuidadoMap().containsKey(cuidadoPersonal.getUdi())) {
            tienda.getPCuidadoMap().remove(cuidadoPersonal.getUdi());
            return false;
        }
        return true;
    }

    /**
     * Obtiene el producto de cuidado personal por su identificador
     * @param udi del producto
     * @return producto de cuidado personal
     */
    public Producto obtenerCuidadoPersonal(String udi) {
        if (tienda.getPCuidadoMap().containsKey(udi)) {
            return tienda.getPCuidadoMap().get(udi);
        }
        return null;
    }

    /**
     * Calcula el precio total de los alimentos (los caducados no se pueden vender)
     * @return precio total
     */
    public float precioTotalAlimentos() {
        float resultado = 0f;
        if (tienda.getAlimentos().isEmpty()) {
            return resultado;
        }

        float suma = 0;
        for (Producto alimento : tienda.getAlimentos()) {
            Alimento alimentoAux = (Alimento) alimento;
            if (!alimentoAux.verificarCaducidad()) {
                resultado += alimento.getPrecio();
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
        if (tienda.getAparatos().isEmpty()) {
            return resultado;
        }
        for (Producto aparato : tienda.getAparatos()) {
            resultado += aparato.getPrecio();
        }
        return resultado;
    }

    /**
     * Calcula el precio total de los souvenirs
     * @return precio total
     */
    public float precioTotalSouvenirs() {
        float resultado = 0f;
        if (tienda.getSouvenirs().isEmpty()) {
            return resultado;
        }
        for (Producto souvenir : tienda.getSouvenirs()) {
            resultado += souvenir.getPrecio();
        }
        return resultado;
    }

    /**
     * Calcula el precio total de los productos de cuidado personal
     * @return precio total
     */
    public float precioTotalCuidadoPersonal() {
        float resultado = 0f;
        if (tienda.getPCuidadoMap().isEmpty()) {
            return resultado;
        }
        for (Producto cuidadoPersonal : tienda.getPCuidadoMap().values()) {
            resultado += cuidadoPersonal.getPrecio();
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
        if (tienda.getAlimentos().isEmpty()) {
            return resultado;
        }
        for (Producto alimento : tienda.getAlimentos()) {
            Alimento alimentoAux = (Alimento) alimento;
            if (!alimentoAux.verificarCaducidad()) {
                resultado += (alimento.precioMaximo() - alimento.getPrecio());
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
        if (tienda.getAparatos().isEmpty()) {
            return resultado;
        }
        for (Producto aparato : tienda.getAparatos()) {
            resultado += (aparato.precioMaximo() - aparato.getPrecio());
        }
        return resultado;
    }

    /**
     * Calcula el precio total de los souvenirs
     * @return ganancia total
     */
    public float gananciaTotalSouvenirs() {
        float resultado = 0f;
        if (tienda.getSouvenirs().isEmpty()) {
            return resultado;
        }
        for (Producto souvenir : tienda.getSouvenirs()) {
            resultado += (souvenir.precioMaximo() - souvenir.getPrecio());
        }
        return resultado;
    }

    /**
     * Calcula el precio total de los productos de cuidado personal
     * @return ganancia total
     */
    public float gananciaTotalCuidadoPersonal() {
        float resultado = 0f;
        if (tienda.getPCuidadoMap().isEmpty()) {
            return resultado;
        }
        for (Producto cuidadoPersonal : tienda.getPCuidadoMap().values()) {
            resultado += (cuidadoPersonal.precioMaximo() - cuidadoPersonal.getPrecio());
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
        return "Alimentos: " + tienda.getAlimentos().size() +
                "\nAparatos: " + tienda.getAparatos().size() +
                "\nSouvenirs: " + tienda.getSouvenirs().size() +
                "\nProductos de cuidado personal: " + tienda.getPCuidadoMap().size();
    }

    /**
     * Muestra los productos de cuidado personal recomendados
     * @return informacion sobre productos recomendados
     */
    public String mostrarRecomendados() {
        String resultado = "";
        if (tienda.getPCuidadoMap().isEmpty()) {
            return resultado;
        }

        resultado = "Los productos recomendados son:";
        for (Producto cuidadoPersonal : tienda.getPCuidadoMap().values()) {
            CuidadoPersonal cPersonalAux = (CuidadoPersonal) cuidadoPersonal;
            if (cPersonalAux.recomendarProducto()) {
                resultado += "\n" + cuidadoPersonal;
            }
        }
        return resultado;
    }

    public List<Producto> obtenerProductos() {
        List<Producto> productos = new ArrayList<>();
        productos.addAll(fileCsv.obtenerAlimentos());
        productos.addAll(fileCsv.obtenerAparatos());
        productos.addAll(fileCsv.obtenerSouvenirs());
        productos.addAll(fileCsv.obtenerCuidados().values());


        return productos;
    }
}
