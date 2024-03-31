package com.example.GR.Security.token;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface TokenRepository extends JpaRepository<Token, Integer> {

    @Query(value = """
      SELECT t FROM token t WHERE t.user.userId = :userId 
      AND (t.expired = false OR t.revoked = false)
      """, nativeQuery = true)
    List<Token> findAllValidTokensByUserId(Integer userId);

    @Query("select o from token o where o.token=:token")
    Optional<Token> findByToken(String token);
}