package ies.puerto;

/**
 * Take a phrase and divide it into words
 * @author Jose Maximiliano Boada Martin
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        String avocado = "avocado with lemon";
        String[] avocados = avocado.split(" ");

        for (int i = 0; i < avocados.length; i++) {
            System.out.println(avocados[i]);
        }
    }
}
