package ies.puerto;

import java.util.Calendar;

/**
 * Verify if current date is a Saturday or a Sunday using Calendar
 * @author Jose Maximiliano Boada Martin
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        if (isWeekend(calendar)) {
            System.out.println("WEEKEND!!!!");
        } else {
            System.out.println("No weekend :(");
        }
    }

    public static boolean isWeekend(Calendar calendar) {
        return calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY ||
                calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY;
    }
}
