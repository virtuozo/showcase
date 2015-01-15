package virtuozo.showcase.ui.sample.forms;

import virtuozo.showcase.ui.sample.Fragment;
import virtuozo.ui.Datepicker;
import virtuozo.ui.FontAwesome;
import virtuozo.ui.interfaces.HasComponents;

public class Datepickers implements Fragment {

  public void render(HasComponents<?, ?> target) {
    Datepicker.create().attachTo(target).icon(FontAwesome.CALENDAR);
  }
  
  @Override
  public String title() {
    return "Date picker";
  }
}
