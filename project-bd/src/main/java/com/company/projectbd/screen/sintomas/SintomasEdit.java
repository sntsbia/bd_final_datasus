package com.company.projectbd.screen.sintomas;

import io.jmix.ui.screen.*;
import com.company.projectbd.entity.Sintomas;

@UiController("Sintomas.edit")
@UiDescriptor("sintomas-edit.xml")
@EditedEntityContainer("sintomasDc")
public class SintomasEdit extends StandardEditor<Sintomas> {
}