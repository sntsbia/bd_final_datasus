package com.company.projectbd.entity;

import com.company.projectbd.entity.key.OcorreCompKey;
import io.jmix.core.metamodel.annotation.JmixEntity;
import io.jmix.core.metamodel.annotation.Store;
import io.jmix.data.DdlGeneration;

import javax.persistence.*;

@DdlGeneration(value = DdlGeneration.DbScriptGenerationMode.DISABLED)
@JmixEntity
@Store(name = "projectbd")
@Table(name = "ocorre")
@Entity
public class Ocorre {
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "fkIdTeste", column = @Column(name = "`fK_id_Teste`")),
            @AttributeOverride(name = "fkIdMunicipio", column = @Column(name = "`fk_id_Municipio`"))
    })
    private OcorreCompKey id;

    @JoinColumn(name = "fk_id_Municipio")
    @MapsId
    @ManyToOne(fetch = FetchType.LAZY)
    private Municipio fkIdMunicipio;

    @JoinColumn(name = "fK_id_Teste")
    @MapsId
    @ManyToOne(fetch = FetchType.LAZY)
    private Teste fkIdTeste;

    public Teste getFkIdTeste() {
        return fkIdTeste;
    }

    public void setFkIdTeste(Teste fkIdTeste) {
        this.fkIdTeste = fkIdTeste;
    }

    public Municipio getFkIdMunicipio() {
        return fkIdMunicipio;
    }

    public void setFkIdMunicipio(Municipio fkIdMunicipio) {
        this.fkIdMunicipio = fkIdMunicipio;
    }

    public OcorreCompKey getId() {
        return id;
    }

    public void setId(OcorreCompKey id) {
        this.id = id;
    }
}