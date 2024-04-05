package es.ies.puerto.model.db;

import es.ies.puerto.exception.UsuarioException;
import es.ies.puerto.model.Usuario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

public class OperacionesBdTest {
    OperacionesDb operacionesDb;
    String urlBd = "src/main/resources/usuarios.db";
    String MESSAGE_ERROR = "Resultado inesperado";
    Usuario usuario;
    @BeforeEach
    public void beforeEach() {
        operacionesDb = new OperacionesDb(urlBd);
        usuario = new Usuario("11", "pepe", 20, "DAMcity");
    }

    @Test
    public void obtenerUsuariosAllTest() {
        try {
            Set<Usuario> lista = operacionesDb.obtenerUsuarios();
            Assertions.assertEquals(10, lista.size(), MESSAGE_ERROR);
        } catch (UsuarioException e) {
            Assertions.fail(e.getMessage());
        }
    }

    @Test
    public void obtenerUsuarioTest() {
        Usuario usuario = new Usuario("5");
        try {
            usuario = operacionesDb.obtenerUsuario(usuario);
            Assertions.assertNotNull(usuario, MESSAGE_ERROR);
            Assertions.assertNotNull(usuario.getId(), MESSAGE_ERROR);
            Assertions.assertNotNull(usuario.getNombre(), MESSAGE_ERROR);
            Assertions.assertNotNull(usuario.getCiudad(), MESSAGE_ERROR);
        } catch (UsuarioException e) {
            Assertions.fail(e.getMessage());
        }
    }

    @Test
    public void insertarUsuarioTest() {

        try {
            int numeroUsuarios = operacionesDb.obtenerUsuarios().size();
            operacionesDb.insertarUsuario(usuario);
            Usuario usuarioObtenido = operacionesDb.obtenerUsuario(usuario);
            Assertions.assertEquals(usuario, usuarioObtenido, MESSAGE_ERROR);
            operacionesDb.eliminarUsuario(usuarioObtenido);
            int numeroUsuariosFinal = operacionesDb.obtenerUsuarios().size();
            Assertions.assertEquals(numeroUsuariosFinal, numeroUsuarios, MESSAGE_ERROR);
        } catch (UsuarioException e) {
            Assertions.fail(e.getMessage());
        }
    }

    @Test
    public void actualizarUsuarioTest() {
        String nombreUpdate = "Pepe Juan";
        int edadUpdate = 22;
        String ciudadUpdate = "Miami";
        try {
            operacionesDb.insertarUsuario(usuario);
            usuario.setCiudad(ciudadUpdate);
            usuario.setEdad(edadUpdate);
            usuario.setNombre(nombreUpdate);
            operacionesDb.actualizarUsuario(usuario);
            Usuario usuarioEncontrado = operacionesDb.obtenerUsuario(usuario);
            Assertions.assertEquals(usuario, usuarioEncontrado, MESSAGE_ERROR);
            operacionesDb.eliminarUsuario(usuarioEncontrado);
        } catch (UsuarioException e) {
            Assertions.fail(e.getMessage());
        }
    }
}
