package virtuozo.showcase.ui.sample.events;

import virtuozo.showcase.ui.sample.Snippet;
import virtuozo.ui.Code;
import virtuozo.ui.interfaces.HasComponents;

public class TouchHandlers implements Snippet {

  @Override
  public String title() {
    return "Touch Handlers";
  }

  @Override
  public void render(HasComponents<?, ?> target) {
    Code.create().attachTo(target).text("Virtuozo defines an interface called ")
    .inline("HasTouchHandlers")
    .text(". This interface provides methods to handle ")
    .inline("touch cancel")
    .text(", ").inline("touch end")
    .text(", ").inline("touch move")
    .text(" and ").inline("touch start").text(" events.");
  }

  @Override
  public Class<?> snippet() {
    return TouchSnippet.class;
  }
}
