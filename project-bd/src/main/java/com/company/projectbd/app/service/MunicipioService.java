package com.company.projectbd.app.service;

import io.jmix.core.DataManager;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MunicipioService {

    private static final Logger log = org.slf4j.LoggerFactory.getLogger(MunicipioService.class);
    @Autowired
    private DataManager dataManager;

//    public List<Municipioumcaso> getAllWithCasos() {
//
//        List<Municipioumcaso> list =
//                dataManager.load(Municipioumcaso.class).query(
//                        "select m.id_Municipio as id_Municipio, m.municipio as municipio, m.fk_id_Uf as fk_id_Uf\n" +
//                                "from municipioUmCaso m"
//                ).list();
//        return list;
//    }

}