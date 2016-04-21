package virtuozo.showcase.ui.sample.forms;

import virtuozo.interfaces.HasComponents;
import virtuozo.interfaces.InputNumber;
import virtuozo.showcase.ui.sample.Fragment;

public class InputNumbers implements Fragment {

  public void render(HasComponents<?, ?> target) {
    InputNumber.create().attachTo(target).placeholder("A regular input number");
  }
  
  @Override
  public String title() {
    return "Input Number";
  }
}
