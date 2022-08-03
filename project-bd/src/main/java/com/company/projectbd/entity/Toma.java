package com.company.projectbd.entity;

import com.company.projectbd.entity.key.TomaCompKey;
import io.jmix.core.metamodel.annotation.JmixEntity;
import io.jmix.core.metamodel.annotation.Store;
import io.jmix.data.DdlGeneration;

import javax.persistence.*;
import java.util.Date;

@DdlGeneration(value = DdlGeneration.DbScriptGenerationMode.DISABLED)
@JmixEntity
@Store(name = "projectbd")
@Table(name = "toma")
@Entity
public class Toma {
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "fkIdVacina", column = @Column(name = "`fk_id_Vacina`")),
            @AttributeOverride(name = "fkIdPessoa", column = @Column(name = "`fk_id_Pessoa`"))
    })
    private TomaCompKey id;

    @Column(name = "data")
    @Temporal(TemporalType.DATE)
    private Date data;

    @Column(name = "dose")
    private Integer dose;

    @JoinColumn(name = "`fk_id_Pessoa`")
    @MapsId
    @ManyToOne(fetch = FetchType.LAZY)
    private Pessoa fkIdPessoa;

    @JoinColumn(name = "`fk_id_Vacina`")
    @MapsId
    @ManyToOne(fetch = FetchType.LAZY)
    private Vacina fkIdVacina;

    @Column(name = "lote", length = 256)
    private String lote;

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public Vacina getFkIdVacina() {
        return fkIdVacina;
    }

    public void setFkIdVacina(Vacina fkIdVacina) {
        this.fkIdVacina = fkIdVacina;
    }

    public Pessoa getFkIdPessoa() {
        return fkIdPessoa;
    }

    public void setFkIdPessoa(Pessoa fkIdPessoa) {
        this.fkIdPessoa = fkIdPessoa;
    }

    public Integer getDose() {
        return dose;
    }

    public void setDose(Integer dose) {
        this.dose = dose;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public TomaCompKey getId() {
        return id;
    }

    public void setId(TomaCompKey id) {
        this.id = id;
    }
}