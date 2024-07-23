package com.gamerSync.gamerSync.models;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity

@Table(name = Times.TABLE_NAME)
public class Times {
    public static final String TABLE_NAME = "Times";

    public interface CreateTime {
    }

    public interface UpdateTime {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTimes_Disponiveis", unique = true)
    private Long idTimeDisp;

    @Column(name = "Nome", length = 100, nullable = false)
    @NotNull(groups = CreateTime.class)
    @NotEmpty(groups = CreateTime.class)
    @Size(groups = CreateTime.class, min = 3, max = 100)
    private String nomeTime;

    @Column(name = "Status", length = 100, nullable = false)
    @NotNull(groups = { CreateTime.class, UpdateTime.class })
    @NotEmpty(groups = { CreateTime.class, UpdateTime.class })
    @Size(groups = CreateTime.class, min = 8, max = 60)
    private String statusTime;

    @Column(name = "Jogos_idJogo", length = 100, nullable = false)
    @NotNull(groups = { CreateTime.class, UpdateTime.class })
    @NotEmpty(groups = { CreateTime.class, UpdateTime.class })
    @Size(groups = CreateTime.class, min = 8, max = 60)
    private int idJogo;

    public Long getIdTimeDisp() {
        return idTimeDisp;
    }

    public void setIdTimeDisp(Long idTimeDisp) {
        this.idTimeDisp = idTimeDisp;
    }

    public String getNomeTime() {
        return nomeTime;
    }

    public void setNomeTime(String nomeTime) {
        this.nomeTime = nomeTime;
    }

    public String getStatusTime() {
        return statusTime;
    }

    public void setStatusTime(String statusTime) {
        this.statusTime = statusTime;
    }

    public int getIdJogo() {
        return idJogo;
    }

    public void setIdJogo(int idJogo) {
        this.idJogo = idJogo;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof Times))
            return false;

        Times times = (Times) obj;
        return Objects.equals(idTimeDisp, times.idTimeDisp);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((idTimeDisp == null) ? 0 : idTimeDisp.hashCode());
        return result;
    }
}
