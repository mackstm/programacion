package es.ies.puerto.modelo;

import java.util.Objects;

/**
 * Alias de superheroe
 * @author Jose Maximiliano Boada Martin
 */
public class Alias {
    /**
     * Propiedades
     */
    private int aliasId;
    private Personaje personaje;
    private String alias;

    /**
     * Constructor por defecto
     */
    public Alias() {}

    /**
     * Constructor para busquedas
     * @param aliasId -
     */
    public Alias(int aliasId) {
        this.aliasId = aliasId;
    }

    /**
     * Constructor con todos los parametros
     * @param aliasId -
     * @param personaje -
     * @param alias -
     */
    public Alias(int aliasId, Personaje personaje, String alias) {
        this.aliasId = aliasId;
        this.personaje = personaje;
        this.alias = alias;
    }

    /**
     * Getters y setters
     */
    public int getAliasId() {
        return aliasId;
    }

    public void setAliasId(int aliasId) {
        this.aliasId = aliasId;
    }

    public Personaje getPersonaje() {
        return personaje;
    }

    public void setPersonaje(Personaje personaje) {
        this.personaje = personaje;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alias alias = (Alias) o;
        return aliasId == alias.aliasId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(aliasId);
    }

    @Override
    public String toString() {
        return "Alias{" +
                "aliasId=" + aliasId +
                ", personaje=" + personaje +
                ", alias='" + alias + '\'' +
                '}';
    }
}
