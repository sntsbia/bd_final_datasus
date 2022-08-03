package com.company.projectbd.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import io.jmix.core.metamodel.annotation.Store;

import javax.persistence.*;

@Store(name = "projectbd")
@JmixEntity
@Table(name = "CONDICAO", indexes = {
        @Index(name = "IDX_CONDICAO_FK_ID_PESSOA", columnList = "fk_id_Pessoa")
})
@Entity
public class Condicao {
    @JmixGeneratedValue
    @Column(name = "id_Condicao", nullable = false)
    @Id
    private Long idCondicao;

    @InstanceName
    @Column(name = "condicao")
    private String condicao;

    @JoinColumn(name = "fk_id_Pessoa")
    @ManyToOne(fetch = FetchType.LAZY)
    private Pessoa fkIdPessoa;

    public Pessoa getFkIdPessoa() {
        return fkIdPessoa;
    }

    public void setFkIdPessoa(Pessoa fkIdPessoa) {
        this.fkIdPessoa = fkIdPessoa;
    }

    public String getCondicao() {
        return condicao;
    }

    public void setCondicao(String condicao) {
        this.condicao = condicao;
    }

    public Long getIdCondicao() {
        return idCondicao;
    }

    public void setIdCondicao(Long idCondicao) {
        this.idCondicao = idCondicao;
    }
}