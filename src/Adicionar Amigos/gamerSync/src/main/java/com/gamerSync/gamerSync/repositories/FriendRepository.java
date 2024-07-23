package com.gamerSync.gamerSync.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gamerSync.gamerSync.models.Friend;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface FriendRepository extends JpaRepository<Friend, Long> {

    @Transactional(readOnly = true)
    Optional<Friend> findByUsername(String username);

}
