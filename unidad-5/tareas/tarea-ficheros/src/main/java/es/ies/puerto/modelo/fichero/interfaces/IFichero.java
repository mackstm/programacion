package es.ies.puerto.modelo.fichero.interfaces;

import es.ies.puerto.modelo.entity.Alimento;

import java.util.List;

/**
 * Interfaz para lectura y escritura de articulos
 * @author Jose Maximiliano Boada Martin
 */
public interface IFichero {
    public List<Alimento> lecturaAlimento();
    public String escrituraAlimento();
}
