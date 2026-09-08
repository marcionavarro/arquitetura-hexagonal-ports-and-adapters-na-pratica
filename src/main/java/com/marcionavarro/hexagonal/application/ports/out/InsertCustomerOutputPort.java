package com.marcionavarro.hexagonal.application.ports.out;

import com.marcionavarro.hexagonal.application.core.domain.Customer;

public interface InsertCustomerOutputPort {
    void insert(Customer customer);
}
