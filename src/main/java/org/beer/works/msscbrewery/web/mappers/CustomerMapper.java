package org.beer.works.msscbrewery.web.mappers;

import org.beer.works.msscbrewery.domain.Customer;
import org.beer.works.msscbrewery.web.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    CustomerDto customertoCustomerDto(Customer customer);

    Customer customerDtoToCustomer(CustomerDto customerDto);
}
