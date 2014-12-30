package virtuozo.showcase.ui.sample.layouts;

import virtuozo.showcase.ui.sample.Fragment;
import virtuozo.ui.Badge;
import virtuozo.ui.Button;
import virtuozo.ui.api.HasComponents;

public class Badges implements Fragment {

  public void render(HasComponents<?, ?> target) {
    new Badge().text("10").attachTo(new Button().text("Messages ").attachTo(target));
  }
}
