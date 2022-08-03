package com.company.projectbd.entity;

import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@JmixEntity
public class CasoPorMunicipio {
    @Temporal(TemporalType.DATE)
    private Date data;

    private String municipio;

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}