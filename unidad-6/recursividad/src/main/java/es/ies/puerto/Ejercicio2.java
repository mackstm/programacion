package es.ies.puerto;

import java.util.ArrayList;
import java.util.List;

/**
 * Regressive count
 * @author Jose Maximiliano Boada Martin
 */
public class Ejercicio2 {
    public List<Integer> regressiveCount(int number) {
        List<Integer> regressiveList = new ArrayList<>();
        for (int i = number; i > 0; i--) {
            regressiveList.add(i);
        }
        return regressiveList;
    }

    public List<Integer> regressiveCountRecursive(int number) {
        List<Integer> regressiveList = new ArrayList<>();
        regressiveList.add(number);
        if(number == 1) {
            return regressiveList;
        }
        regressiveList.addAll(regressiveCountRecursive(number - 1));
        return regressiveList;
    }
}
