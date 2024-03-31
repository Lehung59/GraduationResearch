package com.example.GR.Product.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "cartitem")
@Data
@Setter
@Getter
@Table(name = "cartitem")
public class CartItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cartitemid")
    private Integer cartItemId;

    @Column(name = "updated_at")
    private Date updatedAt;

    @Column(name = "create_at")
    private Date createAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonBackReference
    @JoinColumn(name = "cartid", foreignKey = @ForeignKey(name = "fk_cartitem_cart"))
    private Cart cart;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonBackReference
    @JoinColumn(name = "productid", foreignKey = @ForeignKey(name = "fk_cartitem_product"))
    private Product product;

}
