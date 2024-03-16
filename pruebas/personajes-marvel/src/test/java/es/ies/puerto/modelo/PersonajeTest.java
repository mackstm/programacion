package es.ies.puerto.modelo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PersonajeTest {
    String nombre = "nombre";
    String alias = "alias";
    String genero = "genero";
    List<String> poderes = new ArrayList<>(Arrays.asList("poder1", "poder2"));

    Personaje personaje;

    @BeforeEach
    public void beforeEach() {
        personaje = new Personaje(nombre, alias, genero, poderes);
    }

    @Test
    public void testToCsv() {
        String resultado = "nombre,alias,genero,\"poder1, poder2\"";
        Assertions.assertEquals(resultado, personaje.toCsv(), "Resultado inesperado");
    }

}
