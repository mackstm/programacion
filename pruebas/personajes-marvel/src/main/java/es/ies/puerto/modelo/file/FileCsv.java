package es.ies.puerto.modelo.file;

import es.ies.puerto.modelo.Personaje;
import es.ies.puerto.modelo.interfaces.ICrudOperaciones;
import es.ies.puerto.utilidades.UtilidadesClass;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileCsv extends UtilidadesClass implements ICrudOperaciones {
    String path="src/main/resources/data.csv";

    public List<Personaje> obtenerPersonas() {
        List<Personaje> personajes = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(DELIMITADOR);
                int id = Integer.parseInt(datos[0]);
                String nombre = datos[1];
                int edad = Integer.parseInt(datos[2]);
                String email = datos[3];
                Personaje personaje = new Personaje(id, nombre, edad, email);
                personajes.add(personaje);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return personajes;

    }

    public Personaje obtenerPersona(Personaje personaje) {
        boolean encontrado = false;
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String linea;
            while (((linea = br.readLine()) != null) && !encontrado) {
                String[] datos = linea.split(DELIMITADOR);
                int id = Integer.parseInt(datos[0]);
                if (id == personaje.getId()) {
                    String nombre = datos[1];
                    int edad = Integer.parseInt(datos[2]);
                    String email = datos[3];
                    personaje.setNombre(nombre);
                    personaje.setEdad(edad);
                    personaje.setEmail(email);
                    encontrado = true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return personaje;
    }

    public void addPersona(Personaje personaje) {
        Personaje personajeBuscar = new Personaje(personaje.getId());
        personajeBuscar = obtenerPersona(personajeBuscar);
        if (personajeBuscar.getEmail() == null) {
            try (FileWriter writer = new FileWriter(path, true)) {
                writer.write(personaje.toCsv()+ "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void deletePersona(Personaje personaje) {
        Personaje personajeBuscar = new Personaje(personaje.getId());
        List<Personaje> personajes = obtenerPersonas();
        personajes.remove(personaje);
        try (FileWriter writer = new FileWriter(path)) {
            for (Personaje personajeFile : personajes) {
                writer.write(personajeFile.toCsv() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void updatePersona(Personaje personaje) {
        List<Personaje> personajes = obtenerPersonas();
        try (FileWriter writer = new FileWriter(path)) {
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
