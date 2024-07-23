package com.gamerSync.gamerSync.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.gamerSync.gamerSync.models.Times;

import java.util.List;
import java.util.Optional;


@Repository
public interface TimesRepository extends JpaRepository<Times, Long> {
    
    List<Times> findByIdJogo(int idJogo);

}