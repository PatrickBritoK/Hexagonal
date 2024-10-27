package com.architecture.hexagonal.application.ports.out;

import com.architecture.hexagonal.application.core.domain.Customer;

public interface UpdateCustomerOutputPort {

    void update(Customer customer);

}
