package com.company.projectbd.dto;

import io.jmix.core.metamodel.annotation.JmixEntity;

@JmixEntity
public class VacinaMunicipio {
    private String municipio;

    private String nome;

    private String numVac;

    public String getNumVac() {
        return numVac;
    }

    public void setNumVac(String numVac) {
        this.numVac = numVac;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
}