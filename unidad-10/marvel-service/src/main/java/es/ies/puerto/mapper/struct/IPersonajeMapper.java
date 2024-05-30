package es.ies.puerto.mapper.struct;

import es.ies.puerto.dto.PersonajeDTO;
import es.ies.puerto.modelo.db.entidades.Personaje;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface IPersonajeMapper {
    IPersonajeMapper INSTANCE = Mappers.getMapper(IPersonajeMapper.class);

    @Mapping(target = "alias", source = "alias")
    Personaje personajeDTOtoPersonajeEntity(PersonajeDTO personajeDTO);
    PersonajeDTO personajeEntityToPersonajeDTO(Personaje personaje);
}
