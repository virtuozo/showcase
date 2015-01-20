package virtuozo.showcase.ui.sample.forms;

import virtuozo.showcase.ui.sample.Fragment;
import virtuozo.ui.Button;
import virtuozo.ui.FontAwesome;
import virtuozo.ui.InputGroup;
import virtuozo.ui.InputText;
import virtuozo.ui.Text;
import virtuozo.ui.interfaces.HasComponents;

public class InputGroups implements Fragment {

  public void render(HasComponents<?, ?> target) {
    InputGroup.create(InputText.create()).attachTo(target).prepend(Text.create().text("$")).append(Button.create().text("Button"));
    
    InputGroup.create(InputText.create()).attachTo(target).prepend(FontAwesome.ENVELOPE.asComponent()).append(Text.create().text("@example.com"));
  }
  
  @Override
  public String title() {
    return "Input Group";
  }
}
