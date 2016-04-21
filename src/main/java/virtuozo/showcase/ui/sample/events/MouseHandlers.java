package virtuozo.showcase.ui.sample.events;

import virtuozo.interfaces.Code;
import virtuozo.interfaces.HasComponents;
import virtuozo.showcase.ui.sample.Snippet;

public class MouseHandlers implements Snippet {

  @Override
  public String title() {
    return "Mouse Handlers";
  }

  @Override
  public void render(HasComponents<?, ?> target) {
    Code.create().attachTo(target).text("Virtuozo defines an interface called ")
    .inline("HasMouseHandlers")
    .text(". This interface provides methods to handle ")
    .inline("mouse down")
    .text(", ").inline("mouse move")
    .text(", ").inline("mouse out")
    .text(", ").inline("mouse over")
    .text(", ").inline("mouse up")
    .text(" and ").inline("mouse wheel").text(" events.");
  }

  @Override
  public Class<?> snippet() {
    return MouseSnippet.class;
  }
}
