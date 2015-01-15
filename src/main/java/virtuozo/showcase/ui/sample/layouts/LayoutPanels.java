package virtuozo.showcase.ui.sample.layouts;

import virtuozo.showcase.ui.Bundle;
import virtuozo.showcase.ui.sample.Fragment;
import virtuozo.ui.Image;
import virtuozo.ui.LayoutPanel;
import virtuozo.ui.interfaces.HasComponents;

public class LayoutPanels implements Fragment {

  public void render(HasComponents<?, ?> target) {
    LayoutPanel.horizontal().attachTo(target)
      .add(Image.create().src(Bundle.images().logo()))
      .add(Image.create().src(Bundle.images().logo()));
  
    LayoutPanel.vertical().attachTo(target)
      .add(Image.create().src(Bundle.images().logo()))
      .add(Image.create().src(Bundle.images().logo()));
  }
  
  @Override
  public String title() {
    return "Layout Panel";
  }
}