package com.company.projectbd.screen.teste;

import io.jmix.ui.screen.*;
import com.company.projectbd.entity.Teste;

@UiController("Teste.browse")
@UiDescriptor("teste-browse.xml")
@LookupComponent("testesTable")
public class TesteBrowse extends StandardLookup<Teste> {
}