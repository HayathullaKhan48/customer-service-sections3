package com.customer.service.section3.service.impl;

import com.customer.service.section3.request.CustomerRequest;
import com.customer.service.section3.response.CustomerResponse;
import com.customer.service.section3.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

/**
 * Implementation of CustomerService interface
 * Manages in a memory collection of customer records
 * Handles all business logic for customer operations
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    //In memory data store for customer records
    Collection<CustomerResponse> customers = new ArrayList<>();

    /**
     * Creates a new customer record and adds it to the in-memory collection.
     *
     * @param request The CustomerRequest object containing the details of the customer to be created.
     * @return A success message indicating that the customer has been registered.
     */
    @Override
    public String createCustomer(CustomerRequest request) {
        customers.add(CustomerResponse.builder()
                .customerId(request.getCustomerId())
                .customerName(request.getCustomerName())
                .customerMobileNumber(request.getCustomerMobileNumber())
                .customerAddress(request.getCustomerAddress())
                .build());
        return "Customer successfully registered...";
    }

    /**
     * Retrieves all registered customers from the in-memory collection.
     *
     * @return A collection of CustomerResponse objects representing all customers.
     */
    @Override
    public Collection<CustomerResponse> getCustomers(){
        return customers;
    }

    /**
     * Retrieves a specific customer by their ID.
     *
     * @param customerId The ID of the customer to retrieve.
     * @return The CustomerResponse object for the requested customer.
     * @throws RuntimeException if the customer with the specified ID is not found.
     */
    @Override
    public CustomerResponse getCustomerById(int customerId){
        return customers.stream()
                .filter(customer -> customer.getCustomerId() == customerId)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Customer with ID " + customerId + " not found."));
    }

    /**
     * Deletes a customer record by their ID.
     *
     * @param customerId The ID of the customer to delete.
     * @return A message indicating whether the deletion was successful or if the customer was not found.
     */
    @Override
    public String deleteCustomer(int customerId){
        boolean removed = customers.removeIf(customer -> customer.getCustomerId() == customerId);
        return removed
                ? "Customer with ID " + customerId + " deleted Successfully."
                : "Customer with ID " + customerId + "not found.";
    }

    /**
     * Updates an existing customer's details.
     *
     * @param request The CustomerRequest object containing updated customer information.
     * @return A message indicating the result of the update operation.
     */
    @Override
    public String updateCustomer(CustomerRequest request){
        for (CustomerResponse customer : customers){
            if (customer.getCustomerId() == request.getCustomerId()){
                customer.setCustomerName(request.getCustomerName());
                customer.setCustomerAddress(request.getCustomerAddress());
                customer.setCustomerMobileNumber(request.getCustomerMobileNumber());
                return "Customer with ID " + request.getCustomerId() + " was Updated successfully.";
            }
        }
        return "Customer with ID " + request.getCustomerId() +" not found.";
    }

    /**
     * Partially updates the mobile number of a customer by their ID.
     *
     * @param customerId The ID of the customer to update.
     * @param mobileNumber The new mobile number to set for the customer.
     * @return A message indicating whether the update was successful or if the customer was not found.
     */
    @Override
    public String updateCustomerMobileNumber(int customerId, String mobileNumber){
        Optional<CustomerResponse> customerData = customers.stream()
                .filter(customerResponse -> customerResponse.getCustomerId() == customerId)
                .findFirst();
        if (customerData.isPresent()){
            CustomerResponse customerResponse = customerData.get();
            customerResponse.setCustomerMobileNumber(mobileNumber);
            return "Customer with ID " + customerId + " mobile number updated successfully.";
        }
        return "Customer with ID "+ customerId + " not found.";
    }

}
