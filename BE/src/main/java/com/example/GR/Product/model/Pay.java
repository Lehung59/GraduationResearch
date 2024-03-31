package com.example.GR.Product.model;

import com.example.GR.Account.model.User;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity(name = "pay")
@Table(name = "pay")
@Data
@Getter
@Setter

public class Pay {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payid")
    private Integer payId;

    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @Column(name = "originalprice")
    private Double originalPrice;

    @Column(name = "userid")
    private Integer userId;


    @Column(name = "paymentmethod")
    private String paymentMethod;

    @Column(name = "status")
    private Integer status;

    @Column(name = "updated_at")
    private Date updatedAt;



    @Column(name = "voucherid")
    private Integer voucherId;

    @OneToOne
    @JoinColumn(name = "orderdetailid", foreignKey = @ForeignKey(name = "fk_pay_orderdetail"))
    private OrderDetail orderDetail;


}
