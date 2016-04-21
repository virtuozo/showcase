package virtuozo.showcase.ui.sample.forms;

import virtuozo.interfaces.HasComponents;
import virtuozo.interfaces.InputText;
import virtuozo.showcase.ui.sample.Fragment;

public class InputTexts implements Fragment {

  public void render(HasComponents<?, ?> target) {
    InputText.create().attachTo(target).placeholder("A regular input text");
  }
  
  @Override
  public String title() {
    return "Input Text";
  }
}
