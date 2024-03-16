package es.ies.puerto.modelo.file;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import es.ies.puerto.modelo.Personaje;
import es.ies.puerto.modelo.interfaces.ICrudOperaciones;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileJson implements ICrudOperaciones {
    List<Personaje> personajes;
    String path="src/main/resources/data.json";

    public FileJson() {
        personajes = new ArrayList<>();
    }

    @Override
    public List<Personaje> obtenerPersonas() {
        String json = null;
        try {
            json = new String(Files.readAllBytes(Paths.get(path)));
            Type listType = new TypeToken<ArrayList<Personaje>>(){}.getType();
            personajes = new Gson().fromJson(json, listType);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return personajes;
    }

    @Override
    public Personaje obtenerPersona(Personaje personaje) {
        if (!personajes.contains(personaje)) {
            return null;
        }
        int posicion = personajes.indexOf(personaje);
        return personajes.get(posicion);
    }

    @Override
    public void addPersona(Personaje personaje) {
        if (personajes.contains(personaje)) {
            return;
        }
        personajes.add(personaje);
        guardarDatos(personajes);
    }

    @Override
    public void deletePersona(Personaje personaje) {
        if (!personajes.contains(personaje)) {
            return;
        }
        personajes.remove(personaje);
        guardarDatos(personajes);
    }

    @Override
    public void updatePersona(Personaje personaje) {
        if (!personajes.contains(personaje)) {
            return;
        }
        int posicion = personajes.indexOf(personaje);
        personajes.set(posicion, personaje);
        guardarDatos(personajes);
    }

    private void guardarDatos(List<Personaje> personajes) {
        try (FileWriter writer = new FileWriter(path)) {
            new GsonBuilder().setPrettyPrinting().create().toJson(personajes, writer);
        } catch (IOException e) {
            System.err.println("Error al guardar datos: " + e.getMessage());
        }
    }
}
