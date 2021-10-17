package com.kms.seft203.auth;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserJwtRepository extends JpaRepository<UserJwt, Long> {
    @Query("select u from UserJwt u where u.token = :token")
    Optional<UserJwt> findByToken(String token);
}
