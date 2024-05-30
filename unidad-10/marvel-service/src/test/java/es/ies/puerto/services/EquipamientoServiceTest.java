package es.ies.puerto.services;


import es.ies.puerto.dto.EquipamientoDTO;
import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.modelo.db.dao.DaoEquipamiento;
import es.ies.puerto.modelo.db.entidades.Equipamiento;
import es.ies.puerto.services.cxf.EquipamientoService;
import es.ies.puerto.utilities.TestUtilities;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import javax.ws.rs.core.Response;
import java.util.HashSet;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

public class EquipamientoServiceTest extends TestUtilities {
    EquipamientoService equipamientoService;
    @Mock
    DaoEquipamiento daoEquipamientoMock;

    @BeforeEach
    public void init() throws MarvelException {
        MockitoAnnotations.openMocks(this);
        equipamientoService = new EquipamientoService();
        equipamientoService.setDaoEquipamiento(daoEquipamientoMock);
    }

    @Test
    void getAllTest() throws MarvelException {
        when(daoEquipamientoMock.findAllEquipamiento()).thenReturn(new HashSet<>());
        Response response = equipamientoService.getEquipamientos();
        Assertions.assertNotNull(response, ERR_MSG);
        Assertions.assertEquals(200, response.getStatus(), ERR_MSG);
    }

    @Test
    void getOneOkTest() throws MarvelException {
        when(daoEquipamientoMock.findEquipamiento(anyString())).thenReturn(new Equipamiento());
        Response response = equipamientoService.getEquipamientoById("idTest");
        Assertions.assertNotNull(response, ERR_MSG);
        Assertions.assertEquals(200, response.getStatus(), ERR_MSG);
    }

    @Test
    void getOneNotFoundTest() throws MarvelException {
        when(daoEquipamientoMock.findEquipamiento(anyString())).thenReturn(null);
        Response response = equipamientoService.getEquipamientoById("idTest");
        Assertions.assertNotNull(response, ERR_MSG);
        Assertions.assertEquals(404, response.getStatus(), ERR_MSG);
    }

    @Test
    void addEquipamientoTest() throws MarvelException {
        when(daoEquipamientoMock.updateEquipamiento(any(Equipamiento.class))).thenReturn(false);
        Response response = equipamientoService.updateEquipamiento(new EquipamientoDTO());
        Assertions.assertNotNull(response, ERR_MSG);
        Assertions.assertEquals(201, response.getStatus(), ERR_MSG);
    }

    @Test
    void updateEquipamientoTest() throws MarvelException {
        when(daoEquipamientoMock.updateEquipamiento(any(Equipamiento.class))).thenReturn(true);
        Response response = equipamientoService.updateEquipamiento(new EquipamientoDTO());
        Assertions.assertNotNull(response, ERR_MSG);
        Assertions.assertEquals(200, response.getStatus(), ERR_MSG);
    }

    @Test
    void deleteOneOkTest() throws MarvelException {
        when(daoEquipamientoMock.deleteEquipamiento(any(Equipamiento.class))).thenReturn(true);
        Response response = equipamientoService.deleteEquipamientoById("myid");
        Assertions.assertNotNull(response, ERR_MSG);
        Assertions.assertEquals(204, response.getStatus(), ERR_MSG);
    }

    @Test
    void deleteOneErrorTest() throws MarvelException {
        when(daoEquipamientoMock.deleteEquipamiento(any(Equipamiento.class))).thenReturn(false);
        Response response = equipamientoService.deleteEquipamientoById("myid");
        Assertions.assertNotNull(response, ERR_MSG);
        Assertions.assertEquals(404, response.getStatus(), ERR_MSG);
    }
}
