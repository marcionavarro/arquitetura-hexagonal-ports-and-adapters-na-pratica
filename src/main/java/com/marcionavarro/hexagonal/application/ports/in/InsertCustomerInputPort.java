package com.marcionavarro.hexagonal.application.ports.in;

import com.marcionavarro.hexagonal.application.core.domain.Customer;

public interface InsertCustomerInputPort {

    void insert(Customer customer, String zipCode);

}
