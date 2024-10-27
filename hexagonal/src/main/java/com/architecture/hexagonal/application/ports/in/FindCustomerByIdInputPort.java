package com.architecture.hexagonal.application.ports.in;

import com.architecture.hexagonal.application.core.domain.Customer;

public interface FindCustomerByIdInputPort {

    Customer find(String id);
}
