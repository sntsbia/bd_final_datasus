package com.company.projectbd.entity.key;

import io.jmix.core.metamodel.annotation.JmixEntity;
import org.springframework.data.util.ProxyUtils;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.util.Objects;

@JmixEntity
@Embeddable
public class MoraCompKey {
    @Column(name = "`fk_id_Municipio`")
    private Integer fkIdMunicipio;

    @Column(name = "`fk_id_Pessoa`")
    private Integer fkIdPessoa;

    public Integer getFkIdPessoa() {
        return fkIdPessoa;
    }

    public void setFkIdPessoa(Integer fkIdPessoa) {
        this.fkIdPessoa = fkIdPessoa;
    }

    public Integer getFkIdMunicipio() {
        return fkIdMunicipio;
    }

    public void setFkIdMunicipio(Integer fkIdMunicipio) {
        this.fkIdMunicipio = fkIdMunicipio;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fkIdMunicipio, fkIdPessoa);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || ProxyUtils.getUserClass(this) != ProxyUtils.getUserClass(o)) return false;
        MoraCompKey entity = (MoraCompKey) o;
        return Objects.equals(this.fkIdMunicipio, entity.fkIdMunicipio) &&
                Objects.equals(this.fkIdPessoa, entity.fkIdPessoa);
    }
}