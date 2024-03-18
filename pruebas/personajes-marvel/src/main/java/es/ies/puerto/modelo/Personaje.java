package es.ies.puerto.modelo;

import es.ies.puerto.utilidades.UtilidadesClass;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Clase de personajes de marvel
 * @author Jose Maximiliano Boada Martin
 */
@Root(name = "personaje")
public class Personaje extends UtilidadesClass {
    /**
     * Propiedades
     */
    @Element(name = "nombre")
    private String nombre;
    @Element(name = "alias")
    private String alias;
    @Element(name = "genero")
    private String genero;
    @ElementList(name = "poderes", entry = "poder")
    private List<String> poderes;

    /**
     * Constructor por defecto
     */
    public Personaje() {
        poderes = new ArrayList<>();
    }

    /**
     * Constructor para las búsquedas. Se usa el alias porque, por ejemplo,
     * hay otros Spider-Man (como Miles Morales) que no son la misma persona
     * @param alias del personaje
     */
    public Personaje(String alias) {
        this.alias = alias;
    }

    /**
     * Constructor con todos los parametros relevantes
     * @param nombre del personaje
     * @param alias del personaje
     * @param genero del personaje
     * @param poderes del personaje
     */
    public Personaje(String nombre, String alias, String genero, List<String> poderes) {
        this.nombre = nombre;
        this.alias = alias;
        this.genero = genero;
        this.poderes = poderes;
    }

    /**
     * Getters y setters
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public List<String> getPoderes() {
        return poderes;
    }

    public void setPoderes(List<String> poderes) {
        this.poderes = poderes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personaje personaje = (Personaje) o;
        return Objects.equals(alias, personaje.alias);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alias);
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "nombre='" + nombre + '\'' +
                ", alias='" + alias + '\'' +
                ", genero='" + genero + '\'' +
                ", poderes=" + poderes +
                '}';
    }

    /**
     * Metodo para pasar datos a formato csv
     * @return datos en formato csv
     */
    public String toCsv() {
        String resultado = nombre + DELIMITADOR + alias + DELIMITADOR + genero + DELIMITADOR + "\"";
        for (String poder : poderes) {
            resultado += poder + ", ";
        }
        resultado = resultado.replaceAll(", $", "\"");
        return resultado;
    }
}
