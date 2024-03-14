package es.ies.puerto.ejercicio.cuatro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Join {
    List<Map<String, Object>> tabla1;
    List<Map<String, Object>> tabla2;
    public Join() {
        tabla1 = new ArrayList<>();
        tabla2 = new ArrayList<>();

        Map<String, Object> fila1 = new HashMap<>();
        fila1.put("id", 1);
        fila1.put("nombre", "Juan");
        tabla1.add(fila1);

        Map<String, Object> fila2 = new HashMap<>();
        fila2.put("id", 2);
        fila2.put("nombre", "María");
        tabla1.add(fila2);

        Map<String, Object> fila3 = new HashMap<>();
        fila3.put("id", 1);
        fila3.put("producto", "Camisa");
        tabla2.add(fila3);

        Map<String, Object> fila4 = new HashMap<>();
        fila4.put("id", 3);
        fila4.put("producto", "Zapatos");
        tabla2.add(fila4);
    }

    Map<Integer, List<Object>> innerJoin(Map<Integer, String> tabla1, Map<Integer, Integer> tabla2){
        Map<Integer, List<Object>> resultado = new HashMap<>();

        for (Integer clave1 : tabla1.keySet()) {
            for (Integer clave2 : tabla2.keySet()) {
                if (clave1.equals(clave2)) {
                    List<Object> joinList = new ArrayList<>();
                    joinList.add(tabla1.get(clave1));
                    joinList.add(tabla2.get(clave2));
                    resultado.put(clave1, joinList);
                }
            }
        }
        return resultado;
    }

    Map<Integer, List<Object>> leftJoin(Map<Integer, String> tabla1, Map<Integer, Integer> tabla2){
        Map<Integer, List<Object>> resultado = new HashMap<>();
        for (Integer clave1 : tabla1.keySet()) {
                    List<Object> fila = new ArrayList<>();
                    fila.add(tabla1.get(clave1));
                    fila.add(tabla2.get(clave1));
                    resultado.put(clave1, fila);
        }
        return resultado;
    }

    Map<Integer, List<Object>> rightJoin(Map<Integer, String> tabla1, Map<Integer, Integer> tabla2){
        Map<Integer, List<Object>> resultado = new HashMap<>();
        for (Integer clave2 : tabla2.keySet()) {
            List<Object> fila = new ArrayList<>();
            fila.add(tabla1.get(clave2));
            fila.add(tabla2.get(clave2));
            resultado.put(clave2, fila);
        }
        return resultado;
    }

    Map<Integer, List<Object>> fullJoin(Map<Integer, String> tabla1, Map<Integer, Integer> tabla2){
        Map<Integer, List<Object>> resultado = new HashMap<>();
        for (Integer clave1 : tabla1.keySet()) {
            for (Integer clave2 : tabla2.keySet()) {
                    List<Object> fila1 = new ArrayList<>();
                    List<Object> fila2 = new ArrayList<>();
                    fila1.add(tabla1.get(clave1));
                    fila1.add(tabla2.get(clave1));
                    fila2.add(tabla1.get(clave2));
                    fila2.add(tabla2.get(clave2));
                    resultado.put(clave1, fila1);
                    resultado.put(clave2, fila2);

            }
        }
        return resultado;
    }
}
