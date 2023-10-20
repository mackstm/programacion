package ies.puerto;

public class Ejercicio7 {
    public static void main(String[] args) {
        System.out.println("Hola Mundo al ejercicio X");
    }
    public String dayOfTheWeek(int day) {
        String result = "Domingo";

        switch (day) {
            case 1:
                result = "Lunes";
                break;
            case 2:
                result = "Martes";
                break;
            case 3:
                result = "Miércoles";
                break;
            case 4:
                result = "Jueves";
                break;
            case 5:
                result = "Viernes";
                break;
            case 6:
                result = "Sabado";
                break;
            case 7:
                result = "Domingo";
                break;
            default:
                result = "El número introducido no corresponde a ningún día de la semana";
        }

        return result;
    }
}