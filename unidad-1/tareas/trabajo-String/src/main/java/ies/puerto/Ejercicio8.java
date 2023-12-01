package ies.puerto;

/**
 * Convert to lowercase and uppercase
 * @author Jose Maximiliano Boada Martin
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        String avocado = "AVOCADO WITH LEMON";
        String lemon = "lemon with avocado";

        String lowerAvocado = avocado.toLowerCase();
        String upperLemon = lemon.toUpperCase();

        System.out.println(lowerAvocado + "\n" + upperLemon);
    }
}
