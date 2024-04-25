package es.ies.puerto.modelo.db.hibernate;

import es.ies.puerto.modelo.Alias;
import es.ies.puerto.modelo.Personaje;
import es.ies.puerto.modelo.Poder;
import es.ies.puerto.testutils.TestUtilities;
import org.junit.jupiter.api.*;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HibernateOpsTest extends TestUtilities {
    static HibernateOps hibernateOps;

    static EntityManagerFactory emf;

    Personaje personaje;
    Set<Poder> poderes;
    Poder poder;
    Alias alias;

    @BeforeAll
    public static void setUp() {
        emf = Persistence.createEntityManagerFactory("pu-sqlite-jpa");
        hibernateOps = new HibernateOps(emf);
    }

    @BeforeEach
    public void initEntityManager() {
        poder = new Poder();
        poder.setPoder("meter pepazos");
        poderes = new HashSet<>();
        poderes.add(poder);
        personaje = new Personaje();
        personaje.setNombre("pepe");
        personaje.setGenero("H");
        personaje.setPoderes(poderes);
        alias = new Alias();
        alias.setPersonaje(personaje);
        alias.setAlias("manuel");
        personaje.setAlias(alias);
        hibernateOps.addPersonaje(personaje);
    }

    @Test
    public void findPersonajeTest() {
        try {
            Personaje personajeFind = hibernateOps.getPersonaje(personaje.getPersonajeId());
            Assertions.assertEquals(personaje.getNombre(), personajeFind.getNombre(), ERR_MSG);
        }catch (Exception exception) {
            Assertions.fail(exception.getMessage());
        }
    }

    @Test
    public void findPersonajesTest() {
        List<Personaje> personajes = hibernateOps.getPersonajes();
        Assertions.assertNotNull(personajes, ERR_MSG);
        Assertions.assertEquals(3, personajes.size(), ERR_MSG);
    }

    @Test
    public void updatePersonajeTest() {
        try {
            Personaje personajeUpdate = personaje;
            Poder poder2 = new Poder();
            poder2.setPoder("papa frita");
            poderes.add(poder2);
            personajeUpdate.setPoderes(poderes);
            personajeUpdate.setNombre("hahahaha");
            personajeUpdate.setGenero("fluido");
            hibernateOps.updatePersonaje(personajeUpdate);
            personajeUpdate = hibernateOps.getPersonaje(personajeUpdate);
            Assertions.assertEquals(personaje.getPersonajeId(), personajeUpdate.getPersonajeId(), ERR_MSG);
            Assertions.assertNotNull(personajeUpdate.getNombre(), ERR_MSG);
            Assertions.assertNotNull(personajeUpdate.getGenero(), ERR_MSG);
        }catch (Exception exception) {
            Assertions.fail(exception.getMessage());
        }
    }

    @AfterEach
    public void afterEach() {
        hibernateOps.deletePersonaje(personaje.getPersonajeId());
    }
}
