package es.ies.puerto.config;

import es.ies.puerto.exception.UsuarioException;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class AppConfig {
    String urlDb;
    public AppConfig() throws UsuarioException {
        Properties properties = new Properties();
        try (FileInputStream fis = new FileInputStream("app.properties")) {
            properties.load(fis);
            urlDb = (String) properties.get("urlDb");
        } catch (IOException e) {
            throw new UsuarioException(e.getMessage(), e);
        }
    }
}
