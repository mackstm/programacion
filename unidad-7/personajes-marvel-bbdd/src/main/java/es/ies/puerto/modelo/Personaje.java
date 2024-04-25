package es.ies.puerto.modelo;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Clase personaje para almacenar superheroes
 * @author Jose Maximiliano Boada Martin
 */

@Entity
@Table(name = "Personaje")
public class Personaje {
    /**
     * Propiedades
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "personajeId", nullable = false)
    private int personajeId;
    @Column(name = "nombre", nullable = false)
    private String nombre;

    @OneToOne(mappedBy = "personaje")
    private Alias alias;
    @Column(name = "genero")
    private String genero;
    @ManyToMany(cascade = { CascadeType.ALL },
            fetch = FetchType.LAZY)
    @Fetch(FetchMode.SELECT)
    @JoinTable(name = "PersonajePoder",
            joinColumns = { @JoinColumn(name = "personajeId") },
            inverseJoinColumns = { @JoinColumn(name = "poderId")})
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

    public Alias getAlias() {
        return alias;
    }

    public void setAlias(Alias alias) {
        this.alias = alias;
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
