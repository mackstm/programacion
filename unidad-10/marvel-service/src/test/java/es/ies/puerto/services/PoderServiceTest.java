package es.ies.puerto.services;


import es.ies.puerto.dto.PoderDTO;
import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.modelo.db.dao.DaoPoder;
import es.ies.puerto.modelo.db.entidades.Poder;
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

public class PoderServiceTest extends TestUtilities {
    PoderService poderService;

    @Mock
    DaoPoder daoPoderMock;

    @BeforeEach
    public void init() throws MarvelException {
        MockitoAnnotations.openMocks(this);
        poderService = new PoderService();
        poderService.setDaoPoder(daoPoderMock);
    }

    @Test
    void getAllTest() throws MarvelException {
        when(daoPoderMock.findAllPoder()).thenReturn(new HashSet<>());
        Response response = poderService.getPoderes();
        Assertions.assertNotNull(response, ERR_MSG);
        Assertions.assertEquals(200, response.getStatus(), ERR_MSG);
    }

    @Test
    void getOneOkTest() throws MarvelException {
        when(daoPoderMock.findPoder(anyString())).thenReturn(new Poder());
        Response response = poderService.getPoderById("idTest");
        Assertions.assertNotNull(response, ERR_MSG);
        Assertions.assertEquals(200, response.getStatus(), ERR_MSG);
    }

    @Test
    void getOneNotFoundTest() throws MarvelException {
        when(daoPoderMock.findPoder(anyString())).thenReturn(null);
        Response response = poderService.getPoderById("idTest");
        Assertions.assertNotNull(response, ERR_MSG);
        Assertions.assertEquals(404, response.getStatus(), ERR_MSG);
    }

    @Test
    void addPoderTest() throws MarvelException {
        when(daoPoderMock.updatePoder(any(Poder.class))).thenReturn(false);
        Response response = poderService.updatePoder(new PoderDTO());
        Assertions.assertNotNull(response, ERR_MSG);
        Assertions.assertEquals(201, response.getStatus(), ERR_MSG);
    }

    @Test
    void updatePoderTest() throws MarvelException {
        when(daoPoderMock.updatePoder(any(Poder.class))).thenReturn(true);
        Response response = poderService.updatePoder(new PoderDTO());
        Assertions.assertNotNull(response, ERR_MSG);
        Assertions.assertEquals(200, response.getStatus(), ERR_MSG);
    }

    @Test
    void deleteOneOkTest() throws MarvelException {
        when(daoPoderMock.deletePoder(any(Poder.class))).thenReturn(true);
        Response response = poderService.deletePoderById("myid");
        Assertions.assertNotNull(response, ERR_MSG);
        Assertions.assertEquals(204, response.getStatus(), ERR_MSG);
    }

    @Test
    void deleteOneErrorTest() throws MarvelException {
        when(daoPoderMock.deletePoder(any(Poder.class))).thenReturn(false);
        Response response = poderService.deletePoderById("myid");
        Assertions.assertNotNull(response, ERR_MSG);
        Assertions.assertEquals(404, response.getStatus(), ERR_MSG);
    }
}
