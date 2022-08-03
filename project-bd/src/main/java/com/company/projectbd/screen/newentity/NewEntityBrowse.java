package com.company.projectbd.screen.newentity;

import com.company.projectbd.app.service.NewEntityService;
import io.jmix.core.LoadContext;
import io.jmix.ui.screen.*;
import com.company.projectbd.dto.PessoasFebre;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collections;
import java.util.List;

@UiController("NewEntity.browse")
@UiDescriptor("new-entity-browse.xml")
@LookupComponent("newEntitiesTable")
public class NewEntityBrowse extends StandardLookup<PessoasFebre> {
    @Autowired
    private NewEntityService pessoasFebre;

    @Install(to = "newEntitiesDl", target = Target.DATA_LOADER)
    private List<PessoasFebre> newEntitiesDlLoadDelegate(LoadContext<PessoasFebre> loadContext) {
        // Here you can load entities from an external store
        return pessoasFebre.getPessoasFebre();
    }
}