package es.ies.puerto.modelo.db;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ConexionTest {
    Conexion conexion;
    String url = "src/main/resources/usuarios.db";

    @BeforeEach
    public void beforeEach() {
        try {
            conexion = new Conexion(url);
        }catch (Exception exception) {
            Assertions.fail(exception.getMessage());
        }
    }

    @Test
    public void conectarBd() {
        try {
            conexion.getConexion();
        }catch (Exception exception) {
            Assertions.fail(exception.getMessage());
        }
    }
}
