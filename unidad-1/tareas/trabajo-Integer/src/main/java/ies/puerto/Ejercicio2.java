package ies.puerto;

/**
 * Convert integer to string and viceversa
 * @author Jose Maximiliano Boada Martin
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Integer value = 123;
        String valueStr;
        int valueInt;

        valueStr = value.toString();
        valueInt = Integer.parseInt(valueStr);

        System.out.println(value + " " + valueStr + " " + valueInt);
    }
}
