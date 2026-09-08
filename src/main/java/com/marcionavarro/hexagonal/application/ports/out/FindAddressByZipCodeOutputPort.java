package com.marcionavarro.hexagonal.application.ports.out;

import com.marcionavarro.hexagonal.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {

    Address find(String zipCode);
}
