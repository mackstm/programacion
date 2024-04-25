package es.ies.puerto.modelo.db.jdbc;

import es.ies.puerto.exception.UsuarioException;
import es.ies.puerto.modelo.Alias;
import es.ies.puerto.modelo.Personaje;
import es.ies.puerto.modelo.Poder;
import es.ies.puerto.modelo.db.jdbc.OperacionesBd;
import es.ies.puerto.testutils.TestUtilities;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class OperacionesBdTest extends TestUtilities {
    OperacionesBd operacionesBd;
    String urlBd = "src/main/resources/marvel.db";
    Personaje personaje;
    Alias alias;
    Poder poder1;
    Poder poder2;
    Set<Poder> poderes;
    @BeforeEach
    public void beforeEach() {
        try {
            poder1 = new Poder(1);
            poder2 = new Poder(2);
            poderes = new HashSet<>(Arrays.asList(poder1, poder2));
            personaje = new Personaje(3, "bartolo", "H", poderes);
            alias = new Alias(3, personaje, "pepe");
            personaje.setAlias(alias);
            alias.setPersonaje(personaje);
            operacionesBd = new OperacionesBd(urlBd);
        }catch (Exception exception) {
            Assertions.fail(exception.getMessage());
        }
    }

    @Test
    public void obtenerPersonajesAllTest() {
        try {
            Set<Personaje> personajes = operacionesBd.obtenerPersonajes();
            Assertions.assertEquals(2, personajes.size(), ERR_MSG);
            Assertions.assertNotNull(personajes.iterator().next().getAlias().getPersonaje(), ERR_MSG);
        } catch (UsuarioException e) {
            Assertions.fail(e.getMessage());
        }
    }

    @Test
    public void obtenerPersonajeTest() {
        Personaje personaje = new Personaje(2);
        try {
            personaje = operacionesBd.obtenerPersonaje(personaje);
            Assertions.assertNotNull(personaje, ERR_MSG);
            Assertions.assertNotNull(personaje.getNombre(), ERR_MSG);
            Assertions.assertNotNull(personaje.getAlias().getPersonaje(), ERR_MSG);
            Assertions.assertNotNull(personaje.getGenero(), ERR_MSG);
            Assertions.assertNotNull(personaje.getPoderes(), ERR_MSG);
            Assertions.assertEquals(3, personaje.getPoderes().size(), ERR_MSG);
        } catch (UsuarioException e) {
            Assertions.fail(e.getMessage());
        }
    }

    @Test
    public void insertarEliminarPersonajeTest() {

        try {
            int numPersonajes = operacionesBd.obtenerPersonajes().size();
            operacionesBd.insertarPersonaje(personaje);
            Personaje personajeObtenido = operacionesBd.obtenerPersonaje(personaje);
            Assertions.assertEquals(numPersonajes + 1, operacionesBd.obtenerPersonajes().size(), ERR_MSG);
            Assertions.assertEquals(personaje, personajeObtenido, ERR_MSG);
            operacionesBd.eliminarPersonaje(personajeObtenido);
            int numPersonajesFinal = operacionesBd.obtenerPersonajes().size();
            Assertions.assertEquals(numPersonajes, numPersonajesFinal, ERR_MSG);
        } catch (UsuarioException e) {
            Assertions.fail(e.getMessage());
        }
    }

    @Test
    public void actualizarPersonajeTest() {
        String nombreUpdate = "Pepe Juan";
        String generoUpdate = "Mujer";
        Poder poderUpdate = new Poder(4, "Agilidad sobrehumana");
        Set<Poder> poderesUpdate = new HashSet<>(Arrays.asList(poderUpdate));
        try {
            operacionesBd.insertarPersonaje(personaje);
            personaje.setNombre(nombreUpdate);
            personaje.setGenero(generoUpdate);
            personaje.setPoderes(poderesUpdate);
            operacionesBd.actualizarPersonaje(personaje);
            Personaje personajeEncontrado = operacionesBd.obtenerPersonaje(personaje);
            Assertions.assertEquals(personaje, personajeEncontrado, ERR_MSG);
            Assertions.assertEquals(personaje.getNombre(), personajeEncontrado.getNombre(), ERR_MSG);
            Assertions.assertEquals(personaje.getGenero(), personajeEncontrado.getGenero(), ERR_MSG);
            Assertions.assertEquals(personaje.getPoderes(), personajeEncontrado.getPoderes(), ERR_MSG);
            operacionesBd.eliminarPersonaje(personajeEncontrado);
        }catch (Exception exception) {
            Assertions.fail(ERR_MSG +":"+exception.getMessage());
        }



    }

}
