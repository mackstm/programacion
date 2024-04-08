package es.ies.puerto.modelo.db;

import es.ies.puerto.config.AppConfig;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AppConfigTest {
    AppConfig appConfig;
    String url = "src/main/resources/usuarios.db";

    @BeforeEach
    public void beforeEach() {
        try {
            appConfig = new AppConfig();
        }catch (Exception exception) {
            Assertions.fail(exception.getMessage());
        }
    }

    @Test
    public void obtenerUrlBd() {
        try {
            String urlBbFichero = appConfig.getUrlBd();
            Assertions.assertEquals(url, urlBbFichero, "la url de la BBDD no es la esperada");
        }catch (Exception exception) {
            Assertions.fail(exception.getMessage());
        }
    }
}
