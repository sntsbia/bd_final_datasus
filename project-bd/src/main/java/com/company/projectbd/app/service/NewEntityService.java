package com.company.projectbd.app.service;

import com.company.projectbd.dto.PessoasFebre;
import com.company.projectbd.entity.Municipio;
import io.jmix.core.DataManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewEntityService {

    @Autowired
    private DataManager dataManager;

    public List<PessoasFebre> getPessoasFebre() {

        List<PessoasFebre> list =
                dataManager.load(PessoasFebre.class).query(
                        "SELECT sintomas, count(*) as qtd FROM Pessoa inner join Teste on id_Pessoa = fk_id_pessoa INNER JOIN Sintomas\n" +
                                "    ON Sintomas.fk_id_teste = Teste.id_Teste\n" +
                                "    WHERE Sintomas.sintomas = 'febre'\n" +
                                "    GROUP BY sintomas;"
                ).list();
        return list;
    }
}