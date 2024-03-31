package com.example.GR.Account.repository;

import com.example.GR.Account.model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProfileRepo extends JpaRepository<Profile,Integer> {
    @Query("select o from profile o where o.username=:name")
    Optional<Profile> findByUsername( String name);

    @Query("select o from profile o where o.user.userId = :userId")
    Optional<Profile> findByUserid(int userId);



}
