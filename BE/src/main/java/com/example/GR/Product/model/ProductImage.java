package com.example.GR.Product.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "productimage")
@Data
@Getter
@Setter
@Table(name = "productimage")
public class ProductImage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "productimageid")
    private Integer productImageId;

    @Column(name = "imageproduct")
    private String imageProduct;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "status")
    private Integer status;

    @Column(name = "title")
    private String title;

    @Column(name = "updated_at")
    private Date updatedAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "productid")
    private Product product;

}