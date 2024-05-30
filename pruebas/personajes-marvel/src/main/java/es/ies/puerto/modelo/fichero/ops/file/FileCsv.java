package es.ies.puerto.modelo.fichero.ops.file;

import es.ies.puerto.modelo.fichero.ops.Personaje;
import es.ies.puerto.modelo.fichero.ops.file.abstracts.FileAbstract;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que trabaja con datos en fichero csv
 * @author Jose Maximiliano Boada Martin
 */
public class FileCsv extends FileAbstract {

    /**
     * Constructor por defecto
     */
    public FileCsv() {
        super("src/main/resources/data.csv");
    }

    /**
     * Obtiene lista de personajes en fichero
     * @return personajes
     */
    @Override
    public List<Personaje> obtenerPersonajes() {
        List<Personaje> personajes = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(getPath()))) {
            String linea;
            int counter = 0;
            while ((linea = br.readLine()) != null) {
                if (counter > 0) {
                    String[] datos = linea.split(DELIMITADOR);
                    String nombre = datos[0];
                    String alias = datos[1];
                    String genero = datos[2];
                    List<String> poderes = new ArrayList<>();
                    for (int i = 3; i < datos.length; i++) {
                        datos[i] = datos[i].replaceAll("\"", "").trim();
                        poderes.add(datos[i]);
                    }
                    Personaje personaje = new Personaje(nombre, alias, genero, poderes);
                    personajes.add(personaje);
                }
                counter++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return personajes;

    }

    /**
     * Obtiene un personaje del fichero
     * @param personaje a obtener
     * @return personaje obtenido
     */
    @Override
    public Personaje obtenerPersonaje(Personaje personaje) {
        boolean encontrado = false;
        try (BufferedReader br = new BufferedReader(new FileReader(getPath()))) {
            String linea;
            while (((linea = br.readLine()) != null) && !encontrado) {
                String[] datos = linea.split(DELIMITADOR);
                String alias = datos[1];
                if (alias.equals(personaje.getAlias())) {
                    String nombre = datos[0];
                    String genero = datos[2];
                    List<String> poderes = new ArrayList<>();
                    for (int i = 3; i < datos.length; i++) {
                        datos[i] = datos[i].replaceAll("\"", "").trim();
                        poderes.add(datos[i]);
                    }
                    personaje.setNombre(nombre);
                    personaje.setGenero(genero);
                    personaje.setPoderes(poderes);
                    encontrado = true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return personaje;
    }

    /**
     * Agrega un personaje al fichero
     * @param personaje a agregar
     */
    @Override
    public void addPersonaje(Personaje personaje) {
        Personaje personajeBuscar = new Personaje(personaje.getAlias());
        personajeBuscar = obtenerPersonaje(personajeBuscar);
        if (personajeBuscar.getNombre() == null) {
            try (FileWriter writer = new FileWriter(getPath(), true)) {
                writer.write(personaje.toCsv()+ "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Elimina un personaje del fichero
     * @param personaje a eliminar
     */
    @Override
    public void deletePersonaje(Personaje personaje) {
        Personaje personajeBuscar = new Personaje(personaje.getAlias());
        List<Personaje> personajes = obtenerPersonajes();
        personajes.remove(personaje);
        try (FileWriter writer = new FileWriter(getPath())) {
            writer.write("nombre,alias,genero,poderes\n");
            for (Personaje personajeFile : personajes) {
                writer.write(personajeFile.toCsv() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Modifica un personaje del fichero
     * @param personaje a modificar
     */
    @Override
    public void updatePersonaje(Personaje personaje) {
        List<Personaje> personajes = obtenerPersonajes();
        try (FileWriter writer = new FileWriter(getPath())) {
            writer.write("nombre,alias,genero,poderes\n");
            for (Personaje personasFile : personajes) {
                if (personasFile.equals(personaje)) {
                    writer.write(personaje.toCsv() + "\n");
                } else {
                    writer.write(personasFile.toCsv() + "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
