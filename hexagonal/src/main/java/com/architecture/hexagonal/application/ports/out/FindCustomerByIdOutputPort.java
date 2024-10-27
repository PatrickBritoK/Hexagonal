package com.architecture.hexagonal.application.ports.out;

import com.architecture.hexagonal.application.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerByIdOutputPort {

    Optional<Customer> find(String id);
}
