package es.ies.puerto.mapper.classic;

import es.ies.puerto.dto.AliasDTO;
import es.ies.puerto.mapper.utilities.MappersUtilities;
import es.ies.puerto.modelo.db.entidades.Alias;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MapperAliasTest extends MappersUtilities {
    Alias aliasMapper;
    AliasDTO aliasDTOMapper;

    @Test
    public void aliasToAliasDTOTest() {
        aliasDTOMapper = MapperAlias.aliasToAliasDTO(aliasEntity);
        Assertions.assertEquals(aliasDTO.getId(), aliasDTOMapper.getId(), ERR_MSG);
        Assertions.assertEquals(aliasDTO.getDescripcion(), aliasDTOMapper.getDescripcion(), ERR_MSG);
        Assertions.assertEquals(aliasDTO.getPersonaje_id(), aliasDTOMapper.getPersonaje_id(), ERR_MSG);
    }

    @Test
    public void aliasDTOToAliasTest() {
        aliasMapper = MapperAlias.aliasDTOToAlias(aliasDTO);
        Assertions.assertEquals(aliasEntity.getId(), aliasMapper.getId(), ERR_MSG);
        Assertions.assertEquals(aliasEntity.getDescripcion(), aliasMapper.getDescripcion(), ERR_MSG);
        Assertions.assertEquals(aliasEntity.getPersonaje_id(), aliasMapper.getPersonaje_id(), ERR_MSG);
    }
}
