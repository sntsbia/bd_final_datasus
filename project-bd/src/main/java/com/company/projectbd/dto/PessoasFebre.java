package com.company.projectbd.dto;

import io.jmix.core.metamodel.annotation.JmixEntity;

@JmixEntity
public class PessoasFebre {
    private String sintomas;

    private Long qtd;

    public Long getQtd() {
        return qtd;
    }

    public void setQtd(Long qtd) {
        this.qtd = qtd;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }
}