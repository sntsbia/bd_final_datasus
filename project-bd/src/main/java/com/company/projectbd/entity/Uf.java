package com.company.projectbd.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import io.jmix.core.metamodel.annotation.Store;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Store(name = "projectbd")
@JmixEntity
@Table(name = "UF")
@Entity
public class Uf {
    @JmixGeneratedValue
    @Column(name = "id_Uf", nullable = false)
    @Id
    private Long idUf;

    @Column(name = "codigo_ibge")
    private Long codigoIbge;

    @InstanceName
    @Column(name = "estado")
    private String estado;

    @Column(name = "bandeira")
    private byte[] bandeira;

    public byte[] getBandeira() {
        return bandeira;
    }

    public void setBandeira(byte[] bandeira) {
        this.bandeira = bandeira;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Long getCodigoIbge() {
        return codigoIbge;
    }

    public void setCodigoIbge(Long codigoIbge) {
        this.codigoIbge = codigoIbge;
    }

    public Long getIdUf() {
        return idUf;
    }

    public void setIdUf(Long idUf) {
        this.idUf = idUf;
    }
}