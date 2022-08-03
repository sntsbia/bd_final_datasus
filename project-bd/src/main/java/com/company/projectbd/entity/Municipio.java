package com.company.projectbd.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import io.jmix.core.metamodel.annotation.Store;

import javax.persistence.*;

@Store(name = "projectbd")
@JmixEntity
@Table(name = "MUNICIPIO", indexes = {
        @Index(name = "IDX_MUNICIPIO_FK_ID_UF", columnList = "fk_id_Uf")
})
@Entity
public class Municipio {
    @JmixGeneratedValue
    @Column(name = "id_Municipio", nullable = false)
    @Id
    private Long id_Municipio;

    @InstanceName
    @Column(name = "municipio")
    private String municipio;

    @JoinColumn(name = "fk_id_Uf")
    @ManyToOne(fetch = FetchType.LAZY)
    private Uf fkIdUf;

    public Uf getFkIdUf() {
        return fkIdUf;
    }

    public void setFkIdUf(Uf fkIdUf) {
        this.fkIdUf = fkIdUf;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public Long getId_Municipio() {
        return id_Municipio;
    }

    public void setId_Municipio(Long id_Municipio) {
        this.id_Municipio = id_Municipio;
    }
}