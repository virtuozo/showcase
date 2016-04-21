package virtuozo.showcase.ui.sample.typography;

import virtuozo.interfaces.HasComponents;
import virtuozo.interfaces.Heading;
import virtuozo.showcase.ui.sample.Fragment;

public class Headlines implements Fragment {

  public void render(HasComponents<?, ?> container) {
    Heading.one().text("h1. Heading").headline(" Headline").attachTo(container);
    Heading.two().text("h2. Heading").headline(" Headline").attachTo(container);
    Heading.three().text("h3. Heading").headline(" Headline").attachTo(container);
    Heading.four().text("h4. Heading").headline(" Headline").attachTo(container);
    Heading.five().text("h5. Heading").headline(" Headline").attachTo(container);
    Heading.six().text("h6. Heading").headline(" Headline").attachTo(container);
  }
  
  @Override
  public String title() {
    return "Headline";
  }
}