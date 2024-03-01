package es.ies.puerto.modelo.fichero.implementa.csv;

import es.ies.puerto.modelo.abstractas.Producto;
import es.ies.puerto.modelo.entity.Alimento;
import es.ies.puerto.modelo.entity.Aparato;
import es.ies.puerto.modelo.entity.CuidadoPersonal;
import es.ies.puerto.modelo.entity.Souvenir;
import es.ies.puerto.modelo.fichero.abstractas.FicheroAbstract;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Clase para trabajar con ficheros CSV
 * @author Jose Maximiliano Boada Martin
 */
public class FileCsv extends FicheroAbstract {

    public FileCsv() {
        FICHERO_ALIMENTOS = "src/main/resources/alimentos.csv";
        FICHERO_APARATOS = "src/main/resources/aparatos.csv";
        FICHERO_SOUVENIRS = "src/main/resources/souvenirs.csv";
        FICHERO_CUIDADO_PERSONAL = "src/main/resources/cuidado-personal.csv";
    }
    public List<Producto> obtenerAlimentos(){
        return lecturaList(FICHERO_ALIMENTOS);
    }

    public Set<Producto> obtenerAparatos(){
        return lecturaSet(FICHERO_APARATOS,"aparato");
    }

    public Set<Producto> obtenerSouvenirs(){
        return lecturaSet(FICHERO_SOUVENIRS,"souvernir");
    }

    public Map<String, Producto> obtenerCuidados(){
        return lecturaMap(FICHERO_CUIDADO_PERSONAL);
    }

    @Override
    public List<Producto> lecturaList(String path) {
        List<Producto> alimentos = new ArrayList<>();
        if (existeFichero(path)) {
            try (BufferedReader br = new BufferedReader(new FileReader(path))) {
                String linea;
                int i = 0;
                while ((linea = br.readLine()) != null) {
                    if (i>0) {
                        String[] arrayElemento = linea.split(",");
                        alimentos.add(splitToAlimento(arrayElemento));
                    }
                    i++;
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("El fichero no existe o no es un fichero válido.");
        }
        return alimentos;
    }

    @Override
    public Set<Producto> lecturaSet(String path, String producto) {
        Set<Producto> productos = new HashSet<>();
        if (existeFichero(path)) {
            try (BufferedReader br = new BufferedReader(new FileReader(path))) {
                String linea;
                int i = 0;
                while ((linea = br.readLine()) != null) {
                    if (i>0) {
                        String[] arrayElemento = linea.split(",");
                        switch (producto) {
                            case "aparato":
                                productos.add(splitToDefault(arrayElemento, true));
                                break;
                            case "cuidado":
                                productos.add(splitToDefault(arrayElemento, false));
                                break;
                            default:
                                break;
                        }
                    }
                    i++;
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("El fichero no existe o no es un fichero válido.");
        }
        return productos;
    }

    @Override
    public Map<String, Producto> lecturaMap(String path) {
        Map<String, Producto> productosCuidado = new HashMap<>();
        if (existeFichero(path)) {
            try (BufferedReader br = new BufferedReader(new FileReader(path))) {
                String linea;
                int i = 0;
                while ((linea = br.readLine()) != null) {
                    if (i>0) {
                        String[] arrayElemento = linea.split(",");
                        productosCuidado.put(splitToCuidadoPersonal(arrayElemento).getUdi(),
                                splitToCuidadoPersonal(arrayElemento));
                    }
                    i++;
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("El fichero no existe o no es un fichero válido.");
        }
        return productosCuidado;
    }

    @Override
    public boolean escritura(String path, String contenido) {
        return almacenarEnFichero(path, contenido);
    }

    private Alimento splitToAlimento(String[] splitArray){
        Alimento alimento = new Alimento(splitArray[0],
                Float.parseFloat(splitArray[1]), splitArray[2],
                splitArray[3], splitArray[4]);
        return alimento;
    }
    private Producto splitToDefault(String[] splitArray, boolean esAparato) {
        if (esAparato) {
            Producto aparato = new Aparato(splitArray[0],
                    Float.parseFloat(splitArray[1]), splitArray[2], splitArray[3]);
            return aparato;
        }
        Producto souvenir = new Souvenir(splitArray[0],
                Float.parseFloat(splitArray[1]), splitArray[2], splitArray[3]);
        return souvenir;

    }
    private CuidadoPersonal splitToCuidadoPersonal(String[] splitArray) {
        CuidadoPersonal cuidadoPersonal = new CuidadoPersonal(splitArray[0],
                Float.parseFloat(splitArray[1]), splitArray[2],
                splitArray[3], Integer.parseInt(splitArray[4]));
        return cuidadoPersonal;
    }

}