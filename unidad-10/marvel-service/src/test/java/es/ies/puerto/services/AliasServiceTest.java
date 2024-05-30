package es.ies.puerto.services;

import es.ies.puerto.dto.AliasDTO;
import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.modelo.db.dao.DaoAlias;
import es.ies.puerto.modelo.db.entidades.Alias;
import es.ies.puerto.services.cxf.AliasService;
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

public class AliasServiceTest extends TestUtilities {
    AliasService aliasService;

    @Mock
    DaoAlias daoAliasMock;

    @BeforeEach
    public void init() throws MarvelException {
        MockitoAnnotations.openMocks(this);
        aliasService = new AliasService();
        aliasService.setDaoAlias(daoAliasMock);
    }

    @Test
    void getAllTest() throws MarvelException {
        when(daoAliasMock.findAllAlias()).thenReturn(new HashSet<>());
        Response response = aliasService.getAliases();
        Assertions.assertNotNull(response, ERR_MSG);
        Assertions.assertEquals(200, response.getStatus(), ERR_MSG);
    }

    @Test
    void getOneOkTest() throws MarvelException {
        when(daoAliasMock.findAlias(anyString())).thenReturn(new Alias());
        Response response = aliasService.getAliasById("idTest");
        Assertions.assertNotNull(response, ERR_MSG);
        Assertions.assertEquals(200, response.getStatus(), ERR_MSG);
    }

    @Test
    void getOneNotFoundTest() throws MarvelException {
        when(daoAliasMock.findAlias(anyString())).thenReturn(null);
        Response response = aliasService.getAliasById("idTest");
        Assertions.assertNotNull(response, ERR_MSG);
        Assertions.assertEquals(404, response.getStatus(), ERR_MSG);
    }

    @Test
    void addAliasTest() throws MarvelException {
        when(daoAliasMock.updateAlias(any(Alias.class))).thenReturn(false);
        Response response = aliasService.updateAlias(new AliasDTO());
        Assertions.assertNotNull(response, ERR_MSG);
        Assertions.assertEquals(201, response.getStatus(), ERR_MSG);
    }

    @Test
    void updateAliasTest() throws MarvelException {
        when(daoAliasMock.updateAlias(any(Alias.class))).thenReturn(true);
        Response response = aliasService.updateAlias(new AliasDTO());
        Assertions.assertNotNull(response, ERR_MSG);
        Assertions.assertEquals(200, response.getStatus(), ERR_MSG);
    }

    @Test
    void deleteOneOkTest() throws MarvelException {
        when(daoAliasMock.deleteAlias(any(Alias.class))).thenReturn(true);
        Response response = aliasService.deleteAliasById("myid");
        Assertions.assertNotNull(response, ERR_MSG);
        Assertions.assertEquals(204, response.getStatus(), ERR_MSG);
    }

    @Test
    void deleteOneErrorTest() throws MarvelException {
        when(daoAliasMock.deleteAlias(any(Alias.class))).thenReturn(false);
        Response response = aliasService.deleteAliasById("myid");
        Assertions.assertNotNull(response, ERR_MSG);
        Assertions.assertEquals(404, response.getStatus(), ERR_MSG);
    }
}
