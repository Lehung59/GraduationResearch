package com.example.GR.Product.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity(name = "store")
@Data
@Getter
@Setter
@Table(name = "store")
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int storeId;

    @Column(name = "storename")
    private String storeName;

    @Column(name = "address")
    private String address;

    @Column(name = "phonenumber")
    private int phoneNumber;

    @Column(name = "rate")
    private int rate;

    @Column(name = "image")
    private String image;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonBackReference
    @JoinColumn(name = "storetypeid", foreignKey = @ForeignKey(name = "fk_store_storetype"))
    private StoreType storeType;

    @OneToMany
    @JsonBackReference
    private List<Product> productList;


    // getters and setters
}
