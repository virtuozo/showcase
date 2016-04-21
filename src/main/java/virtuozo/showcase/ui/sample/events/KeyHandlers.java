package virtuozo.showcase.ui.sample.events;

import virtuozo.interfaces.Code;
import virtuozo.interfaces.HasComponents;
import virtuozo.showcase.ui.sample.Snippet;

public class KeyHandlers implements Snippet {

  @Override
  public String title() {
    return "Key Handlers";
  }

  @Override
  public void render(HasComponents<?, ?> target) {
    Code.create().attachTo(target).text("Virtuozo defines an interface called ")
    .inline("HasKeyHandlers")
    .text(". This interface provides methods to handle ")
    .inline("key down")
    .text(", ").inline("key press")
    .text(" and ").inline("key up").text(" events. Virtuozo also delivery a facility class that is called ")
    .inline("Keyboard").text(". This class provides methods to identify some common operations over key events, check it out.");
  }

  @Override
  public Class<?> snippet() {
    return KeySnippet.class;
  }
}
