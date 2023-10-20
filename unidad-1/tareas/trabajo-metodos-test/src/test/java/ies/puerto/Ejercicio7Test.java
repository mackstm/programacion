package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio7Test {

    Ejercicio7 ejercicio7 = new Ejercicio7();

    @Test
    public void dayOfTheWeekTestOK() {
        String result = "";
        String resultOK = "Lunes";

        result = ejercicio7.dayOfTheWeek(1);
        Assertions.assertEquals(resultOK, result, "No se ha obtenido el resultado esperado");
    }
}
