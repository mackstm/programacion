package es.ies.puerto.modelo.interfaces;

/**
 * Interfaz para la comprobacion de la calidad del producto
 * @author Jose Maximiliano Boada Martin
 */
public interface ISaludable {
    int calcularDiasCaducidad();
    boolean verificarCaducidad();
}
