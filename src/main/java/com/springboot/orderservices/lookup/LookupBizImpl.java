package com.springboot.orderservices.lookup;

import com.springboot.orderservices.cassandra.repository.OrderDataRepository;
import com.springboot.orderservices.model.OrderDO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;


@Service
@Transactional
@Slf4j
public class LookupBizImpl implements LookupBiz {

    @Autowired
    private OrderDataRepository orderDataRepository;

    @Override
    public Optional<OrderDO> findOrderByOrderNo(String orderNo) {
        return orderDataRepository.findById(orderNo);
    }

}
