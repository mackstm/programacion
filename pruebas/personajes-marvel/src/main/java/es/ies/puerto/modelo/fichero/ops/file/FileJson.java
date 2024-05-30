package es.ies.puerto.modelo.fichero.ops.file;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import es.ies.puerto.modelo.fichero.ops.Personaje;
import es.ies.puerto.modelo.fichero.ops.file.abstracts.FileAbstract;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que trabaja con datos en fichero json
 * @author Jose Maximiliano Boada Martin
 */
public class FileJson extends FileAbstract {

    /**
     * Constructor por defecto
     */
    public FileJson() {
        super("src/main/resources/data.json");
    }

    /**
     * Obtiene lista de personajes en fichero
     * @return personajes
     */
    @Override
    public List<Personaje> obtenerPersonajes() {
        String json = null;
        try {
            json = new String(Files.readAllBytes(Paths.get(getPath())));
            Type listType = new TypeToken<ArrayList<Personaje>>(){}.getType();
            getPersonajeList().setPersonajes(new Gson().fromJson(json, listType));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return getPersonajeList().getPersonajes();
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
        guardarDatos(getPersonajeList().getPersonajes());
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
        guardarDatos(getPersonajeList().getPersonajes());
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
        guardarDatos(getPersonajeList().getPersonajes());
    }

    /**
     * Se utiliza en los metodos de escritura
     * @param personajes a escribir
     */
    private void guardarDatos(List<Personaje> personajes) {
        try (FileWriter writer = new FileWriter(getPath())) {
            new GsonBuilder().setPrettyPrinting().create().toJson(personajes, writer);
        } catch (IOException e) {
            System.err.println("Error al guardar datos: " + e.getMessage());
        }
    }
}
