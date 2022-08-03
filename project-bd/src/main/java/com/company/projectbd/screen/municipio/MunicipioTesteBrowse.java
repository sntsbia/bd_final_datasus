package com.company.projectbd.screen.municipio;

import io.jmix.ui.screen.*;
import com.company.projectbd.entity.Municipio;

@UiController("MunicipioTeste.browse")
@UiDescriptor("municipio-teste-browse.xml")
@LookupComponent("municipiosTable")
public class MunicipioTesteBrowse extends StandardLookup<Municipio> {
}