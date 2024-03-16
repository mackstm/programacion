package es.ies.puerto.modelo.file;

import es.ies.puerto.modelo.Personaje;
import es.ies.puerto.modelo.PersonajeList;
import es.ies.puerto.modelo.interfaces.ICrudOperaciones;
import org.simpleframework.xml.core.Persister;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileXml implements ICrudOperaciones {

    List<Personaje> personajes;
    String path="src/main/resources/data.xml";

    public FileXml() {
        personajes = new ArrayList<>();
    }

    @Override
    public List<Personaje> obtenerPersonas() {
        Persister serializer = new Persister();
        try {
            File file = new File(path);
            PersonajeList personajeList = serializer.read(PersonajeList.class, file);
            personajes = personajeList.getPersonas();
            return personajes;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
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
        actualizarFichero(personajes);
    }

    @Override
    public void deletePersona(Personaje personaje) {
        if (!personajes.contains(personaje)) {
            return;
        }
        personajes.remove(personaje);
        actualizarFichero(personajes);
    }

    @Override
    public void updatePersona(Personaje personaje) {
        if (!personajes.contains(personaje)) {
            return;
        }
        int posicion = personajes.indexOf(personaje);
        personajes.set(posicion, personaje);
        actualizarFichero(personajes);
    }

    private void actualizarFichero (List<Personaje> personajes) {
        PersonajeList personajeList = new PersonajeList(personajes);
        Persister serializer = new Persister();
        try {
            serializer.write(personajeList, new File(path));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
