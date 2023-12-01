package ies.puerto;

import java.util.Calendar;

/**
 * Use Calendar class to obtain current date with separated components
 * @author Jose Maximiliano Boada Martin
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DATE);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);

        System.out.println("Current date: " + day + "-" + month + "-" + year + " " + hour + ":" + minute + ":" +
                second);
    }
}
