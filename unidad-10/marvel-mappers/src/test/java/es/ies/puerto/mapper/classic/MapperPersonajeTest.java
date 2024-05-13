package es.ies.puerto.mapper.classic;

import es.ies.puerto.dto.PersonajeDTO;
import es.ies.puerto.mapper.utilities.MappersUtilities;
import es.ies.puerto.modelo.db.entidades.Personaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MapperPersonajeTest extends MappersUtilities {
    Personaje personajeMapper;
    PersonajeDTO personajeDTOMapper;

    @Test
    public void personajeToPersonajeDTO() {
        personajeDTOMapper = MapperPersonaje.personajeToPersonajeDTO(personajeEntity);
        Assertions.assertEquals(personajeDTO.getId(), personajeDTOMapper.getId(), ERR_MSG);
        Assertions.assertEquals(personajeDTO.getNombre(), personajeDTOMapper.getNombre(), ERR_MSG);
        Assertions.assertEquals(personajeDTO.getGenero(), personajeDTOMapper.getGenero(), ERR_MSG);
        Assertions.assertEquals(personajeDTO.getAlias(), personajeDTOMapper.getAlias(), ERR_MSG);
        Assertions.assertEquals(personajeDTO.getEquipamientos(), personajeDTOMapper.getEquipamientos(), ERR_MSG);
        Assertions.assertEquals(personajeDTO.getPoderes(), personajeDTOMapper.getPoderes(), ERR_MSG);
    }

    @Test
    public void personajeDTOToPersonaje() {
        personajeMapper = MapperPersonaje.personajeDTOToPersonaje(personajeDTO);
        Assertions.assertEquals(personajeEntity.getId(), personajeMapper.getId(), ERR_MSG);
        Assertions.assertEquals(personajeEntity.getNombre(), personajeMapper.getNombre(), ERR_MSG);
        Assertions.assertEquals(personajeEntity.getGenero(), personajeMapper.getGenero(), ERR_MSG);
        Assertions.assertEquals(personajeEntity.getAlias(), personajeMapper.getAlias(), ERR_MSG);
        Assertions.assertEquals(personajeEntity.getEquipamientos(), personajeMapper.getEquipamientos(), ERR_MSG);
        Assertions.assertEquals(personajeEntity.getPoderes(), personajeMapper.getPoderes(), ERR_MSG);
    }
}
