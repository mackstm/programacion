package ies.puerto;

public class Ejercicio7 {
    public static void main(String[] args) {
    }

    /**
     * Funcion que devuelve un día de la semana degún el número introducido
     * @param day nímero dia
     * @return string de dia de la semana
     */
    public String dayOfTheWeek(int day) {
        String result;

        switch (day) {
            case 1:
                result = "Lunes";
                break;
            case 2:
                result = "Martes";
                break;
            case 3:
                result = "Miercoles";
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