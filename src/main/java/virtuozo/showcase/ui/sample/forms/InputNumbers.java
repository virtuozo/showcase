package virtuozo.showcase.ui.sample.forms;

import virtuozo.showcase.ui.sample.Fragment;
import virtuozo.ui.InputNumber;
import virtuozo.ui.interfaces.HasComponents;

public class InputNumbers implements Fragment {

  public void render(HasComponents<?, ?> target) {
    InputNumber.create().attachTo(target).placeholder("A regular input number");
  }
  
  @Override
  public String title() {
    return "Input Number";
  }
}
