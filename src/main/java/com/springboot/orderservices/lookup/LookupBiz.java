package com.springboot.orderservices.lookup;


import com.springboot.orderservices.model.OrderDO;

import java.util.Optional;


public interface LookupBiz {

    Optional<OrderDO> findOrderByOrderNo(String orderNo);

}
