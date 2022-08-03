package com.company.projectbd.entity;

import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@JmixEntity
public class IdadeCoronavac {

    private Long idade;

    @Temporal(TemporalType.DATE)
    private Date data;

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Long getIdade() {
        return idade;
    }

    public void setIdade(Long idade) {
        this.idade = idade;
    }
}