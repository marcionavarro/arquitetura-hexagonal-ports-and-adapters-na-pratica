package com.marcionavarro.hexagonal.application.ports.in;

import com.marcionavarro.hexagonal.application.core.domain.Customer;

public interface UpdateCustomerInputPort {

    void update(Customer customer, String zipCode);

}
