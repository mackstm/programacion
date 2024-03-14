package es.ies.puerto.ejercicio.tres;

import java.util.HashMap;
import java.util.Map;

public class Hechicero {

    public char vocalMasPoderosa(String texto) {
        char vocal = ' ';
        texto = texto.toLowerCase();
        Map<Character, Integer> repeticiones = new HashMap<>();
        repeticiones.put('a', 0);
        repeticiones.put('e', 0);
        repeticiones.put('i', 0);
        repeticiones.put('o', 0);
        repeticiones.put('u', 0);

        int max = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (repeticiones.containsKey(texto.charAt(i))) {
                repeticiones.replace(texto.charAt(i), repeticiones.get(texto.charAt(i)) + 1);
                if (max <= repeticiones.get(texto.charAt(i))) {
                    max = repeticiones.get(texto.charAt(i));
                }
            }
        }

        vocal = repeticiones
        return vocal;
    }
}
