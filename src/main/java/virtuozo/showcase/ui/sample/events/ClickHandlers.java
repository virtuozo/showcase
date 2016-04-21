package virtuozo.showcase.ui.sample.events;

import virtuozo.interfaces.Code;
import virtuozo.interfaces.HasComponents;
import virtuozo.showcase.ui.sample.Snippet;

public class ClickHandlers implements Snippet {

  @Override
  public String title() {
    return "Click Handlers";
  }

  @Override
  public void render(HasComponents<?, ?> target) {
    Code.create().attachTo(target).text("Virtuozo defines an interface called ")
    .inline("HasClickHandlers")
    .text(". This interface provides methods to handle ")
    .inline("click").text(" and ").inline("double click").text(" events.");
  }

  @Override
  public Class<?> snippet() {
    return ClickSnippet.class;
  }
}
