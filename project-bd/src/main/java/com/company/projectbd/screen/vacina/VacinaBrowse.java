package com.company.projectbd.screen.vacina;

import io.jmix.ui.screen.*;
import com.company.projectbd.entity.Vacina;

@UiController("Vacina.browse")
@UiDescriptor("vacina-browse.xml")
@LookupComponent("vacinasTable")
public class VacinaBrowse extends StandardLookup<Vacina> {
}