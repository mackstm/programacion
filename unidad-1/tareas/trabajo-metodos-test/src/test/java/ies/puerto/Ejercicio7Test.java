package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio7Test {

    Ejercicio7 ejercicio7 = new Ejercicio7();

    public void verifyDayOfTheWeek(String strDay, int numDay) {
        String result = "";

        result = ejercicio7.dayOfTheWeek(numDay);
        Assertions.assertEquals(strDay, result, "No se ha obtenido el resultado esperado");
    }

    @Test
    public void dayOfTheWeekTestOK() {
        verifyDayOfTheWeek("Lunes", 1);
        verifyDayOfTheWeek("Martes", 2);
        verifyDayOfTheWeek("Miercoles", 3);
        verifyDayOfTheWeek("Jueves", 4);
        verifyDayOfTheWeek("Viernes", 5);
        verifyDayOfTheWeek("Sabado", 6);
        verifyDayOfTheWeek("Domingo", 7);
        verifyDayOfTheWeek("El número introducido no corresponde a ningún día de la semana", 9);
        verifyDayOfTheWeek("El número introducido no corresponde a ningún día de la semana", -9);
    }

}