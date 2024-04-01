package es.ies.puerto.model;

public class Usuario extends Persona{
    public Usuario(String id) {
        super(id);
    }

    public Usuario(String id, String nombre, int edad, String ciudad) {
        super(id, nombre, edad, ciudad);
    }
}
