package es.ies.puerto.modelo.db.dao;

import es.ies.puerto.modelo.db.entidades.Alias;
import org.junit.jupiter.api.*;

import java.util.Set;

public class DaoAliasTest {
    static DaoAlias daoAlias;
    final String idAlias="idAlias";
    final String nombreAlias="nombreAlias";
    final String descripcionAliasUpdate="nombreAliasUpdate";
    Alias alias;

    @BeforeAll
    public static void beforeAll() {
        try {
            daoAlias = new DaoAlias();
        }catch (Exception exception) {
            Assertions.fail("Se ha producido un error:"+exception.getMessage());
        }
    }

    @BeforeEach
    public void beforeEach() {
        try {
            alias = new Alias(idAlias,nombreAlias,"1");
            daoAlias.updateAlias(alias);
        }catch (Exception e) {
            Assertions.fail(e.getMessage());
        }

    }

    @Test
    public void findAllAliasTest() {
        try {
            Set<Alias> lista = daoAlias.findAllAlias();
            Assertions.assertNotNull(lista);
            Assertions.assertTrue(lista.size()>0);
        }catch (Exception e) {
            Assertions.fail(e.getMessage());
        }
    }

    @Test
    public void findAliasTest() {
        try {
            Alias AliasFind = daoAlias.findAlias(alias);
            Assertions.assertNotNull(AliasFind);
            Assertions.assertEquals(alias, AliasFind);
        }catch (Exception e) {
            Assertions.fail(e.getMessage());
        }
    }

    @Test
    public void updateAliasTest() {
        try {
            Alias AliasFind = daoAlias.findAlias(alias);
            Assertions.assertNotNull(AliasFind);
            AliasFind.setDescripcion(descripcionAliasUpdate);
            daoAlias.updateAlias(AliasFind);
            Alias AliasFindUpdate = daoAlias.findAlias(alias);
            Assertions.assertNotNull(AliasFindUpdate);
            Assertions.assertEquals(AliasFind, AliasFindUpdate);
            Assertions.assertEquals(AliasFind.getDescripcion(), AliasFindUpdate.getDescripcion());

        }catch (Exception e) {
            Assertions.fail(e.getMessage());
        }
    }


    @AfterEach
    public void afterEach()  {
        try {
            daoAlias.deleteAlias(alias);
        }catch (Exception e) {
            Assertions.fail(e.getMessage());
        }

    }
}
