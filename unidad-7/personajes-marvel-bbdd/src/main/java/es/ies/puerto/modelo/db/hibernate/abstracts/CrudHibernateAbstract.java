package es.ies.puerto.modelo.db.hibernate.abstracts;

import es.ies.puerto.modelo.db.hibernate.interfaces.CrudPersonaje;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public abstract class CrudHibernateAbstract implements CrudPersonaje {
    EntityManager em;

    EntityManagerFactory emf;

    public CrudHibernateAbstract(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public EntityManager getEm() {
        if (em == null || (!em.isOpen())) {
            em = emf.createEntityManager();
        }
        return em;
    }
}
