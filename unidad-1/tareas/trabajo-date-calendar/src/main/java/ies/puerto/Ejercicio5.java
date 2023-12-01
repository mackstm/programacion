package ies.puerto;

import java.util.Calendar;

/**
 * Subtract 2 months
 * @author Jose Maximiliano Boada Martin
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        calendar.set(Calendar.MONTH, (calendar.get(Calendar.MONTH) - 2));

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DATE);

        System.out.println("Current date: " + day + "-" + month + "-" + year);
    }
}
