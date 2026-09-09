package com.marcionavarro.hexagonal.config;

import com.marcionavarro.hexagonal.adapters.out.FindCustomerByIdAdapter;
import com.marcionavarro.hexagonal.application.core.usecase.FindCustomerByIdUseCase;
import com.marcionavarro.hexagonal.application.ports.out.FindCustomerByIdOutputPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindCustomerByIdConfig {

    @Bean
    public FindCustomerByIdUseCase findCustomerByIdUseCase(FindCustomerByIdAdapter findCustomerByIdAdapter) {
        return new FindCustomerByIdUseCase(findCustomerByIdAdapter);
    }

}
