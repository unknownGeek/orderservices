package com.springboot.orderservices.lookup;


import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RequestMapping("/order-services/v1")
public interface LookupService {

    /**
     * Retrieves a list of customer orders based on the provided query parameters.
     *
     * @param queryParams a MultiValueMap containing the query parameters
     * @param httpHeaders the HTTP headers of the request
     * @return a ResponseEntity containing a ServiceResponse with a list of customer orders
     */
    @GetMapping(value = "/orders")
    ResponseEntity<?> getCustomerOrders(
            @RequestParam MultiValueMap<String, String> queryParams,
            @RequestHeader HttpHeaders httpHeaders
    );
}
