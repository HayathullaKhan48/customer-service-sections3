package com.customer.service.section3.service.impl;

import com.customer.service.section3.request.CustomerRequest;
import com.customer.service.section3.response.CustomerResponse;
import com.customer.service.section3.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;

@Service
public class CustomerSerivceImpl implements CustomerService {

    Collection<CustomerResponse> customers = new ArrayList<>();

    @Override
    public String createCustomer(CustomerRequest request) {
        customers.add(CustomerResponse.builder()
                .customerId(request.getCustomerId())
                .customerName(request.getCustomerName())
                .customerMobileNumber(request.getCustomerMobileNumber())
                .customerAddress(request.getCustomerAddress())
                .build());
        return "Customer successfully registered";
    }
}
