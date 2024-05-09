package es.ies.puerto.mapper.utilities;

import es.ies.puerto.dto.AddressDTO;
import es.ies.puerto.model.entity.Address;
import org.junit.jupiter.api.BeforeEach;

public class MappersUtilities {
    public static final String ERR_MSG = "Unexpected result";
    public static final String MY_ADDRESS = "Mi direccion";
    public static final String MY_COUNTRY = "Mi pais";
    public static final long MY_ID = 1L;
    public static final String MY_ZIPCODE = "38370";

    public static final String PROVINCE_ISLAND = "San Borondon";
    public Address addressEntity;
    public AddressDTO addressDTO;


    @BeforeEach
    public void beforeEach() {
        addressDTO = new AddressDTO();
        addressDTO.setAddress(MY_ADDRESS);
        addressDTO.setCountry(MY_COUNTRY);
        addressDTO.setId(MY_ID);
        addressDTO.setZipCode(MY_ZIPCODE);
        addressDTO.setProvince(PROVINCE_ISLAND);
        addressEntity = new Address();
        addressEntity.setAddress(MY_ADDRESS);
        addressEntity.setCountry(MY_COUNTRY);
        addressEntity.setId(MY_ID);
        addressEntity.setZipCode(MY_ZIPCODE);
        addressEntity.setIsland(PROVINCE_ISLAND);
    }
}
