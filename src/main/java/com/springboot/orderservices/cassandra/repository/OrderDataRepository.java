package com.springboot.orderservices.cassandra.repository;

import com.springboot.orderservices.model.OrderDO;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OrderDataRepository extends CassandraRepository<OrderDO, String> {

//    Optional<OrderDO> findByOrderNo(String orderNo);
//
//    @AllowFiltering
//    List<OrderDO> findByOrderSource(boolean orderSource);
//
//    @AllowFiltering
//    List<OrderDO> findByTenantId(String tenantId);
}