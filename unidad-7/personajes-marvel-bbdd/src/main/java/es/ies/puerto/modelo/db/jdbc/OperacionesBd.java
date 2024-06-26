package es.ies.puerto.modelo.db.jdbc;

import es.ies.puerto.exception.UsuarioException;
import es.ies.puerto.modelo.Alias;
import es.ies.puerto.modelo.Personaje;
import es.ies.puerto.modelo.Poder;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

/**
 * Operaciones de bbdd sobre personajes
 * @author Jose Maximiliano Boada Martin
 */
public class OperacionesBd extends Conexion{

    /**
     * Constructor para crear la conexion
     * @param url -
     * @throws UsuarioException -
     */
    public OperacionesBd(String url) throws UsuarioException {
        super(url);
    }

    /**
     * Para escritura
     * @param query -
     * @throws UsuarioException -
     */
    private void actualizar(String query) throws UsuarioException {
        Statement statement = null;
        try {
            statement = getConexion().createStatement();
            statement.executeUpdate(query);
        } catch (SQLException exception) {
            throw new UsuarioException(exception.getMessage(), exception);
        } finally {
            try {
                if (statement != null && !statement.isClosed()) {
                    statement.close();
                }
                if (!getConexion().isClosed()) {
                    getConexion().close();
                }
            } catch (SQLException e) {
                throw new UsuarioException(e.getMessage(), e);
            }
        }
    }

    /**
     * Para lectura
     * @param query -
     * @return -
     * @throws UsuarioException -
     */
    private Set<Personaje> obtener(String query) throws UsuarioException {
        Set<Personaje> personajes = new HashSet<>();
        Statement statement = null;
        ResultSet rs = null;
        try {
            statement = getConexion().createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()) {
                int personajeId = rs.getInt("personajeId");
                String personajeNombre = rs.getString("nombre");
                int aliasId = rs.getInt("aliasId");
                String aliasStr = rs.getString("alias");
                String personajeGenero = rs.getString("genero");
                int poderId = rs.getInt("poderId");
                String poderStr = rs.getString("poder");
                Poder poder = new Poder(poderId, poderStr);
                Personaje personaje = new Personaje(personajeId, personajeNombre,
                        personajeGenero, new HashSet<>());
                Alias alias = new Alias(aliasId, personaje, aliasStr);
                personaje.setAlias(alias);
                personajes.add(personaje);
                personajes.iterator().next().getPoderes().add(poder);
            }

        } catch (SQLException exception) {
            throw new UsuarioException(exception.getMessage(), exception);
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
            } catch (SQLException e) {
                throw new UsuarioException(e.getMessage(), e);
            }
        }
        return personajes;
    }

    /**
     * Obtiene los personajes de la bd
     * @return -
     * @throws UsuarioException -
     */
    public Set<Personaje> obtenerPersonajes() throws UsuarioException {
        String query = "SELECT p.personajeId, p.nombre, a.aliasId, a.alias, p.genero, po.poderId, po.poder " +
                "FROM Personaje AS p " +
                "JOIN PersonajePoder AS pp ON p.personajeId = pp.personajeId " +
                "JOIN Poder AS po ON po.poderId = pp.poderId " +
                "JOIN Alias AS a ON p.personajeId = a.personajeId";
        return obtener(query);
    }

    /**
     * Obtiene un personaje de la bd
     * @param personaje -
     * @return -
     * @throws UsuarioException -
     */
    public Personaje obtenerPersonaje(Personaje personaje) throws UsuarioException {
        String query = "SELECT p.personajeId, p.nombre, a.aliasId, a.alias, p.genero, po.poderId, po.poder " +
                "FROM Personaje AS p " +
                "JOIN PersonajePoder AS pp ON p.personajeId = pp.personajeId " +
                "JOIN Poder AS po ON po.poderId = pp.poderId " +
                "JOIN Alias AS a ON p.personajeId = a.personajeId " +
                "WHERE p.personajeId = " + personaje.getPersonajeId();
        Set<Personaje> lista = obtener(query);
        if(lista.isEmpty()) {
            return null;
        }
        return lista.iterator().next();
    }

    /**
     * Inserta un personaje en la bd
     * @param personaje -
     * @throws UsuarioException -
     */
    public void insertarPersonaje(Personaje personaje) throws UsuarioException {
        String query = "INSERT INTO Personaje VALUES " +
                "(" + personaje.getPersonajeId() + ", " +
                "'" + personaje.getNombre() + "'" + ", " +
                "'" + personaje.getGenero() + "'" + ");";
        for (Poder poder : personaje.getPoderes()) {
            query += "INSERT INTO PersonajePoder VALUES " +
                    "(" + personaje.getPersonajeId() + ", " + poder.getPoderId() + ");";
        }
        query += "INSERT INTO Alias VALUES " +
                "(" + personaje.getAlias().getAliasId() + ", " +
                 personaje.getPersonajeId() + ", " +
                "'" + personaje.getAlias().getAlias() + "');";
        actualizar(query);
    }

    /**
     * Actualiza personaje existente en la bd
     * @param personaje -
     * @throws UsuarioException -
     */
    public void actualizarPersonaje(Personaje personaje) throws UsuarioException{
        String query = "UPDATE Personaje " +
                "SET nombre = '" + personaje.getNombre() + "', " +
                "genero = '" + personaje.getGenero() + "' " +
                "WHERE personajeId = " + personaje.getPersonajeId() + ";" +
                "DELETE FROM PersonajePoder WHERE personajeId = " + personaje.getPersonajeId() + ";";
        for (Poder poder : personaje.getPoderes()) {
            query += "INSERT INTO PersonajePoder VALUES " +
                    "(" + personaje.getPersonajeId() + ", " + poder.getPoderId() + ");";
        }
        actualizar(query);
    }

    /**
     * Elimina un personaje de la bd
     * @param personaje -
     * @throws UsuarioException -
     */
    public void eliminarPersonaje(Personaje personaje) throws UsuarioException{
        String query = "DELETE FROM Personaje AS p WHERE p.personajeId = " + personaje.getPersonajeId() + "; " +
                "DELETE FROM Alias AS a WHERE a.personajeId = " + personaje.getPersonajeId() + "; " +
                "DELETE FROM PersonajePoder AS pp WHERE pp.personajeId = " + personaje.getPersonajeId();

        actualizar(query);
    }
}
