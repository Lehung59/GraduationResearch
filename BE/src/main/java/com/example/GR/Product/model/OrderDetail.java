package com.example.GR.Product.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.Date;

@Entity(name = "orderdetail")
@Data
@Setter
@Getter
@Table(name = "orderdetail")
public class OrderDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orderdetailid")
    private Integer orderDetailId;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;

    @Column(name = "quantity")
    @Min(value = 0)
    @Max(value = 20, message = "too many products")
    private Integer quantity;

    @Column(name = "productname")
    private String productName;

    @Column(name = "procetotal")
    private Integer priceTotal;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cartid", foreignKey = @ForeignKey(name = "fk_orderdetail_cart"))
    private Cart cart;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "orderstatusid", foreignKey = @ForeignKey(name = "fk_orderdetail_orderstatus"))
    private OrderStatus orderStatus;

    // Getters and setters...
}
