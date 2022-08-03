package com.company.projectbd.app.service;

import com.company.projectbd.dto.VacinaMunicipio;
import io.jmix.core.DataManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class VacinaMunicipioService {
    @Autowired
    private DataManager dataManager;

    public List<VacinaMunicipio> getVacinaPorMunicipio() {

        List<VacinaMunicipio> list =
                dataManager.load(VacinaMunicipio.class).query(
                        "SELECT municipio, nome_vacina as nomeVacina, max(num_vac) as numVac FROM\n" +
                                "    ( SELECT count(v) as num_vac, nome_vacina, municipio FROM\n" +
                                "         Toma t NATURAL JOIN Mora m INNER JOIN Vacina v ON t.fk_id_vacina = v\n" +
                                "         INNER JOIN Municipio mu ON m.fk_Municipio = mu.id_Municipio GROUP BY mu.municipio) AS cont_vac\n" +
                                "    GROUP BY municipio"
                ).list();
        return list;
    }
}