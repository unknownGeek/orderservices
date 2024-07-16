package com.springboot.orderservices.lookup;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LookupServiceImpl implements LookupService {

    @Override
    public ResponseEntity<?> getCustomerOrders(MultiValueMap<String, String> queryParams, HttpHeaders httpHeaders) {
        String str = "Hello There!";

        return new ResponseEntity<>(queryParams.toSingleValueMap(), HttpStatus.OK);
    }

}
