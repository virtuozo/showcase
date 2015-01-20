package virtuozo.showcase.ui.sample.events;

import virtuozo.showcase.ui.sample.Snippet;
import virtuozo.ui.Code;
import virtuozo.ui.interfaces.HasComponents;

public class FocusHandlers implements Snippet {

  @Override
  public String title() {
    return "Focus Handlers";
  }

  @Override
  public void render(HasComponents<?, ?> target) {
    Code.create().attachTo(target).text("Virtuozo defines an interface called ")
    .inline("HasFocusHandlers")
    .text(". This interface provides methods to handle ")
    .inline("focus").text(" and ").inline("blur").text(" events.");
  }

  @Override
  public Class<?> snippet() {
    return FocusSnippet.class;
  }
}
