package ies.puerto;

public class Ejercicio6 {

    public void matrixFrame() {
        int[][] frame = new int [5][15];

        for (int i = 0; i < frame[0].length; i++) {
            frame[0][i] = 1;
            frame[frame.length - 1][i] = 1;
        }
        for (int i = 1; i < frame.length - 1; i++) {
            frame[i][0] = 1;
            frame[i][frame[0].length - 1] = 1;
        }
    }
}