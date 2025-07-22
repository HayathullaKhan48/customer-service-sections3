package com.customer.service.section3.request;

import lombok.Getter;
import lombok.Setter;

/**
 * Data Transfer object for customer related requests.
 * contains fields representing customer information that can be sent to the API.
 */
@Getter
@Setter
public class CustomerRequest {
    private int customerId;
    private String customerName;
    private String customerAddress;
    private String customerMobileNumber;

}
