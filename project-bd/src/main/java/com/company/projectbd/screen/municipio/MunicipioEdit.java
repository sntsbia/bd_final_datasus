package com.company.projectbd.screen.municipio;

import io.jmix.ui.screen.*;
import com.company.projectbd.entity.Municipio;

@UiController("Municipio.edit")
@UiDescriptor("municipio-edit.xml")
@EditedEntityContainer("municipioDc")
public class MunicipioEdit extends StandardEditor<Municipio> {
}