package virtuozo.showcase.ui.sample.forms;

import virtuozo.showcase.ui.sample.Fragment;
import virtuozo.ui.InputText;
import virtuozo.ui.interfaces.HasComponents;

public class InputTexts implements Fragment {

  public void render(HasComponents<?, ?> target) {
    InputText.create().attachTo(target).placeholder("A regular input text");
  }
  
  @Override
  public String title() {
    return "Input Text";
  }
}
