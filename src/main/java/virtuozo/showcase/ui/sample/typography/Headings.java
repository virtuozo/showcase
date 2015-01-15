package virtuozo.showcase.ui.sample.typography;

import virtuozo.showcase.ui.sample.Fragment;
import virtuozo.ui.Heading;
import virtuozo.ui.interfaces.HasComponents;

public class Headings implements Fragment {

  public void render(HasComponents<?, ?> target) {
    Heading.one().text("h1. Heading").attachTo(target);
    Heading.two().text("h2. Heading").attachTo(target);
    Heading.three().text("h3. Heading").attachTo(target);
    Heading.four().text("h4. Heading").attachTo(target);
    Heading.five().text("h5. Heading").attachTo(target);
    Heading.six().text("h6. Heading").attachTo(target);
  }
  
  @Override
  public String title() {
    return "Heading";
  }
}
