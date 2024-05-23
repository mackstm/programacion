package es.ies.puerto.services;


import es.ies.puerto.dto.AliasDTO;
import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.mapper.classic.MapperAlias;
import es.ies.puerto.modelo.db.dao.DaoAlias;
import es.ies.puerto.modelo.db.entidades.Alias;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Path("/alias")
@Consumes("application/json")
@Produces("application/json")
public class AliasService {
    private DaoAlias daoAlias;

    public AliasService() throws MarvelException {
        daoAlias = new DaoAlias();
    }

    public void setDaoAlias(DaoAlias daoAlias) {
        this.daoAlias = daoAlias;
    }

    @GET
    @Path("/alias/{id}")
    public Response getAliasById(@PathParam("id") String id) throws MarvelException {
        AliasDTO aliasDTO = MapperAlias.aliasToAliasDTO(daoAlias.findAlias(id));
        if (aliasDTO != null) {
            return Response.ok(aliasDTO).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @GET
    @Path("/alias")
    public Response getAliases() throws MarvelException {
        Set<Alias> aliases = daoAlias.findAllAlias();
        List<AliasDTO> aliasDTOList = new ArrayList<>();
        for (Alias alias : aliases) {
            aliasDTOList.add(MapperAlias.aliasToAliasDTO(alias));
        }
        return Response.ok(aliasDTOList).build();
    }

    @POST
    public Response updateAlias(AliasDTO aliasDTO) throws MarvelException {
        boolean result = daoAlias.updateAlias(MapperAlias.aliasDTOToAlias(aliasDTO));
        if (result) {
            return Response.status(Response.Status.OK).build();
        }
        return Response.status(Response.Status.CREATED).build();
    }

    @DELETE
    @Path("/alias/{id}")
    public Response deleteAliasById(@PathParam("id") String id) throws MarvelException{
        AliasDTO aliasDTO = new AliasDTO(id);
        boolean deleted = daoAlias.deleteAlias(MapperAlias.aliasDTOToAlias(aliasDTO));
        if (deleted) {
            return Response.status(Response.Status.NO_CONTENT).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }
}
