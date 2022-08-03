package com.company.projectbd.entity.key;

import io.jmix.core.metamodel.annotation.JmixEntity;
import org.springframework.data.util.ProxyUtils;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.util.Objects;

@JmixEntity
@Embeddable
public class TomaCompKey {
    @Column(name = "`fk_id_Pessoa`")
    private Integer fkIdPessoa;

    @Column(name = "`fk_id_Vacina`")
    private Integer fkIdVacina;

    public Integer getFkIdVacina() {
        return fkIdVacina;
    }

    public void setFkIdVacina(Integer fkIdVacina) {
        this.fkIdVacina = fkIdVacina;
    }

    public Integer getFkIdPessoa() {
        return fkIdPessoa;
    }

    public void setFkIdPessoa(Integer fkIdPessoa) {
        this.fkIdPessoa = fkIdPessoa;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fkIdPessoa, fkIdVacina);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || ProxyUtils.getUserClass(this) != ProxyUtils.getUserClass(o)) return false;
        TomaCompKey entity = (TomaCompKey) o;
        return Objects.equals(this.fkIdPessoa, entity.fkIdPessoa) &&
                Objects.equals(this.fkIdVacina, entity.fkIdVacina);
    }
}