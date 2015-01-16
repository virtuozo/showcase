package virtuozo.showcase.ui.sample.decorations;

import virtuozo.showcase.ui.Bundle;
import virtuozo.showcase.ui.sample.Fragment;
import virtuozo.ui.Image;
import virtuozo.ui.LayoutPanel;
import virtuozo.ui.interfaces.HasComponents;

public class LayoutPanels implements Fragment {

  public void render(HasComponents<?, ?> target) {
    LayoutPanel.horizontal().attachTo(target)
      .add(Image.create().src(Bundle.samples().smallHusky()))
      .add(Image.create().src(Bundle.samples().smallYork()));
  
    LayoutPanel.vertical().attachTo(target)
      .add(Image.create().src(Bundle.samples().smallYork()))
      .add(Image.create().src(Bundle.samples().smallHusky()));
    
    LayoutPanel.horizontal().attachTo(target)
    .add(Image.create().src(Bundle.samples().smallHusky()))
    .add(Image.create().src(Bundle.samples().smallYork()))
    .add(Image.create().src(Bundle.samples().smallHusky()))
    .add(Image.create().src(Bundle.samples().smallYork()))
    .distribute();
  }
  
  @Override
  public String title() {
    return "Layout Panel";
  }
}