package com.example.GR.Product.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity(name = "producttype")
@Data
@Getter
@Setter
@Table(name = "producttype")
public class ProductType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "producttypeid")
    private int productTypeId;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "producttypeimg")
    private String productTypeImg;

    @Column(name = "producttypename")
    private String productTypeName;

    @Column(name = "updated_at")
    private Date updatedAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonBackReference
    @JoinColumn(name = "storetypeid", foreignKey = @ForeignKey(name = "fk_producttype_storetype"))
    private StoreType storeType;

}
