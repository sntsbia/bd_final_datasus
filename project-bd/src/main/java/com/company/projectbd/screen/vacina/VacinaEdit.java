package com.company.projectbd.screen.vacina;

import io.jmix.ui.screen.*;
import com.company.projectbd.entity.Vacina;

@UiController("Vacina.edit")
@UiDescriptor("vacina-edit.xml")
@EditedEntityContainer("vacinaDc")
public class VacinaEdit extends StandardEditor<Vacina> {
}