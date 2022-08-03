package com.company.projectbd.screen.pessoa;

import io.jmix.ui.screen.*;
import com.company.projectbd.entity.Pessoa;

@UiController("PessoaAcima30.browse")
@UiDescriptor("pessoa-acima30-browse.xml")
@LookupComponent("pessoasTable")
public class PessoaAcima30Browse extends StandardLookup<Pessoa> {
}