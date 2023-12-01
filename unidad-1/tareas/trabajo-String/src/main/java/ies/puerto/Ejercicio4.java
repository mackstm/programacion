package ies.puerto;

/**
 * Invert a string
 * @author Jose Maximiliano Boada Martin
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        String avocado = "avocado with lemon";
        String odacova = invertAvocado(avocado);
        System.out.println(odacova);
    }

    public static String invertAvocado(String str) {
        String inverseStr = "";
        for (int i = 0; i < str.length(); i++) {
            inverseStr += str.charAt(str.length() - i - 1);
        }
        return inverseStr;
    }
}
