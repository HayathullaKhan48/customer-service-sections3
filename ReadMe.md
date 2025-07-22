Customer service sections3 microservice implementation

## Endpoint
1. /api/Customer/create
2. /api/Customer/getData
3. /api/Customer/getById/{customerId}
4. /api/Customer/Update
5. /api/Customer/update/mobileNumber/{mobileNumber}
6. /api/Customer/deleteById/{customerId}

## http mapping method
1. PostMapping
2. GetMapping
3. GetMapping
4. UpdateMapping
5. PatchMapping
6. DeleteMapping

## Customer Management System API
    Spring Boot REST API for managing customer records with CURD operations

## API Endpoints
    All endpoints are prefixed with 'http://localhost:8080/api/customer'

## 1. Create Customer
- Method : POST
- Path : /create
- Request Body :
``
{
    "customerId": 1122,
    "customerName": "Hayathulla",
    "customerMobileNumber": "6304474604",
    "customerAddress": "3/63 chinnamandem 516214"
}
``

## 2. Get all customers
- Method : GET
- Path : '/getData'
- Request Body :
``
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
- method : GET
- Path : '/getById/{customerId}'
- Request Body :
  - Example : 1022 is a customerId
  ``{
    "customerId": 1022,
    "customerName": "Sufiyan",
    "customerAddress": "78h chinnamandem 516214",
    "customerMobileNumber": "9515421910"
    }
  ``
  
## 4. Update Customer(Full Update)
- Method : PUT
- Path : '/update'
- Request Body : Same as create with Updated values

## 5. Update Mobile Number (Partial Update)
- Method : PATCH
- Path : '/update/mobileNumber/{customerId}/{mobileNumber}'

## 6. Delete Customer
- Method: DELETE
- Path: '/deleteById/{customerId}'

This documentation provides complete implementation details, API specifications, and Postman testing instructions foe the Customer management System.
The README includes importable Postman collection configuration for easy testing.