package com.company.projectbd.screen.vacinamunicipio;

import com.company.projectbd.app.service.MunicipioService;
import com.company.projectbd.app.service.VacinaMunicipioService;
import com.company.projectbd.entity.Municipio;
import io.jmix.core.LoadContext;
import io.jmix.ui.screen.*;
import com.company.projectbd.dto.VacinaMunicipio;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collections;
import java.util.List;

@UiController("VacinaMunicipio.browse")
@UiDescriptor("vacina-municipio-browse.xml")
@LookupComponent("vacinaMunicipiosTable")
public class VacinaMunicipioBrowse extends StandardLookup<VacinaMunicipio> {
    @Autowired
    private VacinaMunicipioService municipioService;

    @Install(to = "vacinaMunicipiosDl", target = Target.DATA_LOADER)
    private List<VacinaMunicipio> vacinaMunicipiosDlLoadDelegate(LoadContext<VacinaMunicipio> loadContext) {
        // Here you can load entities from an external store
        return municipioService.getVacinaPorMunicipio();
    }

}