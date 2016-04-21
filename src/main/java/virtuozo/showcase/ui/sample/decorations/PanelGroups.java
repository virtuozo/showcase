package virtuozo.showcase.ui.sample.decorations;

import virtuozo.interfaces.HasComponents;
import virtuozo.interfaces.PanelGroup;
import virtuozo.interfaces.Paragraph;
import virtuozo.interfaces.PanelGroup.CollapsePanel;
import virtuozo.showcase.ui.Bundle;
import virtuozo.showcase.ui.sample.Fragment;

public class PanelGroups implements Fragment {

  public void render(HasComponents<?, ?> target) {
    PanelGroup panels = PanelGroup.create().attachTo(target);
    CollapsePanel panel = panels.addPanel();
    panel.header().text("Virtuozo");
    panel.body().add(Paragraph.create().text(Bundle.words().headline()));
    
    panel = panels.addPanel();
    panel.header().text("Home");
    panel.body().add(Paragraph.create().text(Bundle.words().sampleLongText()));
  }
  
  @Override
  public String title() {
    return "Panel Group";
  }
}
