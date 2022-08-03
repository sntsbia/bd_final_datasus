package com.company.projectbd.screen.condicao;

import io.jmix.ui.screen.*;
import com.company.projectbd.entity.Condicao;

@UiController("Condicao.browse")
@UiDescriptor("condicao-browse.xml")
@LookupComponent("condicaosTable")
public class CondicaoBrowse extends StandardLookup<Condicao> {
}