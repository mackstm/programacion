package es.ies.puerto.presentacion;

import es.ies.puerto.negocio.TiendaNegocio;

/**
 * Metodo main con menu para probar tienda
 * @author Jose Maximiliano Boada Martin
 */
public class AppTienda {
    static TiendaNegocio tiendaNegocio;
    public static void main(String[] args) {
        tiendaNegocio = new TiendaNegocio();

        System.out.println(tiendaNegocio.obtenerProductos());
        System.out.println();
        System.out.println(tiendaNegocio.mostrarRecomendados());
        System.out.println();
        System.out.println(tiendaNegocio.gananciaTotalAlimentos());
        System.out.println();
        System.out.println(tiendaNegocio.precioTotalTienda());
    }
}
