package es.ies.puerto.mapper.classic;


import es.ies.puerto.dto.EquipamientoDTO;
import es.ies.puerto.mapper.utilities.MappersUtilities;

import es.ies.puerto.modelo.db.entidades.Equipamiento;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MapperEquipamientoTest extends MappersUtilities {
    Equipamiento equipamientoMapper;
    EquipamientoDTO equipamientoDTOMapper;

    @Test
    public void equipamientoToEquipamientoDTOTest() {
        equipamientoDTOMapper = MapperEquipamiento.equipamientoToEquipamientoDTO(equipamientoEntity);
        Assertions.assertEquals(equipamientoDTO.getId(), equipamientoDTOMapper.getId(), ERR_MSG);
        Assertions.assertEquals(equipamientoDTO.getNombre(), equipamientoDTOMapper.getNombre(), ERR_MSG);
        Assertions.assertEquals(equipamientoDTO.getDescripcion(), equipamientoDTOMapper.getDescripcion(), ERR_MSG);
        Assertions.assertEquals(equipamientoDTO.getPersonaje_id(), equipamientoDTOMapper.getPersonaje_id(), ERR_MSG);
    }

    @Test
    public void equipamientoDTOToEquipamientoTest() {
        equipamientoMapper = MapperEquipamiento.equipamientoDTOToEquipamiento(equipamientoDTO);
        Assertions.assertEquals(equipamientoEntity.getId(), equipamientoMapper.getId(), ERR_MSG);
        Assertions.assertEquals(equipamientoEntity.getNombre(), equipamientoMapper.getNombre(), ERR_MSG);
        Assertions.assertEquals(equipamientoEntity.getDescripcion(), equipamientoMapper.getDescripcion(), ERR_MSG);
        Assertions.assertEquals(equipamientoEntity.getPersonaje_id(), equipamientoMapper.getPersonaje_id(), ERR_MSG);
    }
}
