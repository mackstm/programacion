package ies.puerto;

/**
 * @author José Maximiliano Boada Martín
 *
 * Escribe un programa en Java que encuentre todos los números Armstrong entre 1 y 1000.
 */
public class Ejercicio06 {
    public static void main(String[] args) {


        for (int i = 1; i <= 1000; i++) {

            int auxiliar = i, mult = 0, result = 0;

            // Bucle que extrae cada cifra y la eleva a 3. Puesto que estamos de 1 a 1000, usar funciones para potencias
            // no es necesario
            while (auxiliar > 0) {
                mult = auxiliar % 10;
                result = result + (mult * mult * mult);
                auxiliar /= 10;
            }

            if (result == i) {
                System.out.println(i);
            }
        }

    }
}
