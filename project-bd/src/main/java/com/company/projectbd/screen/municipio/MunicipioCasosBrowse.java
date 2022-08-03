package com.company.projectbd.screen.municipio;

import com.company.projectbd.app.service.MunicipioService;
import io.jmix.core.LoadContext;
import io.jmix.ui.screen.*;
import com.company.projectbd.entity.Municipio;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@UiController("MunicipioCasos.browse")
@UiDescriptor("municipio-casos-browse.xml")
@LookupComponent("municipiosTable")
public class MunicipioCasosBrowse extends StandardLookup<Municipio> {

    @Autowired
    private MunicipioService municipioService;

    @Install(to = "municipiosDl", target = Target.DATA_LOADER)
    private List<Municipio> municipiosDlLoadDelegate(LoadContext<Municipio> loadContext) {
        return null;
    }

}