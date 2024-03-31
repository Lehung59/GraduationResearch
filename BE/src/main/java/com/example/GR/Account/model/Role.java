package com.example.GR.Account.model;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity(name = "role")
@Data
@Getter
@Setter
@Table(name = "role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "roleid")
    private Integer roleId;

    @Column(name = "authorityname", nullable = false)
    private String authorityName;
    @OneToMany(mappedBy = "role")
    @JsonManagedReference
    private List<User> listUser;


    // Getters and Setters
}