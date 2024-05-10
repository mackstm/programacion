package es.ies.puerto.mapper.struct;

import es.ies.puerto.dto.CustomerDTO;
import es.ies.puerto.model.entity.Address;
import es.ies.puerto.model.entity.Customer;
import org.mapstruct.Context;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

@Mapper(uses = IMapperAddress.class)
public interface IMapperCustomer {
    IMapperCustomer INSTANCE = Mappers.getMapper(IMapperCustomer.class);

    Customer customerDtoToCustomerEntity(CustomerDTO customerDTO);

    @Mapping(target = "address", source = "address")
    @Mapping(target = "id", source = "customer.id")
    @Mapping(target = "fullName", source = "customer", qualifiedByName = "transformName")
    CustomerDTO customerEntityToCustomerDto(@Context Customer customer, Address address);

    @Named("transformName")
    public static String makeName(Customer customer) {
        return customer.getFirstname() + " " + customer.getLastname();
    }
}
