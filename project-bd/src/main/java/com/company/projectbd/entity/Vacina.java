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
@Table(name = "VACINA")
@Entity
public class Vacina {
    @JmixGeneratedValue
    @Column(name = "id_Vacina", nullable = false)
    @Id
    private Long idVacina;

    @InstanceName
    @Column(name = "nome_Vacina")
    private String nomeVacina;

    @Column(name = "fabricante")
    private String fabricante;

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getNomeVacina() {
        return nomeVacina;
    }

    public void setNomeVacina(String nomeVacina) {
        this.nomeVacina = nomeVacina;
    }

    public Long getIdVacina() {
        return idVacina;
    }

    public void setIdVacina(Long idVacina) {
        this.idVacina = idVacina;
    }
}