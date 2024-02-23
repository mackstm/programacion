package es.ies.puerto.modelo.entity;

import es.ies.puerto.modelo.abstractas.ProductoFresco;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Clase para alimentos que extienden producto fresco
 * @author Jose Maximiliano Boada Martin
 */
public class Alimento extends ProductoFresco {

    /**
     * Constructor por defecto
     */
    public Alimento() {}

    /**
     * Constructor con identificador como parametro
     * @param udi del alimento
     */
    public Alimento(String udi) {
        super(udi);
    }

    /**
     * Constructor con todos los parametros
     * @param nombre del alimento
     * @param precio del alimento
     * @param fechaEntrada del alimento
     * @param udi del alimento
     * @param fechaCaducidad del alimento
     */
    public Alimento(String nombre, float precio, String fechaEntrada, String udi, String fechaCaducidad) {
        super(nombre, precio, fechaEntrada, udi, fechaCaducidad);
    }

    /**
     * Calcula los dias que faltan para que el producto dado se caduque. Si la fecha de caducidad introducida es
     * invalida, se asume que caduca hoy
     * @return
     */
    @Override
    public int calcularDiasCaducidad() {
        int resultado = 0;
        Calendar hoy = Calendar.getInstance();
        Calendar calendarCaducidad = Calendar.getInstance();
        DateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
        Date diaCaducidad = null;
        try {
            diaCaducidad = formatoFecha.parse(getFechaCaducidad());
        } catch (ParseException e) {
            diaCaducidad = new Date();
        }

        calendarCaducidad.setTime(diaCaducidad);
        long diferencia = calendarCaducidad.getTimeInMillis() - hoy.getTimeInMillis();
        resultado = (int) (diferencia / 1000) * (3600 * 24);
        return resultado;
    }

    /**
     * Verifica que el producto está caducado
     * @return true si esta caducado, false si no lo esta
     */
    @Override
    public boolean verificarCaducidad() {
        return calcularDiasCaducidad() <= 0;
    }

    /**
     * Calcula el precio maximo para los alimentos
     * @return precio máximo
     */
    @Override
    public float precioMaximo() {
        return getPrecio() * 1.35f;
    }

    /**
     * Cantidad disponible de alimentos
     * @return cantidad disponible
     */
    @Override
    public int cantidadDisponible() {
        return 0;
    }

    @Override
    public String toString() {
        return "{Nombre: " + getNombre() +
                ", precio normal: " + getPrecio() +
                ", precio maximo: " + precioMaximo() +
                ", fecha de entrada: " + getFechaEntrada() +
                ", UDI: " + getUdi() +
                ", Fecha de caducidad: " + getFechaCaducidad() + "}";
    }
}
