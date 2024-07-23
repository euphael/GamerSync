package com.gamerSync.gamerSync.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gamerSync.gamerSync.models.Avaliacao;
@Repository
public interface AvaliacaoRepository extends JpaRepository<Avaliacao, Long> {

    List<Avaliacao> findByAvaliacao_Id(Long id);

}
