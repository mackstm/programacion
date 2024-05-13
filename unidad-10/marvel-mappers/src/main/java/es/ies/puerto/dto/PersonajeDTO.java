package es.ies.puerto.dto;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class PersonajeDTO {
    private String id;
    private String nombre;
    private String genero;

    private AliasDTO alias;
    private Set<EquipamientoDTO> equipamientos;
    private Set<PoderDTO> poderes;

    public PersonajeDTO() {
        equipamientos = new HashSet<>();
        poderes = new HashSet<>();
    }

    public PersonajeDTO(String id) {
        this.id = id;
    }

    public PersonajeDTO(String id, String nombre, String genero, AliasDTO alias, Set<EquipamientoDTO> equipamientos,
                     Set<PoderDTO> poderes) {
        this.id = id;
        this.nombre = nombre;
        this.genero = genero;
        this.alias = alias;
        this.equipamientos = equipamientos;
        this.poderes = poderes;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public AliasDTO getAlias() {
        return alias;
    }

    public void setAlias(AliasDTO alias) {
        this.alias = alias;
    }

    public Set<EquipamientoDTO> getEquipamientos() {
        return equipamientos;
    }

    public void setEquipamientos(Set<EquipamientoDTO> equipamientos) {
        this.equipamientos = equipamientos;
    }

    public Set<PoderDTO> getPoderes() {
        return poderes;
    }

    public void setPoderes(Set<PoderDTO> poderes) {
        this.poderes = poderes;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "PersonajeDTO{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", genero='" + genero + '\'' +
                ", alias=" + alias +
                ", equipamientos=" + equipamientos +
                ", poderes=" + poderes +
                '}';
    }
}
