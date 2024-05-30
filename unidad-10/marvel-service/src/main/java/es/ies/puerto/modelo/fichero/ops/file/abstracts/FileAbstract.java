package es.ies.puerto.modelo.fichero.ops.file.abstracts;

import es.ies.puerto.modelo.fichero.ops.PersonajeList;
import es.ies.puerto.modelo.fichero.ops.interfaces.ICrudOperaciones;
import es.ies.puerto.modelo.fichero.ops.utilidades.UtilidadesClass;

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
