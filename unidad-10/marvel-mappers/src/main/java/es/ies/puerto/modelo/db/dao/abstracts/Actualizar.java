package es.ies.puerto.modelo.db.dao.abstracts;

import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.modelo.db.Conexion;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Set;

public abstract class Actualizar extends Conexion {
    public Actualizar() throws MarvelException {
        super();
    }

    public void actualizar(String query) throws MarvelException {
        Statement statement = null;
        try {
            statement = getConexion().createStatement();
            statement.executeUpdate(query);
        } catch (SQLException exception) {
            throw new MarvelException(exception.getMessage(), exception);
        } finally {
            try {
                if (statement != null && !statement.isClosed()) {
                    statement.close();
                }
                if (!getConexion().isClosed()) {
                    getConexion().close();
                }
            } catch (SQLException e) {
                throw new MarvelException(e.getMessage(), e);
            }
        }
    }
}
