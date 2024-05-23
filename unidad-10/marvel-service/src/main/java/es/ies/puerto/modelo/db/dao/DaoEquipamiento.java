package es.ies.puerto.modelo.db.dao;

import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.modelo.db.dao.abstracts.Actualizar;
import es.ies.puerto.modelo.db.entidades.Equipamiento;
import es.ies.puerto.modelo.db.entidades.Personaje;
import es.ies.puerto.modelo.db.entidades.Poder;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

public class DaoEquipamiento extends Actualizar {


    public DaoEquipamiento() throws MarvelException {
        super();
    }

    private Set<Equipamiento> obtener(String query) throws MarvelException {
        Set<Equipamiento> equipamientos = new HashSet<>();
        Statement statement = null;
        ResultSet rs = null;
        try {
            statement = getConexion().createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()) {
                String equipId = rs.getString("id");
                String nombre = rs.getString("nombre");
                String descripcion = rs.getString("descripcion");
                String personajeId = rs.getString("personaje_id");
                Equipamiento equipamiento = new Equipamiento(equipId, nombre, descripcion, personajeId);
                equipamientos.add(equipamiento);
            }

        } catch (SQLException exception) {
            throw new MarvelException(exception.getMessage(), exception);
        } finally {
            try {
                if (rs != null && !rs.isClosed()) {
                    rs.close();
                }
                if (statement != null && !statement.isClosed()) {
                    statement.close();
                }
                if (!getConexion().isClosed()) {
                    getConexion().close();
                }
            } catch (SQLException exception) {
                throw new MarvelException(exception.getMessage(), exception);
            }
        }
        return equipamientos;
    }

    public Set<Equipamiento> findAllEquipamiento() throws MarvelException {
        String query = "SELECT eq.id, eq.nombre, eq.descripcion, eq.personaje_id " +
                "FROM Equipamiento AS eq";
        return obtener(query);
    }

    public Equipamiento findEquipamiento(String id) throws MarvelException {
        Equipamiento equipamiento = new Equipamiento(id);
        return findEquipamiento(equipamiento);
    }

    public Equipamiento findEquipamiento(Equipamiento equipamiento) throws MarvelException {
        String query = "SELECT eq.id, eq.nombre, eq.descripcion, eq.personaje_id " +
                "FROM Equipamiento AS eq " +
                "WHERE eq.id = '" + equipamiento.getId() + "'";
        Set<Equipamiento> equipamientos = obtener(query);
        if (equipamientos.isEmpty()) {
            return null;
        }
        return equipamientos.iterator().next();
    }

    public boolean updateEquipamiento(Equipamiento equipamiento) throws MarvelException {
        boolean encontrado = true;
        String query = "UPDATE Equipamiento " +
                "SET nombre = '"+ equipamiento.getNombre() +"', " +
                "descripcion = '"+ equipamiento.getDescripcion() +"' " +
                "WHERE id = '" + equipamiento.getId() + "';";

        if (findEquipamiento(equipamiento) == null) {
            encontrado = false;
            query = "INSERT INTO Equipamiento VALUES " +
                    "('" + equipamiento.getId() + "', " +
                    "'" + equipamiento.getNombre() + "', " +
                    "'" + equipamiento.getDescripcion() + "', " +
                    "'" + equipamiento.getPersonaje_id() + "');";
        }
        actualizar(query);
        return encontrado;
    }

    public boolean deleteEquipamiento(Equipamiento equipamiento) throws MarvelException {
        equipamiento = findEquipamiento(equipamiento);
        if (equipamiento == null) {
            return false;
        }
        String query = "DELETE FROM Equipamiento AS eq " +
                "WHERE eq.id = '" + equipamiento.getId() + "'; ";
        actualizar(query);
        return true;
    }


}
