package com.marcionavarro.hexagonal.adapters.out.respository;

import com.marcionavarro.hexagonal.adapters.out.respository.entity.CustomerEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRespository extends MongoRepository<CustomerEntity, String> {
}
