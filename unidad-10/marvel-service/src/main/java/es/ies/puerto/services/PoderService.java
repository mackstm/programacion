package es.ies.puerto.services;


import es.ies.puerto.dto.PoderDTO;
import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.mapper.classic.MapperPoder;
import es.ies.puerto.modelo.db.dao.DaoPoder;
import es.ies.puerto.modelo.db.entidades.Poder;


import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Path("/poderes")
@Consumes("application/json")
@Produces("application/json")
public class PoderService {
    private DaoPoder daoPoder;

    public PoderService() throws MarvelException {
        daoPoder = new DaoPoder();
    }

    public void setDaoPoder(DaoPoder daoPoder) {
        this.daoPoder = daoPoder;
    }

    @GET
    @Path("/poderes/{id}")
    public Response getPoderById(@PathParam("id") String id) throws MarvelException {
        PoderDTO poderDTO = MapperPoder.poderToPoderDTO(daoPoder.findPoder(id));
        if (poderDTO != null) {
            return Response.ok(poderDTO).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @GET
    @Path("/poderes")
    public Response getPoderes() throws MarvelException {
        Set<Poder> poderes = daoPoder.findAllPoder();
        List<PoderDTO> poderDTOList = new ArrayList<>();
        for (Poder poder : poderes) {
            poderDTOList.add(MapperPoder.poderToPoderDTO(poder));
        }
        return Response.ok(poderDTOList).build();
    }

    @POST
    public Response updatePoder(PoderDTO poderDTO) throws MarvelException {
        boolean result = daoPoder.updatePoder(MapperPoder.poderDTOToPoder(poderDTO));
        if (result) {
            return Response.status(Response.Status.OK).build();
        }
        return Response.status(Response.Status.CREATED).build();
    }

    @DELETE
    @Path("/poderes/{id}")
    public Response deletePoderById(@PathParam("id") String id) throws MarvelException{
        PoderDTO poderDTO = new PoderDTO(id);
        boolean deleted = daoPoder.deletePoder(MapperPoder.poderDTOToPoder(poderDTO));
        if (deleted) {
            return Response.status(Response.Status.NO_CONTENT).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }
}
