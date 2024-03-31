package com.example.GR.Product.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity(name = "orderstatus")
@Data
@Setter
@Getter
@Table(name = "orderstatus")
public class OrderStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orderstatusid")
    private Integer orderStatusId;

    @Column(name = "orderstatusname")
    private Integer orderStatusName;

    @OneToMany
    @JsonManagedReference
    private List<OrderDetail> orderDetailList;

}
