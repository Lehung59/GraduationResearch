package com.example.GR.Account.repository;

import com.example.GR.Account.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
    @Query("select o from user o where o.username=:username")
    Optional<User> findByUsername(String username);
}
