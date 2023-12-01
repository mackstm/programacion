package ies.puerto;

import java.util.Calendar;

/**
 * Calculate difference in days with Calendar class
 * @author Jose Maximiliano Boada Martin
 */
public class Ejercicio7 {
    public int subtractDays(Calendar calendar1, Calendar calendar2) {
        return Math.abs(calendar1.get(Calendar.DATE) - calendar2.get(Calendar.DATE));
    }
}
