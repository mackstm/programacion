package es.ies.puerto.modelo.file.abstracts;

import es.ies.puerto.modelo.PersonajeList;
import es.ies.puerto.modelo.interfaces.ICrudOperaciones;
import es.ies.puerto.utilidades.UtilidadesClass;

/**
 * Clase abstracta para trabajar con distintos tipos de fichero
 * @author Jose Maximiliano Boada Martin
 */
public abstract class FileAbstract extends UtilidadesClass implements ICrudOperaciones {
    private PersonajeList personajeList;
    private String path;

    public FileAbstract(String path) {
        personajeList = new PersonajeList();
        this.path = path;
    }

    public PersonajeList getPersonajeList() {
        return personajeList;
    }

    public String getPath() {
        return path;
    }
}
