package virtuozo.showcase.ui.sample.typography;

import virtuozo.showcase.ui.sample.Fragment;
import virtuozo.ui.Heading;
import virtuozo.ui.Heading.Level;
import virtuozo.ui.api.HasComponents;

public class Headlines implements Fragment {

  public void render(HasComponents<?, ?> container) {
    for(Level level : Level.values()) {
      new Heading(level).text("h"+ (level.ordinal() + 1) + ". Heading").headline(" Headline").attachTo(container);
    }
  }
}