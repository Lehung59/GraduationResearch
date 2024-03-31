package com.example.GR.Product.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity(name = "storetype")
@Data
@Setter
@Getter
@Table(name = "storetype")
public class StoreType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "storeid")
    private int storeTypeId;

    @Column(name = "storetypename", unique = true)
    private String storeTypeName;

    @OneToMany
    @JsonManagedReference
    private List<ProductType> productType;

    // getters and setters
}
