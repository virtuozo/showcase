package virtuozo.showcase.ui.sample.decorations;

import virtuozo.interfaces.Badge;
import virtuozo.interfaces.HasComponents;
import virtuozo.showcase.ui.sample.Fragment;

public class Badges implements Fragment {

  public void render(HasComponents<?, ?> target) {
    Badge.create().text("10").attachTo(target);
  }
  
  @Override
  public String title() {
    return "Badge";
  }
}
