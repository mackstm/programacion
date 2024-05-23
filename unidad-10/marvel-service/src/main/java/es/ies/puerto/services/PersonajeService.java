package es.ies.puerto.services;

import es.ies.puerto.dto.PersonajeDTO;
import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.mapper.classic.MapperPersonaje;
import es.ies.puerto.modelo.db.dao.DaoPersonaje;
import es.ies.puerto.modelo.db.entidades.Personaje;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Path("/personajes")
@Consumes("application/json")
@Produces("application/json")
public class PersonajeService {
    private DaoPersonaje daoPersonaje;

    public PersonajeService() throws MarvelException {
        daoPersonaje = new DaoPersonaje();
    }

    public void setDaoPersonaje(DaoPersonaje daoPersonaje) {
        this.daoPersonaje = daoPersonaje;
    }

    @GET
    @Path("/{id}")
    public Response getPersonajeById(@PathParam("id") String id) throws MarvelException {
        PersonajeDTO personajeDTO = MapperPersonaje.personajeToPersonajeDTO(daoPersonaje.findPersonaje(id));
        if (personajeDTO != null) {
            return Response.ok(personajeDTO).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @GET
    @Path("/")
    public Response getPersonajes() throws MarvelException {
        Set<Personaje> personajes = daoPersonaje.findAllPersonaje();
        List<PersonajeDTO> personajeDTOList = new ArrayList<>();
        for (Personaje personaje : personajes) {
            personajeDTOList.add(MapperPersonaje.personajeToPersonajeDTO(personaje));
        }
        return Response.ok(personajeDTOList).build();
    }

    @POST
    public Response updatePersonaje(PersonajeDTO personajeDTO) throws MarvelException {
        boolean result = daoPersonaje.updatePersonaje(MapperPersonaje.personajeDTOToPersonaje(personajeDTO));
        if (result) {
            return Response.status(Response.Status.OK).build();
        }
        return Response.status(Response.Status.CREATED).build();
    }

    @DELETE
    @Path("/{id}")
    public Response deletePersonajeById(@PathParam("id") String id) throws MarvelException{
    PersonajeDTO personajeDTO = new PersonajeDTO(id);
    boolean deleted = daoPersonaje.deletePersonaje(MapperPersonaje.personajeDTOToPersonaje(personajeDTO));
        if (deleted) {
            return Response.status(Response.Status.NO_CONTENT).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }
}
