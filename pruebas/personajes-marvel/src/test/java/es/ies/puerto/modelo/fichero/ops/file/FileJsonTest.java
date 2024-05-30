package es.ies.puerto.modelo.fichero.ops.file;

import es.ies.puerto.modelo.fichero.ops.Personaje;
import es.ies.puerto.modelo.fichero.ops.interfaces.ICrudOperaciones;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileJsonTest {
    String nombreInsertar = "nombre";
    String aliasInsertar = "alias";
    String generoInsertar = "genero";
    List<String> poderesInsertar = new ArrayList<>(Arrays.asList("poder1", "poder2"));

    ICrudOperaciones persistencia;
    List<Personaje> personajes;

    @BeforeEach
    public void beforeEach() {
        persistencia = new FileJson();
        personajes = persistencia.obtenerPersonajes();
    }

    @Test
    public void obtenerPersonajesTest() {
        Assertions.assertFalse(personajes.isEmpty(),
                "No se ha obtenido el valor esperado");
    }


    @Test
    public void obtenerPersonajeTest() {
        Personaje personajeBuscar = new Personaje("Peter Parker");
        personajeBuscar = persistencia.obtenerPersonaje(personajeBuscar);
        Assertions.assertEquals(personajeBuscar.getAlias(),"Peter Parker",
                "No se ha obtenido el valor esperado");
        Assertions.assertNotNull(personajeBuscar.getNombre(),
                "No se ha obtenido el valor esperado");
        Assertions.assertNotNull (personajeBuscar.getGenero(),
                "No se ha obtenido el valor esperado");
        Assertions.assertFalse(personajeBuscar.getPoderes().isEmpty(),
                "No se ha obtenido el valor esperado");
    }

    @Test
    public void addDeletePersonajeTest() {

        int numPersonajesInicial = personajes.size();
        Personaje personajeInsertar = new Personaje(nombreInsertar, aliasInsertar, generoInsertar, poderesInsertar);
        persistencia.addPersonaje(personajeInsertar);
        personajes = persistencia.obtenerPersonajes();
        int numPersonajesInsertar = personajes.size();
        Assertions.assertTrue(personajes.contains(personajeInsertar),
                "No se ha encontrado a la Personaje");
        Assertions.assertEquals(numPersonajesInicial +1 ,
                numPersonajesInsertar,
                "No se ha obtenido el numero esperado");
        persistencia.deletePersonaje(personajeInsertar);
        personajes = persistencia.obtenerPersonajes();
        int numPersonajesBorrado = personajes.size();
        Assertions.assertEquals(numPersonajesInicial ,
                numPersonajesBorrado,
                "No se ha obtenido el numero esperado");
    }

    @Test
    public void actualizarPersonaje() {
        String aliasActualizar = "Peter Parker";
        Personaje personajeBuscar = new Personaje(aliasActualizar);
        Personaje personajeActualizar = persistencia.obtenerPersonaje(personajeBuscar);
        Personaje personajeBackup = persistencia.obtenerPersonaje(personajeBuscar);
        personajeActualizar.setNombre(nombreInsertar);
        personajeActualizar.setGenero(generoInsertar);
        personajeActualizar.setPoderes(poderesInsertar);
        persistencia.updatePersonaje(personajeActualizar);

        personajeBuscar = persistencia.obtenerPersonaje(personajeBuscar);
        Assertions.assertEquals(personajeBuscar.toString(), personajeActualizar.toString(),
                "Los datos actualizados no son los esperados");
        persistencia.updatePersonaje(personajeBackup);



    }
}
