package com.company.projectbd.screen.datadia;

import com.company.projectbd.app.service.DataDiaService;
import io.jmix.core.LoadContext;
import io.jmix.ui.screen.*;
import com.company.projectbd.entity.DataDia;

import java.util.Collections;
import java.util.List;

@UiController("DataDia.browse")
@UiDescriptor("data-dia-browse.xml")
@LookupComponent("dataDiasTable")
public class DataDiaBrowse extends StandardLookup<DataDia> {

    DataDiaService dataService = new DataDiaService();
    @Install(to = "dataDiasDl", target = Target.DATA_LOADER)
    private List<DataDia> dataDiasDlLoadDelegate(LoadContext<DataDia> loadContext) {
        // Here you can load entities from an external store
        return dataService.getDias();
    }
}