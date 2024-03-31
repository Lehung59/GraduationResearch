package com.example.GR.Product.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "importdt")
@Data
@Getter
@Setter
@Table(name = "importdt")
public class ImportDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "importdetailid")
    private Integer importDetailId;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "price")
    private Double price;

    @Column(name = "pricetotal")
    private Double priceTotal;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "updated_at")
    private Date updatedAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "productid")
    private Product product;

}
