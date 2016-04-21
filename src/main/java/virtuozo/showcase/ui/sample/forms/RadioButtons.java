package virtuozo.showcase.ui.sample.forms;

import virtuozo.interfaces.HasComponents;
import virtuozo.interfaces.RadioButton;
import virtuozo.showcase.ui.sample.Fragment;

public class RadioButtons implements Fragment {

  public void render(HasComponents<?, ?> target) {
    RadioButton.create("radio").attachTo(target).text("Option 1");
    RadioButton.create("radio").attachTo(target).text("Option 2");
    
    RadioButton.inline("inline").attachTo(target).text("Option 1");
    RadioButton.inline("inline").attachTo(target).text("Option 2");
  }
  
  @Override
  public String title() {
    return "Radio Button";
  }
}
