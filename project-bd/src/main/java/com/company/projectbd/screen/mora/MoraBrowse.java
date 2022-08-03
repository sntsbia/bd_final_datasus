package com.company.projectbd.screen.mora;

import io.jmix.ui.screen.*;
import com.company.projectbd.entity.Mora;

@UiController("Mora.browse")
@UiDescriptor("mora-browse.xml")
@LookupComponent("morasTable")
public class MoraBrowse extends StandardLookup<Mora> {
}