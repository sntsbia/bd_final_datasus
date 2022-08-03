package com.company.projectbd.screen.municipio;

import com.company.projectbd.app.service.MunicipioService;
import io.jmix.ui.screen.*;
import com.company.projectbd.entity.Municipio;
import org.springframework.beans.factory.annotation.Autowired;

@UiController("Municipio.browse")
@UiDescriptor("municipio-browse.xml")
@LookupComponent("municipiosTable")
public class MunicipioBrowse extends StandardLookup<Municipio> {
    @Autowired
    private MunicipioService municipioService;

}