package virtuozo.showcase.ui.sample.events;

import virtuozo.showcase.ui.sample.Snippet;
import virtuozo.ui.Code;
import virtuozo.ui.interfaces.HasComponents;

public class ChangeHandlers implements Snippet {

  @Override
  public String title() {
    return "Change Handler";
  }

  @Override
  public void render(HasComponents<?, ?> target) {
    Code.create().attachTo(target).text("Virtuozo defines an interface called ")
    .inline("HasChangeHandlers")
    .text(". This interface provides methods to handle ")
    .inline("change").text(" event.");
  }

  @Override
  public Class<?> snippet() {
    return ChangeSnippet.class;
  }
}
