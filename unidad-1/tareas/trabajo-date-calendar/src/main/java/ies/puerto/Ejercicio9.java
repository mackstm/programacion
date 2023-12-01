package ies.puerto;

import java.util.Calendar;

/**
 * Show first day of current month using Calendar
 * @author Jose Maximiliano Boada Martin
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        calendar.set(Calendar.DATE, 1);

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DATE);

        System.out.println("Current date: " + day + "-" + month + "-" + year);
    }
}
