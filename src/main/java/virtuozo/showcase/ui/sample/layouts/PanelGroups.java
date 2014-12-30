package virtuozo.showcase.ui.sample.layouts;

import virtuozo.showcase.ui.Bundle;
import virtuozo.showcase.ui.sample.Fragment;
import virtuozo.ui.PanelGroup;
import virtuozo.ui.PanelGroup.CollapsePanel;
import virtuozo.ui.Paragraph;
import virtuozo.ui.api.HasComponents;

public class PanelGroups implements Fragment {

  public void render(HasComponents<?, ?> target) {
    PanelGroup panels = new PanelGroup().attachTo(target);
    CollapsePanel panel = panels.addPanel();
    panel.header().text("Virtuozo");
    panel.body().add(new Paragraph().text(Bundle.constants().headline()));
    
    panel = panels.addPanel();
    panel.header().text("Home");
    panel.body().add(new Paragraph().text(Bundle.constants().sampleLongText()));
  }
}
