package com.company.projectbd.screen.uf;

import io.jmix.ui.screen.*;
import com.company.projectbd.entity.Uf;

@UiController("Uf.browse")
@UiDescriptor("uf-browse.xml")
@LookupComponent("ufsTable")
public class UfBrowse extends StandardLookup<Uf> {
}