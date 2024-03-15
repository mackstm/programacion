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


        for (int i = 0; i < texto.length(); i++) {
            //pene
            if (repeticiones.containsKey(texto.charAt(i))) {
                repeticiones.replace(texto.charAt(i), repeticiones.get(texto.charAt(i)) + 1);
            }
        }

        int max = 0;
        for (Character letra : repeticiones.keySet()) {
            if (max < repeticiones.get(letra)) {
                max = repeticiones.get(letra);
                vocal = letra;
            }
        }
        return vocal;
    }
}
