package com.company.projectbd.screen.pessoa;

import io.jmix.ui.screen.*;
import com.company.projectbd.entity.Pessoa;

@UiController("PessoaSemVacina.browse")
@UiDescriptor("pessoa-sem-vacina-browse.xml")
@LookupComponent("pessoasTable")
public class PessoaSemVacinaBrowse extends StandardLookup<Pessoa> {
}