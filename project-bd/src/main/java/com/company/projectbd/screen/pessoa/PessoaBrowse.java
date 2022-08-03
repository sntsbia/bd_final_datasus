package com.company.projectbd.screen.pessoa;

import io.jmix.ui.screen.*;
import com.company.projectbd.entity.Pessoa;

@UiController("Pessoa.browse")
@UiDescriptor("pessoa-browse.xml")
@LookupComponent("pessoasTable")
public class PessoaBrowse extends StandardLookup<Pessoa> {
}