package com.company.projectbd.screen.casopormunicipio;

import com.company.projectbd.app.service.CasoPorMunicipioService;
import com.company.projectbd.app.service.NewEntityService;
import io.jmix.core.LoadContext;
import io.jmix.ui.screen.*;
import com.company.projectbd.entity.CasoPorMunicipio;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collections;
import java.util.List;

@UiController("CasoPorMunicipio.browse")
@UiDescriptor("caso-por-municipio-browse.xml")
@LookupComponent("casoPorMunicipiosTable")
public class CasoPorMunicipioBrowse extends StandardLookup<CasoPorMunicipio> {

    @Autowired
    private CasoPorMunicipioService casoPorMunicipioService;

    @Install(to = "casoPorMunicipiosDl", target = Target.DATA_LOADER)
    private List<CasoPorMunicipio> casoPorMunicipiosDlLoadDelegate(LoadContext<CasoPorMunicipio> loadContext) {
        // Here you can load entities from an external store
        return casoPorMunicipioService.getCasosPorMunicipío();
    }
}