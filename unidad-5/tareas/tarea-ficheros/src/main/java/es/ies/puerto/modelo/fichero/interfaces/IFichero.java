package es.ies.puerto.modelo.fichero.interfaces;

import es.ies.puerto.modelo.abstractas.Producto;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Interfaz para lectura y escritura de articulos
 * @author Jose Maximiliano Boada Martin
 */
public interface IFichero {
    public List<Producto> lecturaList(String path);
    public Set<Producto> lecturaSet(String path, String producto);
    public Map<String, Producto> lecturaMap(String path);
    public boolean escritura(String path, String contenido);
}
