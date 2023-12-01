package ies.puerto;

/**
 * Compare two strings
 * @author Jose Maximiliano Boada Martin
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        String avocado = "avocado with lemon";
        String avocadoEqual = "Avocado with lemon";
        String avocadoNotEqual = "lemon with avocado";

        System.out.println(avocado.equalsIgnoreCase(avocadoEqual));
        System.out.println(avocado.equalsIgnoreCase(avocadoNotEqual));
    }
}
