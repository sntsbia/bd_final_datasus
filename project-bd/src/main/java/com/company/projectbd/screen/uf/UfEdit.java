package com.company.projectbd.screen.uf;

import io.jmix.ui.screen.*;
import com.company.projectbd.entity.Uf;

@UiController("Uf.edit")
@UiDescriptor("uf-edit.xml")
@EditedEntityContainer("ufDc")
public class UfEdit extends StandardEditor<Uf> {
}