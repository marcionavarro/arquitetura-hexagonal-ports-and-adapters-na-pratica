package com.marcionavarro.hexagonal.adapters.out.client.mapper;

import com.marcionavarro.hexagonal.adapters.out.client.response.AddressResponse;
import com.marcionavarro.hexagonal.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);
}
