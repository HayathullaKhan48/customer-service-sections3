package com.customer.service.section3.controller;

import com.customer.service.section3.request.CustomerRequest;
import com.customer.service.section3.response.CustomerResponse;
import com.customer.service.section3.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 *
 * REST API Controller for Customer Management System
 * Provides endpoints for all customer-related operations including:
 * Customer registration
 * Customer information retrieval (single/all records)
 * Customer information modification
 * Customer record deletion
 * All endpoints are prefixed with '/api/customer'
 * Uses CustomerService for business logic implementation
 */
@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    private final CustomerService customerService;

    /**
     * Constructor for dependency injection of CustomerService
     * @param customerService The service layer implementation for customer operations
     */
    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    /**
     * Create a new customer record
     * @param request CustomerRequest Containing customer details
     * @return ResponseEntity with success message
     */
    @PostMapping("/create")
    ResponseEntity<String> createCustomer(@RequestBody CustomerRequest request){
        String result = customerService.createCustomer(request);
        return ResponseEntity.ok(result);
    }

    /**
     * Retrieves all registered customers
     * @return Collection of CustomerResponse objects
     */
    @GetMapping("/getData")
    public Collection<CustomerResponse> getCustomer(){
        return customerService.getCustomers();
    }

    /**
     * Retrieves specific customer by ID
     * @param customerId ID of customer to retrieve
     * @return CustomerResponse for requested customer
     * @throws RuntimeException if customer not found
     */
    @GetMapping("/getById/{customerId}")
    public CustomerResponse getCustomerById(@PathVariable int customerId){
        return customerService.getCustomerById(customerId);
    }

    /**
     * Deletes customer record by ID
     * @param customerId ID of customer to delete
     * @return Success/error message
     */
    @DeleteMapping("/deleteById/{customerId}")
    public String deleteCustomer(@PathVariable int customerId){
        return customerService.deleteCustomer(customerId);
    }

    /**
     * Updates complete customer record
     * @param request CustomerRequest with updated details
     * @return Success/error message
     */
    @PutMapping("/update")
    public String updateCustomer(@RequestBody CustomerRequest request){
        return customerService.updateCustomer(request);
    }

    /**
     * Partially updates customer's mobile number
     * @param customerId ID of customer to update
     * @param mobileNumber New mobile number
     * @return Success/error message
     */
    @PatchMapping("/update/mobileNumber/{CustomerId}/{mobileNumber}")
    public String patchCustomer(@PathVariable int customerId, @PathVariable String mobileNumber){
        return customerService.patchCustomer(customerId,mobileNumber);
    }
}

