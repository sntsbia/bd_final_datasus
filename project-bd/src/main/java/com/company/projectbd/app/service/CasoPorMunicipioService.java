package com.company.projectbd.app.service;

import com.company.projectbd.dto.PessoasFebre;
import com.company.projectbd.entity.CasoPorMunicipio;
import io.jmix.core.DataManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CasoPorMunicipioService {
    @Autowired
    private DataManager dataManager;

    public List<CasoPorMunicipio> getCasosPorMunicipío() {

        List<CasoPorMunicipio> list =
                dataManager.load(CasoPorMunicipio.class).query(
                        "SELECT Data_teste as data, municipio FROM Teste " +
                                " NATURAL JOIN Mora INNER JOIN Municipio ON id_Municipio = Mora.fk_id_Municipio " +
                                " WHERE Teste.resultado = 1 GROUP BY municipio;"
                ).list();
        return list;
    }

}