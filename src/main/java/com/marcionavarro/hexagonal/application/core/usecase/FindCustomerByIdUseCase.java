package com.marcionavarro.hexagonal.application.core.usecase;

import com.marcionavarro.hexagonal.application.core.domain.Customer;
import com.marcionavarro.hexagonal.application.ports.in.FindCustomerByIdInputPort;
import com.marcionavarro.hexagonal.application.ports.out.FindCustomerByIdOutputPort;

public class FindCustomerByIdUseCase implements FindCustomerByIdInputPort {

    private FindCustomerByIdOutputPort findCustomerByIdOutputPort;

    public FindCustomerByIdUseCase(FindCustomerByIdOutputPort findCustomerByIdOutputPort) {
        this.findCustomerByIdOutputPort = findCustomerByIdOutputPort;
    }

    @Override
    public Customer find(String id) {
        return findCustomerByIdOutputPort.find(id)
            .orElseThrow(() -> new RuntimeException("Customer not found"));
    }

}
