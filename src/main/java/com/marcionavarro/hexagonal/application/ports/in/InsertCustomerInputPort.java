package com.marcionavarro.hexagonal.application.ports.in;

import com.marcionavarro.hexagonal.application.core.domain.Customer;

public interface InsertCustomerInputPort {

    Void insert(Customer customer, String zipCode);

}
