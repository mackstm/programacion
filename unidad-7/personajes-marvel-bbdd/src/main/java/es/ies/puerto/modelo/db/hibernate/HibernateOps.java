package es.ies.puerto.modelo.db.hibernate;

import es.ies.puerto.modelo.Personaje;
import es.ies.puerto.modelo.db.hibernate.abstracts.CrudHibernateAbstract;

import javax.persistence.EntityManagerFactory;

/**
 * Operaciones sobre base de datos de superheroes usando hibernate
 * @author Jose Maximiliano Boada Martin
 */
public class HibernateOps extends CrudHibernateAbstract {

    public HibernateOps(EntityManagerFactory emf) {
        super(emf);
    }

    @Override
    public Personaje getPersonaje(int personajeId) {
        Personaje personaje = new Personaje(personajeId);
        return getPersonaje(personaje);
    }

    @Override
    public Personaje getPersonaje(Personaje personaje) {
        return getEm().find(Personaje.class, personaje.getPersonajeId());
    }

    @Override
    public boolean updatePersonaje(Personaje personaje) {
        try {
            getEm().getTransaction().begin();
            getEm().merge(personaje);
            getEm().getTransaction().commit();
            return true;
        }catch (Exception exception){
            return false;
        }finally {
            if (getEm()!= null && getEm().isOpen()) {
                getEm().close();
            }
        }
    }

    @Override
    public boolean addPersonaje(Personaje personaje) {
        try {
            getEm().getTransaction().begin();
            getEm().persist(personaje);
            getEm().getTransaction().commit();
            return true;
        }catch (Exception exception){
            return false;
        }finally {
            if (getEm()!= null && getEm().isOpen()) {
                getEm().close();
            }
        }
    }

    @Override
    public void deletePersonaje(int id) {
        deletePersonaje(new Personaje(id));
    }

    @Override
    public void deletePersonaje(Personaje personaje) {
        try {
            getEm().getTransaction().begin();
            getEm().remove(personaje);
            getEm().getTransaction().commit();
        }catch (Exception exception){
        }finally {
            if (getEm()!= null && getEm().isOpen()) {
                getEm().close();
            }
        }
    }


}
