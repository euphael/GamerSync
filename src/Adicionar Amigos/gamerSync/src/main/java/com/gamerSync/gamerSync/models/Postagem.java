package com.gamerSync.gamerSync.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = Postagem.TABLE_NAME)
public class Postagem {
    public static final String TABLE_NAME = "postagem";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Conteudo", length = 250, nullable = false)
    @NotNull
    @NotEmpty
    private String conteudo;        

    public Postagem() {
        // Construtor sem parâmetros
    }

    public Postagem(String conteudo) {
        this.conteudo = conteudo;
    }
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getConteudo() {
        return conteudo;
    }
}
