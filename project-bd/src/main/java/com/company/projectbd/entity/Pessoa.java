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
@Table(name = "PESSOA")
@Entity
public class Pessoa {
    @JmixGeneratedValue
    @Column(name = "id_Pessoa", nullable = false)
    @Id
    private Long idPessoa;

    @Column(name = "sexo", length = 1)
    private String sexo;

    @InstanceName
    @Column(name = "idade")
    private Long idade;

    public Long getIdade() {
        return idade;
    }

    public void setIdade(Long idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Long getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(Long idPessoa) {
        this.idPessoa = idPessoa;
    }
}