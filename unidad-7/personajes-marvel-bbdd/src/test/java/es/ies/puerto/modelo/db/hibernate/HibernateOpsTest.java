package es.ies.puerto.modelo.db.hibernate;

import es.ies.puerto.modelo.Alias;
import es.ies.puerto.modelo.Personaje;
import es.ies.puerto.modelo.Poder;
import es.ies.puerto.testutils.TestUtilities;
import org.junit.jupiter.api.*;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.HashSet;
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
        poder = new Poder(1, "meter pepazos");
        poderes = new HashSet<>();
        poderes.add(poder);
        personaje = new Personaje(5, "pepe", "H", poderes);
        alias = new Alias(5, personaje, "manuel");
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

    @AfterEach
    public void afterEach() {
        hibernateOps.deletePersonaje(personaje.getPersonajeId());
    }
}
