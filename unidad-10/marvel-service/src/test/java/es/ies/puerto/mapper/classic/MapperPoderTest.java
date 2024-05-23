package es.ies.puerto.mapper.classic;

import es.ies.puerto.dto.PoderDTO;
import es.ies.puerto.mapper.utilities.MappersUtilities;
import es.ies.puerto.modelo.db.entidades.Poder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MapperPoderTest extends MappersUtilities {
    Poder poderMapper;
    PoderDTO poderDTOMapper;

    @Test
    public void poderToPoderDTOTest() {
        poderDTOMapper = MapperPoder.poderToPoderDTO(poderEntity);
        Assertions.assertEquals(poderDTO.getId(), poderDTOMapper.getId(), ERR_MSG);
        Assertions.assertEquals(poderDTO.getNombre(), poderDTOMapper.getNombre(), ERR_MSG);
    }

    @Test
    public void poderDTOToPoderTest() {
        poderMapper = MapperPoder.poderDTOToPoder(poderDTO);
        Assertions.assertEquals(poderEntity.getId(), poderMapper.getId(), ERR_MSG);
        Assertions.assertEquals(poderEntity.getNombre(), poderMapper.getNombre(), ERR_MSG);
    }
}
