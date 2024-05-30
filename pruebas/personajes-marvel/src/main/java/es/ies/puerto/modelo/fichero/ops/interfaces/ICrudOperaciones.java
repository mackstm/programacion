package es.ies.puerto.modelo.fichero.ops.interfaces;

import es.ies.puerto.modelo.fichero.ops.Personaje;

import java.util.List;

/**
 * Operaciones CRUD para personajes de marvel
 * @author Jose Maximiliano Boada Martin
 */
public interface ICrudOperaciones {
    public List<Personaje> obtenerPersonajes();
    public Personaje obtenerPersonaje(Personaje personaje);
    public void addPersonaje(Personaje personaje);
    public void deletePersonaje(Personaje personaje);
    public void updatePersonaje(Personaje personaje);
}
