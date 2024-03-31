package com.example.GR.Product.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity(name = "product")
@Data
@Getter
@Setter
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "productid")
    private int productId;

    @Column(name = "avatarproduct")
    private String avatarProduct;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "discount")
    private int discount;

    @Column(name = "price")
    private double price;

    @Column(name = "productname")
    private String productName;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "status")
    private int status;

    @Column(name = "title")
    private String title;

    @Column(name = "updated_at")
    private Date updatedAt;

    @Column(name = "view")
    private int view;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "storeid", foreignKey = @ForeignKey(name = "fk_product_store"))
    private Store store;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "producttypeid", foreignKey = @ForeignKey(name = "fk_product_producttype"))
    private ProductType productType;

    @OneToMany
    private Set<ProductImage> productImages;

    @OneToMany
    private Set<ImportDetail> importDetails;

}
