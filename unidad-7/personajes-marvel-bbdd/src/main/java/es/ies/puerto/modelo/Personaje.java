package es.ies.puerto.modelo;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Clase personaje para almacenar superheroes
 * @author Jose Maximiliano Boada Martin
 */
public class Personaje {
    /**
     * Propiedades
     */
    private int personajeId;
    private String nombre;
    private String genero;
    private Set<Poder> poderes;

    /**
     * Constructor por defecto
     */
    public Personaje() {}

    /**
     * Constructor para busquedas
     * @param personajeId -
     */
    public Personaje(int personajeId) {
        this.personajeId = personajeId;
        poderes = new HashSet<>();
    }

    /**
     * Constructor completo
     * @param personajeId -
     * @param nombre -
     * @param genero -
     * @param poderes -
     */
    public Personaje(int personajeId, String nombre, String genero, Set<Poder> poderes) {
        this.personajeId = personajeId;
        this.nombre = nombre;
        this.genero = genero;
        this.poderes = poderes;
    }

    /**
     * Getters y setters
     */
    public int getPersonajeId() {
        return personajeId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Set<Poder> getPoderes() {
        return poderes;
    }

    public void setPoderes(Set<Poder> poderes) {
        this.poderes = poderes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personaje personaje = (Personaje) o;
        return personajeId == personaje.personajeId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(personajeId);
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "id=" + personajeId +
                ", nombre='" + nombre + '\'' +
                ", genero='" + genero + '\'' +
                ", poderes=" + poderes +
                '}';
    }
}
