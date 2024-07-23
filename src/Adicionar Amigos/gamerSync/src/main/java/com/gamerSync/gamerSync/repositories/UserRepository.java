package com.gamerSync.gamerSync.repositories;

import com.gamerSync.gamerSync.models.Users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {

    @Transactional(readOnly = true)
    Users findByUsername(String username);

    @Query("SELECT COUNT(u) FROM Users u")
    Long countUsers();

}
