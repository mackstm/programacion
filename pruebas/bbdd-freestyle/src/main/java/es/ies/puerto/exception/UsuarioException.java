package es.ies.puerto.exception;

public class UsuarioException extends Exception {
    public UsuarioException(String message) {
        super(message);
    }

    public UsuarioException(String message, Throwable type) {
        super(message, type);
    }
}
