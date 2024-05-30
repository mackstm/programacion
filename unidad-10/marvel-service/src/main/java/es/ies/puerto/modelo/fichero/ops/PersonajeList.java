package es.ies.puerto.modelo.fichero.ops;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que incluye lista de personajes para usar en el xml
 */
@Root(name = "personajes")
public class PersonajeList {

    @ElementList(inline = true)
    private List<Personaje> personajes;


    public PersonajeList() {
        personajes = new ArrayList<>();
    }
    public PersonajeList(List<Personaje> personajes) {
        this.personajes = personajes;
    }

    public List<Personaje> getPersonajes() {
        return personajes;
    }

    public void setPersonajes(List<Personaje> personajes) {
        this.personajes = personajes;
    }
}
