package virtuozo.showcase.ui.sample.typography;

import virtuozo.showcase.ui.sample.Fragment;
import virtuozo.ui.Blockquote;
import virtuozo.ui.interfaces.HasComponents;

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
