Customer service sections3 microservice implementation

## Endpoint
1. /api/Customer/create
2. /api/Customer/getData
3. /api/Customer/getById/{customerId}
4. /api/Customer/Update
5. /api/Customer/update/mobileNumber/{mobileNumber}
6. /api/Customer/deleteById/{customerId}

## Http mapping method
1. PostMapping
2. GetMapping 
3. UpdateMapping 
4. PatchMapping 
5. DeleteMapping

## Customer Management System API
    Spring Boot REST API for managing customer records with CURD operations

## API Endpoints
    All endpoints are prefixed with 'http://localhost:8080/api/customer'

## 1. Create Customer
- Method: POST
- URL : 'http://localhost:8080/api/customer/create'
- Request Body :
``
{
    "customerId": 1122,
    "customerName": "Hayathulla",
    "customerMobileNumber": "6304474604",
    "customerAddress": "3/63 chinnamandem 516214"
}
``
- Response Body: Customer successfully registered...

## 2. Get all customers
- Method: GET
- URL : 'http://localhost:8080/api/customer/getData'
- Request Body : null
- Response Body:
- ``
[
  {
  "customerId": 1022,
  "customerName": "Sufiyan",
  "customerAddress": "78h chinnamandem 516214",
  "customerMobileNumber": "1234567890"
  },
  {
  "customerId": 1001,
  "customerName": "Hayathulla",
  "customerAddress": "523L chinnamandem 516214",
  "customerMobileNumber": "098764321"
  },
  {
  "customerId": 1031,
  "customerName": "Arzoo",
  "customerAddress": "123Road chinnamandem 516214",
  "customerMobileNumber": "7890654321"
  }
]  
``

## 3. Get Customer by ID
- Method: GET
- URL: 'http://localhost:8080/api/customer/getById/1022'
- Request Body : null
- Response Body:
  ``{
    "customerId": 1022,
    "customerName": "Sufiyan",
    "customerAddress": "78h chinnamandem 516214",
    "customerMobileNumber": "9515421910"
    }
  ``
  
## 4. Update Customer(Full Update)
- Method: PUT
- URL: 'http://localhost:8080/api/customer/update'
- Request Body: 
- ``
{
  "customerId": 1002,
  "customerName": "abcd",
  "customerAddress": "123Road chinnamandem 516214",
  "customerMobileNumber": "1234567890"
}
``
- Response Body: Customer with ID 1002 was Updated successfully.

## 5. Delete Customer
- Method: DELETE
- URL: 'http://localhost:8080/api/customer/deleteById/1002'
- Request Body : null
- Response Body: Customer with ID 1002 deleted Successfully.

## 6.Update Mobile Number (Partial Update)
- Method : PATCH
- URL : 'http://localhost:8080/api/customer/update/mobileNumber/1003/1234560987'
- Request Body : null
- Response Body: Customer with ID 1003 mobile number updated successfully.



This documentation provides complete implementation details, API specifications, and Postman testing instructions foe the Customer management System.
The README includes importable Postman collection configuration for easy testing.