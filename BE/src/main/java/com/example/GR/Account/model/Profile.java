package com.example.GR.Account.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
@Entity(name = "profile")
@Data
@Getter
@Setter
@Table(name = "profile")
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "profileid")
    private Integer profileId;

    @Column(name = "name")
    private String name;

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "created_at", nullable = false)
    private Date createdAt;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "phone", nullable = false)
    private String phone;

    @Column(name = "update_at", nullable = false)
    private Date updatedAt;

    @Column(name = "username", nullable = false, length = 30)
    private String username;

    @OneToOne
    @JoinColumn(name = "userid",foreignKey = @ForeignKey(name = "fi_user_profile"))
    private User user;

    // Getters and Setters
}