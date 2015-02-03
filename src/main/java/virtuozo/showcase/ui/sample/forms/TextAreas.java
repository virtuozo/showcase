package virtuozo.showcase.ui.sample.forms;

import virtuozo.showcase.ui.sample.Fragment;
import virtuozo.ui.TextArea;
import virtuozo.ui.interfaces.HasComponents;

public class TextAreas implements Fragment {

  public void render(HasComponents<?, ?> target) {
    TextArea.create().attachTo(target).value("A simple text area");
    
    TextArea.create().attachTo(target).value("A simple text area").rows(5);
  }
  
  @Override
  public String title() {
    return "Text Area";
  }
}
