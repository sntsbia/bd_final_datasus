package com.company.projectbd.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import io.jmix.core.metamodel.annotation.Store;

import javax.persistence.*;

@Store(name = "projectbd")
@JmixEntity
@Table(name = "SINTOMAS", indexes = {
        @Index(name = "IDX_SINTOMAS_FK_ID_TESTE", columnList = "fk_id_Teste")
})
@Entity
public class Sintomas {
    @JmixGeneratedValue
    @Column(name = "id_Sintomas", nullable = false)
    @Id
    private Long idSintomas;

    @InstanceName
    @Column(name = "sintomas")
    private String sintomas;

    @JoinColumn(name = "fk_id_Teste")
    @ManyToOne(fetch = FetchType.LAZY)
    private Teste fkIdTeste;

    public Teste getFkIdTeste() {
        return fkIdTeste;
    }

    public void setFkIdTeste(Teste fkIdTeste) {
        this.fkIdTeste = fkIdTeste;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public Long getIdSintomas() {
        return idSintomas;
    }

    public void setIdSintomas(Long idSintomas) {
        this.idSintomas = idSintomas;
    }
}