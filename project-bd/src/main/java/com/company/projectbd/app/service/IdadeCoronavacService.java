package com.company.projectbd.app.service;

import com.company.projectbd.entity.IdadeCoronavac;
import com.company.projectbd.entity.Municipio;
import io.jmix.core.DataManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IdadeCoronavacService {

    @Autowired
    private DataManager dataManager;

    public List<IdadeCoronavac> getByCoronavacIdade() {

        List<IdadeCoronavac> list =
                dataManager.load(IdadeCoronavac.class).query(
                        "SELECT idade, data FROM Toma INNER JOIN Pessoa INNER JOIN Vacina WHERE nome_vacina = 'SINOVAC';"
                ).list();
        return list;
    }

}