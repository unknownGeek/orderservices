package com.springboot.orderservices.model;

import lombok.*;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.io.Serializable;
import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"id"})
@ToString
@Table(value = "orderdata")
public class OrderDO implements Serializable {

    // This will be orderNo for CustomerOrder and returnOrderNo for ReturnOrder
    @PrimaryKey
    @Column(value = "order_no")
    private String orderNo;

    @Column(value = "src_modified_dt")
    private Date srcModifiedDt;

    @Column(value = "src_created_dt")
    private Date srcCreatedDt;

    @Column(value = "event_time")
    private Date eventTime;

    @Column(value = "data")
    private String data;

    @Column(value = "tenant_id")
    private String tenantId;

    @Column(value = "order_source")
    private String orderSource;

    @Column(value = "encryption_id")
    @Setter(AccessLevel.NONE)
    private String encryption_id = "0";
}
