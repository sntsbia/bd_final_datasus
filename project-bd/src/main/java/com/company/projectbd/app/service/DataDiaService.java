package com.company.projectbd.app.service;

import com.company.projectbd.entity.CasoPorMunicipio;
import com.company.projectbd.entity.DataDia;
import io.jmix.core.DataManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataDiaService {

    @Autowired
    private DataManager dataManager;

    public List<DataDia> getDias() {

        List<DataDia> list =
                dataManager.load(DataDia.class).query(
                        "SELECT distinct (Data_Teste) as data FROM Teste) UNION (SELECT distinct (Data) as data FROM Toma);"
                ).list();
        return list;
    }
}