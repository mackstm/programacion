package es.ies.puerto.modelo.db.hibernate.interfaces;



import es.ies.puerto.modelo.db.entidades.Personaje;

import java.util.List;

public interface CrudPersonaje {
    public Personaje getPersonaje(String id);
    public Personaje getPersonaje(Personaje personaje);
    public List<Personaje> getPersonajes();
    public boolean updatePersonaje(Personaje personaje);
    public boolean addPersonaje(Personaje personaje);
    public void deletePersonaje(String id);
    public void deletePersonaje(Personaje personaje);
}
