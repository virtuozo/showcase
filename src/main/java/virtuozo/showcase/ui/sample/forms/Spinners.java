package virtuozo.showcase.ui.sample.forms;

import virtuozo.showcase.ui.sample.Fragment;
import virtuozo.ui.Spinner;
import virtuozo.ui.interfaces.HasComponents;

public class Spinners implements Fragment {

  public void render(HasComponents<?, ?> target) {
    Spinner.create().attachTo(target).placeholder("A regular spinner");
    Spinner.create().attachTo(target).placeholder("A spinner with range from 0 to 10").range(0, 10);
  }
  
  @Override
  public String title() {
    return "Spinner";
  }
}
