package com.gamerSync.gamerSync.services;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gamerSync.gamerSync.models.Postagem;
import com.gamerSync.gamerSync.repositories.PostagemRepository;



@Service
public class PostagemService {
    
    @Autowired(required = true)
    private PostagemRepository postagemRepository;



    public Postagem findById(Long id){
        Optional<Postagem> postagem = this.postagemRepository.findById(id);
        return postagem.orElseThrow(() -> new RuntimeException(
            "Postagem não encontrada id:" + id
        ));        
    }

    @Transactional
    public Postagem create(Postagem obj) {
    obj = new Postagem(obj.getConteudo()); // Use o novo construtor sem passar o ID
    return this.postagemRepository.save(obj);
}


    @Transactional
    public Postagem update(Postagem obj){
        Postagem newObj = findById(obj.getId());
        newObj.setConteudo(obj.getConteudo()); 
        return this.postagemRepository.save(newObj);
    }

    @Transactional
    public List<Postagem> getAllPostagens() {
        return postagemRepository.findAll();
    }

    @Transactional
    public void delete(Long id){
        findById(id);
        try{
            this.postagemRepository.deleteById(id);
        } catch (Exception e){
            throw new RuntimeException("Não é possivel excluir pois há postagem");
        }
    }

}