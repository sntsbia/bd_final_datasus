package com.company.projectbd.screen.condicao;

import io.jmix.ui.screen.*;
import com.company.projectbd.entity.Condicao;

@UiController("Condicao.edit")
@UiDescriptor("condicao-edit.xml")
@EditedEntityContainer("condicaoDc")
public class CondicaoEdit extends StandardEditor<Condicao> {
}