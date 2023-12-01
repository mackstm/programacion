package ies.puerto;

import java.util.Calendar;

/**
 * Sum 10 days to current date
 * @author Jose Maximiliano Boada Martin
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        calendar.set(Calendar.DATE, (calendar.get(Calendar.DATE) + 10));

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DATE);

        System.out.println("Current date: " + day + "-" + month + "-" + year);
    }
}
