package com.company.projectbd.screen.pessoa;

import io.jmix.ui.screen.*;
import com.company.projectbd.entity.Pessoa;

@UiController("Pessoa.edit")
@UiDescriptor("pessoa-edit.xml")
@EditedEntityContainer("pessoaDc")
public class PessoaEdit extends StandardEditor<Pessoa> {
}