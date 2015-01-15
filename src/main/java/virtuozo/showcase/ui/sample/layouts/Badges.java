package virtuozo.showcase.ui.sample.layouts;

import virtuozo.showcase.ui.sample.Fragment;
import virtuozo.ui.Badge;
import virtuozo.ui.interfaces.HasComponents;

public class Badges implements Fragment {

  public void render(HasComponents<?, ?> target) {
    Badge.create().text("10").attachTo(target);
  }
  
  @Override
  public String title() {
    return "Badge";
  }
}
