package virtuozo.showcase.ui.sample.layouts;

import virtuozo.showcase.ui.Bundle;
import virtuozo.showcase.ui.sample.Fragment;
import virtuozo.ui.Heading;
import virtuozo.ui.Heading.Level;
import virtuozo.ui.Image;
import virtuozo.ui.LayoutPanel;
import virtuozo.ui.api.HasComponents;

public class LayoutPanels implements Fragment {

  public void render(HasComponents<?, ?> target) {
    new Heading(Level.FOUR).text("Horizontal Layout Panel").attachTo(target);
    LayoutPanel.horizontal().attachTo(target).add(new Image().src(Bundle.images().logo())).add(new Image().src(Bundle.images().logo()));
  
    new Heading(Level.FOUR).text("Vertical Layout Panel").attachTo(target);
    LayoutPanel.vertical().attachTo(target).add(new Image().src(Bundle.images().logo())).add(new Image().src(Bundle.images().logo()));
  }
}