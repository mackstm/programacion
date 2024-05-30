package es.ies.puerto.modelo.fichero.ops.file;

import es.ies.puerto.modelo.fichero.ops.Personaje;
import es.ies.puerto.modelo.fichero.ops.PersonajeList;
import es.ies.puerto.modelo.fichero.ops.file.abstracts.FileAbstract;
import org.simpleframework.xml.core.Persister;

import java.io.File;
import java.util.List;

/**
 * Clase que trabaja con datos en fichero xml
 * @author Jose Maximiliano Boada Martin
 */
public class FileXml extends FileAbstract {

    /**
     * Constructor por defecto
     */
    public FileXml() {
        super("src/main/resources/data.xml");
    }

    /**
     * Obtiene lista de personajes en fichero
     * @return personajes
     */
    @Override
    public List<Personaje> obtenerPersonajes() {
        Persister serializer = new Persister();
        try {
            File file = new File(getPath());
            PersonajeList personajeList = serializer.read(PersonajeList.class, file);
            getPersonajeList().setPersonajes(personajeList.getPersonajes()) ;
            return personajeList.getPersonajes();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Obtiene un personaje del fichero
     * @param personaje a obtener
     * @return personaje obtenido
     */
    @Override
    public Personaje obtenerPersonaje(Personaje personaje) {
        if (!getPersonajeList().getPersonajes().contains(personaje)) {
            return null;
        }
        int posicion = getPersonajeList().getPersonajes().indexOf(personaje);
        return getPersonajeList().getPersonajes().get(posicion);
    }

    /**
     * Agrega un personaje al fichero
     * @param personaje a agregar
     */
    @Override
    public void addPersonaje(Personaje personaje) {
        if (getPersonajeList().getPersonajes().contains(personaje)) {
            return;
        }
        getPersonajeList().getPersonajes().add(personaje);
        actualizarFichero(getPersonajeList().getPersonajes());
    }

    /**
     * Elimina un personaje del fichero
     * @param personaje a eliminar
     */
    @Override
    public void deletePersonaje(Personaje personaje) {
        if (!getPersonajeList().getPersonajes().contains(personaje)) {
            return;
        }
        getPersonajeList().getPersonajes().remove(personaje);
        actualizarFichero(getPersonajeList().getPersonajes());
    }

    /**
     * Modifica un personaje del fichero
     * @param personaje a modificar
     */
    @Override
    public void updatePersonaje(Personaje personaje) {
        if (!getPersonajeList().getPersonajes().contains(personaje)) {
            return;
        }
        int posicion = getPersonajeList().getPersonajes().indexOf(personaje);
        getPersonajeList().getPersonajes().set(posicion, personaje);
        actualizarFichero(getPersonajeList().getPersonajes());
    }

    /**
     * Se utiliza en los metodos de escritura
     * @param personajes a escribir
     */
    private void actualizarFichero (List<Personaje> personajes) {
        PersonajeList personajeList = new PersonajeList(personajes);
        Persister serializer = new Persister();
        try {
            serializer.write(personajeList, new File(getPath()));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
