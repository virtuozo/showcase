package virtuozo.showcase.ui.sample.navigation;

import virtuozo.interfaces.HasComponents;
import virtuozo.interfaces.PillPanel;
import virtuozo.interfaces.PillPanel.PillDroppable;
import virtuozo.showcase.ui.sample.Fragment;

public class Pills implements Fragment {

  public void render(HasComponents<?, ?> target) {
    PillPanel panel = PillPanel.create().attachTo(target);
    panel.addPill().text("Home");
    panel.addPill().text("Virtuozo");
    
    panel = PillPanel.create().attachTo(target).css(PillPanel.Type.BLOCK);
    panel.addPill().text("Home");
    panel.addPill().text("Virtuozo");
    
    panel = PillPanel.create().attachTo(target).css(PillPanel.Type.STACKED);
    panel.addPill().text("Home");
    panel.addPill().text("Virtuozo");
    panel.addPill().text("Disabled").disable();
    PillDroppable item = panel.addDropItem().text("Click me");
    item.addItem().text("GWT");
    item.addItem().text("Bootstrap");
  }
  
  @Override
  public String title() {
    return "Pill Panel";
  }
}
