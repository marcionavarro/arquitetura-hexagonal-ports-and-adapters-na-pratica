package com.marcionavarro.hexagonal.adapters.out;

import com.marcionavarro.hexagonal.adapters.out.respository.CustomerRespository;
import com.marcionavarro.hexagonal.application.ports.out.DeleteCustomerByIdOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeleteCustomerByIdAdapter implements DeleteCustomerByIdOutputPort {

    @Autowired
    private CustomerRespository customerRespository;

    @Override
    public void delete(String id) {
        customerRespository.deleteById(id);
    }
}
