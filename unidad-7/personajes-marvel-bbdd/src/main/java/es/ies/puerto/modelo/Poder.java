package es.ies.puerto.modelo;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

/**
 * Poderes de personajes
 * @author Jose Maximiliano Boada Martin
 */
@Entity
@Table(name = "Poder")
public class Poder {
    /**
     * Propiedades
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "poderId", nullable = false)
    private int poderId;
    @Column(name = "poder")
    private String poder;

    @ManyToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "poderes")
    @Fetch(FetchMode.SELECT)
    private Set<Personaje> personajes;

    /**
     * Constructor por defecto
     */
    public Poder() {}

    /**
     * Constructor para busquedas
     * @param poderId -
     */
    public Poder(int poderId) {
        this.poderId = poderId;
    }

    /**
     * Constructor completo
     * @param poderId -
     * @param poder -
     */
    public Poder(int poderId, String poder) {
        this.poderId = poderId;
        this.poder = poder;
    }

    /**
     * Getters y setters
     */
    public int getPoderId() {
        return poderId;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Poder poder = (Poder) o;
        return poderId == poder.poderId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(poderId);
    }

    @Override
    public String toString() {
        return "Poder{" +
                "id=" + poderId +
                ", poder='" + poder + '\'' +
                '}';
    }
}
