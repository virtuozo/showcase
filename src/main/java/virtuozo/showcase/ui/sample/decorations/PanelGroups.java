package virtuozo.showcase.ui.sample.decorations;

import virtuozo.showcase.ui.Bundle;
import virtuozo.showcase.ui.sample.Fragment;
import virtuozo.ui.PanelGroup;
import virtuozo.ui.PanelGroup.CollapsePanel;
import virtuozo.ui.Paragraph;
import virtuozo.ui.interfaces.HasComponents;

public class PanelGroups implements Fragment {

  public void render(HasComponents<?, ?> target) {
    PanelGroup panels = PanelGroup.create().attachTo(target);
    CollapsePanel panel = panels.addPanel();
    panel.header().text("Virtuozo");
    panel.body().add(Paragraph.create().text(Bundle.constants().headline()));
    
    panel = panels.addPanel();
    panel.header().text("Home");
    panel.body().add(Paragraph.create().text(Bundle.constants().sampleLongText()));
  }
  
  @Override
  public String title() {
    return "Panel Group";
  }
}
