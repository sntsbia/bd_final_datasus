package com.company.projectbd.entity;

import com.company.projectbd.entity.key.MoraCompKey;
import io.jmix.core.metamodel.annotation.JmixEntity;
import io.jmix.core.metamodel.annotation.Store;
import io.jmix.data.DdlGeneration;

import javax.persistence.*;

@DdlGeneration(value = DdlGeneration.DbScriptGenerationMode.DISABLED)
@JmixEntity
@Store(name = "projectbd")
@Table(name = "mora")
@Entity
public class Mora {
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "fkIdPessoa", column = @Column(name = "`fk_id_Pessoa`")),
            @AttributeOverride(name = "fkIdMunicipio", column = @Column(name = "`fk_id_Municipio`"))
    })
    private MoraCompKey id;

    @JoinColumn(name = "`fk_id_Municipio`")
    @MapsId
    @ManyToOne(fetch = FetchType.LAZY)
    private Municipio fkIdMunicipio;

    @JoinColumn(name = "`fk_id_Pessoa`")
    @MapsId
    @ManyToOne(fetch = FetchType.LAZY)
    private Pessoa fkIdPessoa;

    public Pessoa getFkIdPessoa() {
        return fkIdPessoa;
    }

    public void setFkIdPessoa(Pessoa fkIdPessoa) {
        this.fkIdPessoa = fkIdPessoa;
    }

    public Municipio getFkIdMunicipio() {
        return fkIdMunicipio;
    }

    public void setFkIdMunicipio(Municipio fkIdMunicipio) {
        this.fkIdMunicipio = fkIdMunicipio;
    }

    public MoraCompKey getId() {
        return id;
    }

    public void setId(MoraCompKey id) {
        this.id = id;
    }
}