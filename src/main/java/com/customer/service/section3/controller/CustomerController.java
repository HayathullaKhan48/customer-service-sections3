package com.customer.service.section3.controller;

import com.customer.service.section3.request.CustomerRequest;
import com.customer.service.section3.response.CustomerResponse;
import com.customer.service.section3.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

/**
 * Rest controller for managing customer operations.
 * This controller provides endpoint to create, retrieve, update and delete customer records.
 */
@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/create")
    ResponseEntity<String> createCustomer(@RequestBody CustomerRequest request){
        String result = customerService.createCustomer(request);
        return ResponseEntity.ok(result);
    }
}

