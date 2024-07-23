package com.gamerSync.gamerSync.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = Avaliacao.TABLE_NAME)
public class Avaliacao {

    public interface CreateAvaliacao {
    }

    public interface UpdateAvaliacao {
    }

    public static final String TABLE_NAME = "avaliacao";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idAvaliacao", unique = true)
    private Long id;

    @Column(name = "Nota")
    private double estrelas;

    @Column(name = "Descrição", length = 300, nullable = false)
    @NotEmpty
    @Size(min = 1, max = 300)
private String comentario;

    @ManyToOne
    @JoinColumn(name = "avaliacao_id")
    private Avaliacao avaliacao;

    public Avaliacao() {
    }

    public Avaliacao(int estrelas, String comentario) {
        this.estrelas = estrelas;
        this.comentario = comentario;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public double getEstrelas() {
        return estrelas;
    }

    public void setEstrelas(double estrelas) {
        this.estrelas = estrelas;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        return result;
    }

}
