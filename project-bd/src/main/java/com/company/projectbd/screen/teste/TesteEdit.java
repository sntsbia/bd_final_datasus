package com.company.projectbd.screen.teste;

import io.jmix.ui.screen.*;
import com.company.projectbd.entity.Teste;

@UiController("Teste.edit")
@UiDescriptor("teste-edit.xml")
@EditedEntityContainer("testeDc")
public class TesteEdit extends StandardEditor<Teste> {
}