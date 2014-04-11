package com.github.masahirosuzuka.PhoneGapIntelliJPlugin;

import com.github.masahirosuzuka.PhoneGapIntelliJPlugin.icons.PhoneGapIcons;
import com.intellij.openapi.module.ModifiableModuleModel;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.roots.ui.configuration.ModulesProvider;
import com.intellij.packaging.artifacts.ModifiableArtifactModel;
import com.intellij.projectImport.ProjectImportBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.List;

/**
 * Created by Masahiro Suzuka on 2014/04/08.
 */
public class PhoneGapProjectImportBuilder extends ProjectImportBuilder {

  @NotNull
  @Override
  public String getName() {
    return "PhoneGap";
  }

  @Override
  public Icon getIcon() {
    return new PhoneGapIcons().getIcon();
  }

  @Override
  public List getList() {
    return null;
  }

  @Override
  public boolean isMarked(Object o) {
    return false;
  }

  @Override
  public void setList(List list) throws ConfigurationException {

  }

  @Override
  public void setOpenProjectSettingsAfter(boolean b) {

  }

  @Nullable
  @Override
  public List<Module> commit(Project project,
                             ModifiableModuleModel modifiableModuleModel,
                             ModulesProvider modulesProvider,
                             ModifiableArtifactModel modifiableArtifactModel) {
    return null;
  }
}
