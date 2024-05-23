package es.ies.puerto.modelo.db.dao;

import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.modelo.db.dao.abstracts.Actualizar;
import es.ies.puerto.modelo.db.entidades.Personaje;
import es.ies.puerto.modelo.db.entidades.Poder;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

public class DaoPoder extends Actualizar {
    public DaoPoder() throws MarvelException {
        super();
    }

    private Set<Poder> obtener(String query) throws MarvelException {
        Set<Poder> poderes = new HashSet<>();
        Statement statement = null;
        ResultSet rs = null;
        try {
            statement = getConexion().createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()) {
                String poderId = rs.getString("id");
                String nombre = rs.getString("nombre");
                Poder poder = new Poder(poderId, nombre);
                poderes.add(poder);
            }

        } catch (SQLException exception) {
            throw new MarvelException(exception.getMessage(), exception);
        } finally {
            try {
                if (rs != null && !rs.isClosed()) {
                    rs.close();
                }
                if (statement != null && !statement.isClosed()) {
                    statement.close();
                }
                if (!getConexion().isClosed()) {
                    getConexion().close();
                }
            } catch (SQLException exception) {
                throw new MarvelException(exception.getMessage(), exception);
            }
        }
        return poderes;
    }

    public Set<Poder> findAllPoder() throws MarvelException {
        String query = "SELECT po.id, po.nombre " +
                "FROM Poder AS po";
        return obtener(query);
    }

    public Poder findPoder(String id) throws MarvelException {
        Poder poder = new Poder(id);
        return findPoder(poder);
    }

    public Poder findPoder(Poder poder) throws MarvelException {
        String query = "SELECT po.id, po.nombre " +
                "FROM Poder AS po " +
                "WHERE po.id = '" + poder.getId() + "'";
        Set<Poder> poderes = obtener(query);
        if (poderes.isEmpty()) {
            return null;
        }
        return poderes.iterator().next();
    }

    public boolean updatePoder(Poder poder) throws MarvelException {
        boolean encontrado = true;
        String query = "UPDATE Poder " +
                "SET nombre = '"+ poder.getNombre() +"' " +
                "WHERE id = '" + poder.getId() + "';";

        if (findPoder(poder) == null) {
            encontrado = false;
            query = "INSERT INTO Poder VALUES " +
                    "('" + poder.getId() + "', " +
                    "'" + poder.getNombre() + "');";
        }
        actualizar(query);
        return encontrado;
    }

    public boolean deletePoder(String id) throws MarvelException {
        Poder poder = new Poder(id);
        return deletePoder(poder);
    }


    public boolean deletePoder(Poder poder) throws MarvelException {

        String query = "DELETE FROM Poder AS po " +
                "WHERE po.id = '" + poder.getId() + "'; " +
                "DELETE FROM Personaje_Poder AS pp " +
                "WHERE pp.poder_id = '" + poder.getId() + "';";
        actualizar(query);
        return findPoder(poder) != null;
    }


}
