package es.ies.puerto.model.db;

import es.ies.puerto.exception.UsuarioException;
import es.ies.puerto.model.Usuario;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

public class OperacionesDb extends Conexion {
    public OperacionesDb(String url) {
        super(url);
    }

    public OperacionesDb(String url, String user, String password) {
        super(url, user, password);
    }



    private Set<Usuario> obtener(String query) throws UsuarioException {
        Set<Usuario> lista = new HashSet<>();
        Statement statement = null;
        ResultSet rs = null;
        try {
            statement = getConexion().createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()) {
                String userId= rs.getString("id");
                String userName = rs.getString("nombre");
                int userAge = rs.getInt("edad");
                String userCity = rs.getString("ciudad");
                Usuario usuario = new Usuario(userId, userName, userAge, userCity);
                lista.add(usuario);
            }
        } catch (SQLException e) {
            throw new UsuarioException(e.getMessage(), e);
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
        return lista;
    }

    private void actualizar(String query) throws UsuarioException {
        Statement statement = null;
        try {
            statement = getConexion().createStatement();
            statement.executeUpdate(query);

        } catch (SQLException e) {
            throw new UsuarioException(e.getMessage(), e);
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

    public Set<Usuario> obtenerUsuarios() throws UsuarioException {
        String query = "SELECT u.id, u.nombre, u.edad, u.ciudad FROM USUARIOS AS u";
        return obtener(query);
    }

    public Usuario obtenerUsuario(Usuario usuario) throws UsuarioException {
        String query = "SELECT u.id, u.nombre, u.edad, u.ciudad FROM USUARIOS AS u" +
                " WHERE u.id = '" + usuario.getId() + "'";
        Set<Usuario> lista = obtener(query);
        if (lista.isEmpty()) {
            return null;
        }
        return lista.iterator().next();
    }

    public void insertarUsuario(Usuario usuario) throws UsuarioException {
        String query = "INSERT INTO Usuarios AS u (nombre, edad, ciudad)" +
                " VALUES ('" + usuario.getNombre() +
                "', " + usuario.getEdad() +
                ", '" + usuario.getCiudad() + "')";
        actualizar(query);
    }

    public void eliminarUsuario(Usuario usuario) {

    }

    public void actualizarUsuario(Usuario usuario) {

    }
}
