package es.ies.puerto.modelo.db.hibernate.interfaces;

import es.ies.puerto.modelo.Personaje;

public interface CrudPersonaje {
    public Personaje getPersonaje(int id);
    public Personaje getPersonaje(Personaje personaje);
    public boolean updatePersonaje(Personaje personaje);
    public boolean addPersonaje(Personaje personaje);
    public void deletePersonaje(int id);
    public void deletePersonaje(Personaje personaje);
}
