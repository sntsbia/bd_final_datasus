package com.company.projectbd.screen.ocorre;

import io.jmix.ui.screen.*;
import com.company.projectbd.entity.Ocorre;

@UiController("Ocorre.browse")
@UiDescriptor("ocorre-browse.xml")
@LookupComponent("ocorresTable")
public class OcorreBrowse extends StandardLookup<Ocorre> {
}