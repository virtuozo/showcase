package virtuozo.showcase.ui.sample.actions;

import virtuozo.interfaces.ButtonGroup;
import virtuozo.interfaces.FontAwesome;
import virtuozo.interfaces.HasComponents;
import virtuozo.interfaces.Toolbar;
import virtuozo.showcase.ui.sample.Fragment;

public class Toolbars implements Fragment {

  public void render(HasComponents<?, ?> target) {
    Toolbar bar = Toolbar.create().attachTo(target);
    ButtonGroup group = bar.addButtonGroup();
    group.addButton().icon(FontAwesome.ALIGN_LEFT);
    group.addButton().icon(FontAwesome.ALIGN_CENTER);
    group.addButton().icon(FontAwesome.ALIGN_RIGHT);
    group.addButton().icon(FontAwesome.ALIGN_JUSTIFY);
    
    group = bar.addButtonGroup();
    group.addButton().icon(FontAwesome.COPY);
    group.addButton().icon(FontAwesome.PASTE);
    
    group = bar.addButtonGroup();
    group.addButton().text("Button");
    group.addDropButton().text("Dropdown").menu().addItem().text("Menu Item");
    group.addSplitButton().text("SplitButton").menu().addItem().text("MenuItem");
  }
  
  @Override
  public String title() {
    return "Toolbar";
  }
}