package es.ies.puerto.modelo.db;

import es.ies.puerto.exception.MarvelException;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    private Connection con;

    private String url;

    public Conexion() throws MarvelException {
        url = "jdbc:sqlite:/home/mackstm/Documents/programacion/unidad-10/marvel-service/src/main/resources/mavel.db";
    }

    public Connection getConexion() throws MarvelException {
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            this.con = DriverManager.getConnection(url);
        }catch (Exception exception) {
            throw new MarvelException("No se ha podido establecer la conexion",
                    exception);
        }
        return con;
    }
}
