package com.company.projectbd.entity.key;

import io.jmix.core.metamodel.annotation.JmixEntity;
import org.springframework.data.util.ProxyUtils;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.util.Objects;

@JmixEntity
@Embeddable
public class OcorreCompKey {
    @Column(name = "`fk_id_Municipio`")
    private Integer fkIdMunicipio;

    @Column(name = "`fK_id_Teste`")
    private Integer fkIdTeste;

    public Integer getFkIdTeste() {
        return fkIdTeste;
    }

    public void setFkIdTeste(Integer fkIdTeste) {
        this.fkIdTeste = fkIdTeste;
    }

    public Integer getFkIdMunicipio() {
        return fkIdMunicipio;
    }

    public void setFkIdMunicipio(Integer fkIdMunicipio) {
        this.fkIdMunicipio = fkIdMunicipio;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fkIdMunicipio, fkIdTeste);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || ProxyUtils.getUserClass(this) != ProxyUtils.getUserClass(o)) return false;
        OcorreCompKey entity = (OcorreCompKey) o;
        return Objects.equals(this.fkIdMunicipio, entity.fkIdMunicipio) &&
                Objects.equals(this.fkIdTeste, entity.fkIdTeste);
    }
}