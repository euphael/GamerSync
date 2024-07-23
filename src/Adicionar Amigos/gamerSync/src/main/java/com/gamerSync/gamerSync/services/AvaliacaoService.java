package com.gamerSync.gamerSync.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gamerSync.gamerSync.models.Avaliacao;
import com.gamerSync.gamerSync.repositories.AvaliacaoRepository;

import java.util.Optional;

import com.gamerSync.gamerSync.models.Avaliacao;
import com.gamerSync.gamerSync.repositories.AvaliacaoRepository;





@Service
public class AvaliacaoService {

    @Autowired(required = true)
    private AvaliacaoRepository avaliacaoRepository;


    public Avaliacao findById(Long id){

        Optional<Avaliacao> avaliacao = this.avaliacaoRepository.findById(id);
        return avaliacao.orElseThrow(() -> new RuntimeException(
            "Avaliação não encontrada id:" + id
        ));
        
      
    }

    @Transactional
    public Avaliacao create(Avaliacao obj) {
        obj.setId(null);
        obj = this.avaliacaoRepository.save(obj);
        return obj;
    }

    @Transactional
    public Avaliacao update(Avaliacao obj){
        Avaliacao newObj = findById(obj.getId());
        newObj.setComentario(obj.getComentario());
        newObj.setEstrelas(obj.getEstrelas());
        return this.avaliacaoRepository.save(newObj);
    }

    @Transactional
    public void delete(Long id){
        findById(id);
        try{
            this.avaliacaoRepository.deleteById(id);
        } catch (Exception e){
            throw new RuntimeException("Não é possivel excluir avaliação");
        }
    }

    
}
