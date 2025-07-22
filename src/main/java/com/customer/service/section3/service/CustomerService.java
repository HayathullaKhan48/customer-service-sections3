package com.customer.service.section3.service;

import com.customer.service.section3.request.CustomerRequest;
import com.customer.service.section3.response.CustomerResponse;

import java.util.Collection;

/**
 * Service interface for Customer Management operations
 * Defines contract for all customer-related business logic
 */
public interface CustomerService {

   /**
    * Register new customer
    * @param request Customer details
    * @return Operation status message
    */
   String createCustomer(CustomerRequest request);

   /**
    * Fetch all customer
    * @return Collection of all customers
    */
   Collection<CustomerResponse> getCustomers();

   /**
    * Find customer by ID
    * @param customerId ID to search
    * @return Customer details
    * @throws RuntimeException if customer not found
    */
   CustomerResponse getCustomerById(int customerId);

   /**
    * Remove customer record
    * @param customerId ID of customer to delete
    * @return Operation status message
    */
   String deleteCustomer(int customerId);

   /**
    * update all customer details
    * @param request Updated customer data
    * @return Operation status message
    */
   String updateCustomer(CustomerRequest request);

   /**
    * Update only customer mobile number
    * @param customerId ID of customer to update
    * @param mobileNumber New mobile number
    * @return Operation status message
    */
   String updateCustomerMobileNumber(int customerId, String mobileNumber);

}
