package es.ies.puerto.modelo.db.dao;

import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.modelo.db.dao.abstracts.Actualizar;
import es.ies.puerto.modelo.db.entidades.Alias;
import es.ies.puerto.modelo.db.entidades.Equipamiento;
import es.ies.puerto.modelo.db.entidades.Personaje;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

public class DaoAlias extends Actualizar {


    public DaoAlias() throws MarvelException {
        super();
    }

    private Set<Alias> obtener(String query) throws MarvelException {
        Set<Alias> aliases = new HashSet<>();
        Statement statement = null;
        ResultSet rs = null;
        try {
            statement = getConexion().createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()) {
                String aliasId = rs.getString("id");
                String personajeId = rs.getString("personaje_id");
                String aliasNombre = rs.getString("alias");
                Alias alias = new Alias(aliasId, aliasNombre, personajeId);
                aliases.add(alias);
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
        return aliases;
    }

        public Set<Alias> findAllAlias() throws MarvelException {
            String query = "SELECT a.id, a.personaje_id, a.alias " +
                    "FROM Alias AS a";
            return obtener(query);
        }

        public Alias findAlias(String id) throws MarvelException {
            Alias alias = new Alias(id);
            return findAlias(alias);
        }

        public Alias findAlias(Alias alias) throws MarvelException {
            String query = "SELECT a.id, a.personaje_id, a.alias " +
                    "FROM Alias AS a " +
                    "WHERE a.id = '" + alias.getId() + "'";
            Set<Alias> aliases = obtener(query);
            if (aliases.isEmpty()) {
                return null;
            }
            return aliases.iterator().next();
        }

        public boolean updateAlias(Alias alias) throws MarvelException {
            boolean encontrado = true;
            String query = "UPDATE Alias " +
                    "SET alias = '"+ alias.getDescripcion() +"' " +
                    "WHERE id = '" + alias.getId() + "';";

            if (findAlias(alias) == null) {
                encontrado = false;
                query = "INSERT INTO Alias VALUES " +
                        "('" + alias.getId() + "', " +
                        "'" + alias.getPersonaje_id() + "', " +
                        "'" + alias.getDescripcion() + "');";
            }
            actualizar(query);
            return encontrado;
        }

    public boolean deleteAlias(Alias alias) throws MarvelException {
            String query = "DELETE FROM Alias AS a " +
                    "WHERE a.id = '" + alias.getId() + "'; ";
            actualizar(query);
            return findAlias(alias) != null;
    }


}
