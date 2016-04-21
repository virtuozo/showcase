package virtuozo.showcase.ui.sample.forms;

import virtuozo.interfaces.Button;
import virtuozo.interfaces.FontAwesome;
import virtuozo.interfaces.HasComponents;
import virtuozo.interfaces.InputGroup;
import virtuozo.interfaces.InputText;
import virtuozo.interfaces.Text;
import virtuozo.showcase.ui.sample.Fragment;

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
