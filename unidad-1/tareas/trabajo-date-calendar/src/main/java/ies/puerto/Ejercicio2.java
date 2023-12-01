package ies.puerto;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Format current date
 * @author Jose Maximiliano Boada Martin
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Date currentDate = new Date();
        DateFormat currentDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formattedDate = currentDateFormat.format(currentDate);
        System.out.println("Formatted date: " + formattedDate);
    }
}
