package com.springboot.orderservices.lookup;

import com.springboot.orderservices.model.OrderDO;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;



@Slf4j
@RestController
public class LookupServiceImpl implements LookupService {

    @Autowired
    private LookupBizImpl lookupBiz;

    @Override
    public ResponseEntity<?> getCustomerOrders(MultiValueMap<String, String> queryParams, HttpHeaders httpHeaders) {

        try {
            String orderNo = queryParams.getFirst("orderNo");
            List<OrderDO> orderDOList = new ArrayList<OrderDO>();

            if (StringUtils.isNotBlank(orderNo)) {
                Optional<OrderDO> orderDOOptional = lookupBiz.findOrderByOrderNo(orderNo);
                if(orderDOOptional.isPresent()) {
                    orderDOList.add(orderDOOptional.get());
                }
            } else {
                log.info("Received empty orderNo for getCustomerOrders api");
            }

            if (orderDOList.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(orderDOList, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
