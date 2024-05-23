package es.ies.puerto.services;

import es.ies.puerto.dto.EquipamientoDTO;
import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.mapper.classic.MapperEquipamiento;
import es.ies.puerto.modelo.db.dao.DaoEquipamiento;
import es.ies.puerto.modelo.db.entidades.Equipamiento;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Path("/equipamientos")
@Consumes("application/json")
@Produces("application/json")
public class EquipamientoService {
    private DaoEquipamiento daoEquipamiento;

    public EquipamientoService() throws MarvelException {
        daoEquipamiento = new DaoEquipamiento();
    }

    public void setDaoEquipamiento(DaoEquipamiento daoEquipamiento) {
        this.daoEquipamiento = daoEquipamiento;
    }

    @GET
    @Path("/equipamientos/{id}")
    public Response getEquipamientoById(@PathParam("id") String id) throws MarvelException {
        EquipamientoDTO equipamientoDTO =
                MapperEquipamiento.equipamientoToEquipamientoDTO(daoEquipamiento.findEquipamiento(id));
        if (equipamientoDTO != null) {
            return Response.ok(equipamientoDTO).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @GET
    @Path("/equipamientos")
    public Response getEquipamientos() throws MarvelException {
        Set<Equipamiento> equipamientos = daoEquipamiento.findAllEquipamiento();
        List<EquipamientoDTO> equipamientoDtoList = new ArrayList<>();
        for (Equipamiento equipamiento : equipamientos) {
            equipamientoDtoList.add(MapperEquipamiento.equipamientoToEquipamientoDTO(equipamiento));
        }
        return Response.ok(equipamientoDtoList).build();
    }

    @POST
    public Response updateEquipamiento(EquipamientoDTO equipamientoDTO) throws MarvelException {
        boolean result =
                daoEquipamiento.updateEquipamiento(MapperEquipamiento.equipamientoDTOToEquipamiento(equipamientoDTO));
        if (result) {
            return Response.status(Response.Status.OK).build();
        }
        return Response.status(Response.Status.CREATED).build();
    }

    @DELETE
    @Path("/equipamientos/{id}")
    public Response deleteEquipamientoById(@PathParam("id") String id) throws MarvelException{
        EquipamientoDTO equipamientoDTO = new EquipamientoDTO(id);
        boolean deleted =
                daoEquipamiento.deleteEquipamiento(MapperEquipamiento.equipamientoDTOToEquipamiento(equipamientoDTO));
        if (deleted) {
            return Response.status(Response.Status.NO_CONTENT).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }
}
