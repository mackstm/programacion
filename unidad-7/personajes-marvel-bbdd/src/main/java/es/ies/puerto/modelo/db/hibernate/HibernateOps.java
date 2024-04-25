package es.ies.puerto.modelo.db.hibernate;

import es.ies.puerto.modelo.Alias;
import es.ies.puerto.modelo.Personaje;
import es.ies.puerto.modelo.Poder;
import es.ies.puerto.modelo.db.hibernate.abstracts.CrudHibernateAbstract;

import javax.persistence.EntityManagerFactory;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
    public List<Personaje> getPersonajes() {
        return getEm().createQuery("SELECT p FROM " + Personaje.class.getName() + " p").getResultList();
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
            personaje = getPersonaje(personaje);
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
