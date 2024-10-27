package com.architecture.hexagonal.application.ports.in;

import com.architecture.hexagonal.application.core.domain.Customer;

public interface UpdateCustomerInputPort {

    void update(Customer customer, String zipCode);

}
