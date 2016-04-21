package virtuozo.showcase.ui.sample.typography;

import virtuozo.interfaces.Blockquote;
import virtuozo.interfaces.HasComponents;
import virtuozo.showcase.ui.sample.Fragment;

public class Blockquotes implements Fragment {

  public void render(HasComponents<?, ?> target) {
    Blockquote.create().text("It is a simple blockquote.").attachTo(target);
    Blockquote.create().text("It is a blockquote with a footer.").footer("Someone that is virtuozo").attachTo(target);
    Blockquote.create().text("Blockquote with an alternate display.").footer("Someone that is highly virtuozo").reverse().attachTo(target);
  }
  
  @Override
  public String title() {
    return "Blockquote";
  }
}
