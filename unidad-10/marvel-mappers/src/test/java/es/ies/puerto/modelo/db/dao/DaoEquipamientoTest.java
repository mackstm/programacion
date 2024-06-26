package es.ies.puerto.modelo.db.dao;

import es.ies.puerto.modelo.db.entidades.Equipamiento;
import org.junit.jupiter.api.*;

import java.util.Set;

public class DaoEquipamientoTest {
    static DaoEquipamiento daoEquipamiento;
    final String idEquipamiento="idEquipamiento";
    final String nombreEquipamiento="nombreEquipamiento";
    final String descripcionEquipamiento="nombreEquipamiento";

    final String idPersonaje="1";

    final String nombreEquipamientoUpdate="nombreEquipamientoUpdate";
    Equipamiento equipamiento;

    @BeforeAll
    public static void beforeAll() {
        try {
            daoEquipamiento = new DaoEquipamiento();
        }catch (Exception exception) {
            Assertions.fail("Se ha producido un error:"+exception.getMessage());
        }
    }

    @BeforeEach
    public void beforeEach() {
        try {
            equipamiento = new Equipamiento(idEquipamiento,
                    nombreEquipamiento,
                    descripcionEquipamiento,idPersonaje);
            daoEquipamiento.updateEquipamiento(equipamiento);
        }catch (Exception e) {
            Assertions.fail(e.getMessage());
        }

    }

    @Test
    public void findAllEquipamientoTest() {
        try {
            Set<Equipamiento> lista = daoEquipamiento.findAllEquipamiento();
            Assertions.assertNotNull(lista);
            Assertions.assertTrue(lista.size()>0);
        }catch (Exception e) {
            Assertions.fail(e.getMessage());
        }
    }

    @Test
    public void findEquipamientoTest() {
        try {
            Equipamiento EquipamientoFind = daoEquipamiento.findEquipamiento(equipamiento);
            Assertions.assertNotNull(EquipamientoFind);
            Assertions.assertEquals(equipamiento, EquipamientoFind);
        }catch (Exception e) {
            Assertions.fail(e.getMessage());
        }
    }

    @Test
    public void updateEquipamientoTest() {
        try {
            Equipamiento EquipamientoFind = daoEquipamiento.findEquipamiento(equipamiento);
            Assertions.assertNotNull(EquipamientoFind);
            EquipamientoFind.setNombre(nombreEquipamientoUpdate);
            daoEquipamiento.updateEquipamiento(EquipamientoFind);
            Equipamiento EquipamientoFindUpdate = daoEquipamiento.findEquipamiento(equipamiento);
            Assertions.assertNotNull(EquipamientoFindUpdate);
            Assertions.assertEquals(EquipamientoFind, EquipamientoFindUpdate);
        }catch (Exception e) {
            Assertions.fail(e.getMessage());
        }
    }


    @AfterEach
    public void afterEach()  {
        try {
            daoEquipamiento.deleteEquipamiento(equipamiento);
        }catch (Exception e) {
            Assertions.fail(e.getMessage());
        }

    }
}
