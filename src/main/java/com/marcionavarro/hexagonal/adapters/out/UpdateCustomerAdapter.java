package com.marcionavarro.hexagonal.adapters.out;

import com.marcionavarro.hexagonal.adapters.out.respository.CustomerRespository;
import com.marcionavarro.hexagonal.adapters.out.respository.mapper.CustomerEntityMapper;
import com.marcionavarro.hexagonal.application.core.domain.Customer;
import com.marcionavarro.hexagonal.application.ports.out.UpdateCustomerOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UpdateCustomerAdapter implements UpdateCustomerOutputPort {

    @Autowired
    private CustomerRespository customerRespository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public void update(Customer customer) {
        var customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRespository.save(customerEntity);
    }
}
