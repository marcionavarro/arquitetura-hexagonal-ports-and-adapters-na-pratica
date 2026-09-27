package com.marcionavarro.hexagonal.adapters.out;

import com.marcionavarro.hexagonal.adapters.out.repository.CustomerRepository;
import com.marcionavarro.hexagonal.adapters.out.repository.mapper.CustomerEntityMapper;
import com.marcionavarro.hexagonal.application.core.domain.Customer;
import com.marcionavarro.hexagonal.application.ports.out.InsertCustomerOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

@Component
public class InsertCustomerAdapter implements InsertCustomerOutputPort {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    private final MongoTemplate mongoTemplate;

    public InsertCustomerAdapter(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public void insert(Customer customer) {
        var customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity);
    }
}
