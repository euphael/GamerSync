package com.gamerSync.gamerSync.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gamerSync.gamerSync.models.Postagem;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long> {
  
}
