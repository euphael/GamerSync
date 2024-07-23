package com.gamerSync.gamerSync.services;

import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gamerSync.gamerSync.models.Times;
import com.gamerSync.gamerSync.repositories.TimesRepository;

@Service
public class TimeService {

    @Autowired
    private TimesRepository timesRepository;

    public Times findById(Long idTimeDisp) {
        Optional<Times> time = this.timesRepository.findById(idTimeDisp);
        return time.orElseThrow(() -> new RuntimeException(
                "Time not found with id: " + idTimeDisp));
    }

    /**public Times findByNome(String nomeTime) {
        Optional<Times> time = this.timesRepository.findByNomeTime(nomeTime);
        return time.orElseThrow(() -> new RuntimeException(
                "Time not found with nome: " + nomeTime));
    }/* */

    public List<Times> findByIdJogo(int idJogo) {
        List<Times> time = this.timesRepository.findByIdJogo(idJogo);
        return time;
    }


    @Transactional
    public Times create(Times obj) {
        obj.setIdTimeDisp(null);
        obj = this.timesRepository.save(obj);
        return obj;
    }

    @Transactional
    public Times update(Times obj) {
        Times newObj = findById(obj.getIdTimeDisp());
        newObj.setNomeTime(obj.getNomeTime());
        return this.timesRepository.save(newObj);
    }

    @Transactional
    public void delete(Long idTimeDisp) {
       try{
        this.timesRepository.deleteById(idTimeDisp);
       }catch (Exception e){
           throw new RuntimeException("Could not delete time with id: " + idTimeDisp);
       }
    }
}