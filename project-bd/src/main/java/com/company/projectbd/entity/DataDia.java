package com.company.projectbd.entity;

import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@JmixEntity
public class DataDia {
    @Temporal(TemporalType.DATE)
    private Date data;

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}