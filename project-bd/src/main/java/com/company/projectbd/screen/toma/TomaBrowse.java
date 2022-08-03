package com.company.projectbd.screen.toma;

import io.jmix.ui.screen.*;
import com.company.projectbd.entity.Toma;

@UiController("Toma.browse")
@UiDescriptor("toma-browse.xml")
@LookupComponent("tomasTable")
public class TomaBrowse extends StandardLookup<Toma> {
}