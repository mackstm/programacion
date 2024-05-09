package es.ies.puerto.mapper.struct;

import es.ies.puerto.dto.AddressDTO;
import es.ies.puerto.mapper.classic.MapperAddress;
import es.ies.puerto.mapper.utilities.MappersUtilities;
import es.ies.puerto.model.entity.Address;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MapperAddressTest extends MappersUtilities {

    AddressDTO addressDTOMapper;
    Address addressEntityMapper;

    @Test
    public void addressToAddressDTOTest() {
        addressDTOMapper = IMapperAddress.INSTANCE.addressToAddressDTO(addressEntity);
        Assertions.assertEquals(addressDTO.getId(), addressDTOMapper.getId(), ERR_MSG);
        Assertions.assertEquals(addressDTO.getAddress(), addressDTOMapper.getAddress(), ERR_MSG);
        Assertions.assertEquals(addressDTO.getCountry(), addressDTOMapper.getCountry(), ERR_MSG);
        Assertions.assertEquals(addressDTO.getZipCode(), addressDTOMapper.getZipCode(), ERR_MSG);
    }

    @Test
    public void addressDTOToAddressTest() {
        addressEntityMapper = IMapperAddress.INSTANCE.addressDTOToAddress(addressDTO);
        Assertions.assertEquals(addressEntity.getId(), addressEntityMapper.getId(), ERR_MSG);
        Assertions.assertEquals(addressEntity.getAddress(), addressEntityMapper.getAddress(), ERR_MSG);
        Assertions.assertEquals(addressEntity.getCountry(), addressEntityMapper.getCountry(), ERR_MSG);
        Assertions.assertEquals(addressEntity.getZipCode(), addressEntityMapper.getZipCode(), ERR_MSG);
    }
}
