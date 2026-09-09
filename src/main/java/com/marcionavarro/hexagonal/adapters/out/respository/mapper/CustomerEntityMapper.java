package com.marcionavarro.hexagonal.adapters.out.respository.mapper;

import com.marcionavarro.hexagonal.adapters.out.respository.entity.CustomerEntity;
import com.marcionavarro.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(Customer customer);

    Customer toCustomer(CustomerEntity customerEntity);
}
