package com.marcionavarro.hexagonal.adapters.out;

import com.marcionavarro.hexagonal.adapters.out.respository.CustomerRespository;
import com.marcionavarro.hexagonal.adapters.out.respository.mapper.CustomerEntityMapper;
import com.marcionavarro.hexagonal.application.core.domain.Customer;
import com.marcionavarro.hexagonal.application.ports.out.FindCustomerByIdOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class FindCustomerByIdAdapter implements FindCustomerByIdOutputPort {

    @Autowired
    private CustomerRespository customerRespository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public Optional<Customer> find(String id) {
        var customerEntity = customerRespository.findById(id);
        return customerEntity.map(entity -> customerEntityMapper.toCustomer(entity));
    }
}
