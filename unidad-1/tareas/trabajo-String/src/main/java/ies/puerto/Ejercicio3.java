package ies.puerto;

/**
 * Count vowels in string
 * @author Jose Maximiliano Boada Martin
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        String avocado = "Avocado with lemon";

        avocado = avocado.toLowerCase();

        System.out.println(countVowels(avocado));
    }

    public static int countVowels(String str) {
        int counter = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' ||
                    str.charAt(i) == 'u') {
                counter++;
            }
        }

        return counter;
    }
}
