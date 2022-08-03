package com.company.projectbd.screen.mora;

import io.jmix.ui.screen.*;
import com.company.projectbd.entity.Mora;

@UiController("Mora.edit")
@UiDescriptor("mora-edit.xml")
@EditedEntityContainer("moraDc")
public class MoraEdit extends StandardEditor<Mora> {
}