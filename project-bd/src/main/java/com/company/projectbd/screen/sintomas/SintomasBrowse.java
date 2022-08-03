package com.company.projectbd.screen.sintomas;

import io.jmix.ui.screen.*;
import com.company.projectbd.entity.Sintomas;

@UiController("Sintomas.browse")
@UiDescriptor("sintomas-browse.xml")
@LookupComponent("sintomasesTable")
public class SintomasBrowse extends StandardLookup<Sintomas> {
}