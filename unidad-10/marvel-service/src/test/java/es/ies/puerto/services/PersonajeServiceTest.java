package es.ies.puerto.services;

import es.ies.puerto.dto.PersonajeDTO;
import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.modelo.db.dao.DaoPersonaje;
import es.ies.puerto.modelo.db.entidades.Personaje;
import es.ies.puerto.services.cxf.PersonajeService;
import es.ies.puerto.utilities.TestUtilities;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import javax.ws.rs.core.Response;

import java.util.HashSet;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class PersonajeServiceTest extends TestUtilities {

    PersonajeService personajeService;

    @Mock
    DaoPersonaje daoPersonajeMock;

    @BeforeEach
    public void init() throws MarvelException {
        MockitoAnnotations.openMocks(this);
        personajeService = new PersonajeService();
        personajeService.setDaoPersonaje(daoPersonajeMock);
    }

    @Test
    void getAllTest() throws MarvelException {
        when(daoPersonajeMock.findAllPersonaje()).thenReturn(new HashSet<>());
        Response response = personajeService.getPersonajes();
        Assertions.assertNotNull(response, ERR_MSG);
        Assertions.assertEquals(200, response.getStatus(), ERR_MSG);
    }

    @Test
    void getOneOkTest() throws MarvelException {
        when(daoPersonajeMock.findPersonaje(anyString())).thenReturn(new Personaje());
        Response response = personajeService.getPersonajeById("idTest");
        Assertions.assertNotNull(response, ERR_MSG);
        Assertions.assertEquals(200, response.getStatus(), ERR_MSG);
    }

    @Test
    void getOneNotFoundTest() throws MarvelException {
        when(daoPersonajeMock.findPersonaje(anyString())).thenReturn(null);
        Response response = personajeService.getPersonajeById("idTest");
        Assertions.assertNotNull(response, ERR_MSG);
        Assertions.assertEquals(404, response.getStatus(), ERR_MSG);
    }

    @Test
    void addPersonajeTest() throws MarvelException {
        when(daoPersonajeMock.updatePersonaje(any(Personaje.class))).thenReturn(false);
        Response response = personajeService.updatePersonaje(new PersonajeDTO());
        Assertions.assertNotNull(response, ERR_MSG);
        Assertions.assertEquals(201, response.getStatus(), ERR_MSG);
    }

    @Test
    void updatePersonajeTest() throws MarvelException {
        when(daoPersonajeMock.updatePersonaje(any(Personaje.class))).thenReturn(true);
        Response response = personajeService.updatePersonaje(new PersonajeDTO());
        Assertions.assertNotNull(response, ERR_MSG);
        Assertions.assertEquals(200, response.getStatus(), ERR_MSG);
    }

    @Test
    void deleteOneOkTest() throws MarvelException {
        when(daoPersonajeMock.deletePersonaje(any(Personaje.class))).thenReturn(true);
        Response response = personajeService.deletePersonajeById("myid");
        Assertions.assertNotNull(response, ERR_MSG);
        Assertions.assertEquals(204, response.getStatus(), ERR_MSG);
    }

    @Test
    void deleteOneErrorTest() throws MarvelException {
        when(daoPersonajeMock.deletePersonaje(any(Personaje.class))).thenReturn(false);
        Response response = personajeService.deletePersonajeById("myid");
        Assertions.assertNotNull(response, ERR_MSG);
        Assertions.assertEquals(404, response.getStatus(), ERR_MSG);
    }
}
