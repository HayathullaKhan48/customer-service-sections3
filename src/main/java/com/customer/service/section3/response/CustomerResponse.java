package com.customer.service.section3.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * Response Data Transfer object customer information returned by the API.
 * Contains the details of a customer that will be sent in API responses.
 * uses Lombok annotations for automatic generation of getters, setters and builder pattern.
 */
@Getter
@Setter
@Builder
public class CustomerResponse {
   private int customerId;
   private String customerName;
   private String customerAddress;
   private String customerMobileNumber;
}
