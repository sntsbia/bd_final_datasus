package com.company.projectbd.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import io.jmix.core.metamodel.annotation.Store;

import javax.persistence.*;
import java.util.Date;

@Store(name = "projectbd")
@JmixEntity
@Table(name = "TESTE", indexes = {
        @Index(name = "IDX_TESTE_FK_ID_PESSOA", columnList = "fk_id_Pessoa")
})
@Entity
public class Teste {
    @JmixGeneratedValue
    @Column(name = "id_Teste", nullable = false)
    @Id
    private Long idTeste;

    @InstanceName
    @Column(name = "data_Teste")
    @Temporal(TemporalType.DATE)
    private Date data_Teste;

    @Column(name = "resultado")
    private Long resultado;

    @JoinColumn(name = "fk_id_Pessoa")
    @ManyToOne(fetch = FetchType.LAZY)
    private Pessoa fkIdPessoa;

    public Pessoa getFkIdPessoa() {
        return fkIdPessoa;
    }

    public void setFkIdPessoa(Pessoa fkIdPessoa) {
        this.fkIdPessoa = fkIdPessoa;
    }

    public Long getResultado() {
        return resultado;
    }

    public void setResultado(Long resultado) {
        this.resultado = resultado;
    }

    public Date getData_Teste() {
        return data_Teste;
    }

    public void setData_Teste(Date data_Teste) {
        this.data_Teste = data_Teste;
    }

    public Long getIdTeste() {
        return idTeste;
    }

    public void setIdTeste(Long idTeste) {
        this.idTeste = idTeste;
    }
}