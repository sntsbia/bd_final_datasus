package com.company.projectbd.screen.idadecoronavac;

import com.company.projectbd.app.service.CasoPorMunicipioService;
import com.company.projectbd.app.service.IdadeCoronavacService;
import io.jmix.core.LoadContext;
import io.jmix.ui.screen.*;
import com.company.projectbd.entity.IdadeCoronavac;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collections;
import java.util.List;

@UiController("IdadeCoronavac.browse")
@UiDescriptor("idade-coronavac-browse.xml")
@LookupComponent("idadeCoronavacsTable")
public class IdadeCoronavacBrowse extends StandardLookup<IdadeCoronavac> {
    @Autowired
    private IdadeCoronavacService idadeCoronavacService;

    @Install(to = "idadeCoronavacsDl", target = Target.DATA_LOADER)
    private List<IdadeCoronavac> idadeCoronavacsDlLoadDelegate(LoadContext<IdadeCoronavac> loadContext) {
        // Here you can load entities from an external store
        return idadeCoronavacService.getByCoronavacIdade();
    }
}