package es.ies.puerto.modelo.db.jdbc;

import es.ies.puerto.exception.UsuarioException;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Maneja las conexiones a base de datos
 * @author Jose Maximiliano Boada Martin
 */
public class Conexion {
    /**
     * Propiedades
     */
    private Connection con;
    private String url;
    private String user;
    private String password;

    /**
     * Constructor con url de bd
     * @param url -
     * @throws UsuarioException -
     */
    public Conexion(String url) throws UsuarioException {
        this.url = "jdbc:sqlite:"+url;
    }

    /**
     * Constructor con url, nombre de usuario y password
     * @param url -
     * @param user -
     * @param password -
     */
    public Conexion(String url, String user, String password) {
        this.url = url;
        this.user = user;
        this.password = password;
    }

    /**
     * Establece conexion
     * @return -
     * @throws UsuarioException -
     */
    public Connection getConexion() throws UsuarioException {
        try {
            this.con = DriverManager.getConnection(url);
        }catch (Exception exception) {
            System.out.println(exception.getMessage());
            throw new UsuarioException("No se ha podido establecer la conexion",
                    exception);
        }
        return con;
    }
}
