package es.ies.puerto.mapper.struct;

import es.ies.puerto.dto.CustomerDTO;
import es.ies.puerto.model.entity.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface IMapperCustomer {
    IMapperCustomer INSTANCE = Mappers.getMapper(IMapperCustomer.class);

    Customer customerDtoToCustomerEntity(CustomerDTO customerDTO);
    CustomerDTO customerEntityToCustomerDto(Customer customer);
}
