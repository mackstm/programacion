package es.ies.puerto.modelo.fichero.abstractas;

import es.ies.puerto.modelo.fichero.interfaces.IFichero;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Clase abstracta para manipulacion de ficheros
 * @author Jose Maximiliano Boada Martin
 */
public abstract class FicheroAbstract implements IFichero {
    public String FICHERO_ALIMENTOS= "";
    public  String FICHERO_APARATOS= "";
    public  String FICHERO_CUIDADO_PERSONAL= "";
    public String FICHERO_SOUVENIRS= "";

    public boolean existeFichero(String path) {
        if (path == null || path.isEmpty()) {
            return false;
        }
        File fichero = new File(path);
        return fichero.exists() && fichero.isFile();
    }

    public  boolean almacenarEnFichero(String path, String texto) {
        if (!existeFichero(path)) {
            return false;
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            bw.write(texto);
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
