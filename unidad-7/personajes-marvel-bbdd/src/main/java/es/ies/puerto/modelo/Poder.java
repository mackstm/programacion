package es.ies.puerto.modelo;

import java.util.Objects;

/**
 * Poderes de personajes
 * @author Jose Maximiliano Boada Martin
 */
public class Poder {
    /**
     * Propiedades
     */
    private int poderId;
    private String poder;

    /**
     * Constructor por defecto
     */
    public Poder() {}

    /**
     * Constructor para busquedas
     * @param poderId
     */
    public Poder(int poderId) {
        this.poderId = poderId;
    }

    /**
     * Constructor completo
     * @param poderId
     * @param poder
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
