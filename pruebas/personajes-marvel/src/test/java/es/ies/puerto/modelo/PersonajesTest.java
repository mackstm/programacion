package es.ies.puerto.modelo;

import es.ies.puerto.modelo.fichero.ops.PersonajeList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonajesTest {
    PersonajeList personajeList;

    @BeforeEach
    public void beforeEach() {
        personajeList = new PersonajeList();
    }

    @Test
    public void NotNullTest() {
        Assertions.assertNotNull(personajeList, "Resultado inesperado");
    }
}
