package es.ies.puerto.modelo.db.dao;

import es.ies.puerto.modelo.db.entidades.Alias;
import es.ies.puerto.modelo.db.entidades.Equipamiento;
import es.ies.puerto.modelo.db.entidades.Personaje;
import es.ies.puerto.modelo.db.entidades.Poder;
import org.junit.jupiter.api.*;

import java.util.HashSet;
import java.util.Set;

public class DaoPersonajeTest {
    static DaoPersonaje daoPersonaje;
    final String idPersonaje="idPersonaje";
    final String nombrePersonaje="nombrePersonaje";
    final String generoPersonaje="generoPersonaje";


    final String nombrePersonajeUpdate="nombrePersonajeUpdate";
    Personaje personaje;

    final String idPoder="idPoder";
    final String nombrePoder="nombrePoder";
    final String nombrePoderUpdate="nombrePoderUpdate";
    Poder poder;

    static DaoEquipamiento daoEquipamiento;
    final String idEquipamiento="idEquipamiento";
    final String nombreEquipamiento="nombreEquipamiento";
    final String descripcionEquipamiento="nombreEquipamiento";

    final String nombreEquipamientoUpdate="nombreEquipamientoUpdate";
    Equipamiento equipamiento;

    final String idAlias="idAlias";
    final String nombreAlias="nombreAlias";
    final String descripcionAliasUpdate="nombreAliasUpdate";
    Alias alias;

    Set<Poder> poderes;
    Set<Equipamiento> equipamientos;

    @BeforeAll
    public static void beforeAll() {
        try {
            daoPersonaje = new DaoPersonaje();
        }catch (Exception exception) {
            Assertions.fail("Se ha producido un error:"+exception.getMessage());
        }
    }

    @BeforeEach
    public void beforeEach() {
        try {
            poder = new Poder(idPoder,nombrePoder);
            alias = new Alias(idAlias,nombreAlias,idPersonaje);
            equipamiento = new Equipamiento(idEquipamiento,
                    nombreEquipamiento,
                    descripcionEquipamiento,idPersonaje);
            poderes = new HashSet<>();
            equipamientos = new HashSet<>();
            poderes.add(poder);
            equipamientos.add(equipamiento);
            personaje = new Personaje(idPersonaje,
                    nombrePersonaje,
                    generoPersonaje,alias,equipamientos,poderes);
            daoPersonaje.updatePersonaje(personaje);
        }catch (Exception e) {
            Assertions.fail(e.getMessage());
        }

    }

    @Test
    public void findAllPersonajeTest() {
        try {
            Set<Personaje> lista = daoPersonaje.findAllPersonaje();
            Assertions.assertNotNull(lista);
            Assertions.assertTrue(lista.size()>0);
        }catch (Exception e) {
            Assertions.fail(e.getMessage());
        }
    }

    @Test
    public void findPersonajeTest() {
        try {
            Personaje PersonajeFind = daoPersonaje.findPersonaje(personaje);
            Assertions.assertNotNull(PersonajeFind);
            Assertions.assertEquals(personaje, PersonajeFind);
        }catch (Exception e) {
            Assertions.fail(e.getMessage());
        }
    }

    @Test
    public void updatePersonajeTest() {
        try {
            Personaje PersonajeFind = daoPersonaje.findPersonaje(personaje);
            Assertions.assertNotNull(PersonajeFind);
            PersonajeFind.setNombre(nombrePersonajeUpdate);
            daoPersonaje.updatePersonaje(PersonajeFind);
            Personaje PersonajeFindUpdate = daoPersonaje.findPersonaje(personaje);
            Assertions.assertNotNull(PersonajeFindUpdate);
            Assertions.assertEquals(PersonajeFind, PersonajeFindUpdate);
        }catch (Exception e) {
            Assertions.fail(e.getMessage());
        }
    }


    @AfterEach
    public void afterEach()  {
        try {
            daoPersonaje.deletePersonaje(personaje);
        }catch (Exception e) {
            Assertions.fail(e.getMessage());
        }
    }

    //Genera test para relacionar los personajes con alias, poderes y equipamiento
}
