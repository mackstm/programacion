package es.ies.puerto.model.db;

import es.ies.puerto.exception.UsuarioException;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    private Connection conn;
    private String url;
    private String user;
    private String password;

    public Conexion(String url) {
        this.url = "jdbc:sqlite:" + url;
    }

    public Conexion(String url, String user, String password) {
        this.url = "jdbc:sqlite:" + url;
        this.user = user;
        this.password = password;
    }

    public Connection getConexion() throws UsuarioException {
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection(url);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new UsuarioException("No se ha podido establecer la conexion", e);
        }
        return conn;

    }
}
