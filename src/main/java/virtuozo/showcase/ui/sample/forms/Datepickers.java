package virtuozo.showcase.ui.sample.forms;

import virtuozo.infra.Calendar;
import virtuozo.infra.DateFormat;
import virtuozo.showcase.ui.sample.Fragment;
import virtuozo.ui.Datepicker;
import virtuozo.ui.FontAwesome;
import virtuozo.ui.interfaces.HasComponents;

public class Datepickers implements Fragment {

  public void render(HasComponents<?, ?> target) {
    Datepicker.create().attachTo(target);
    Datepicker.create().attachTo(target).icon(FontAwesome.CALENDAR_O).disable();
    Datepicker.create().attachTo(target).icon(FontAwesome.CALENDAR);
    
    Calendar start = Calendar.create();
    Calendar end = Calendar.create().addYears(2);
    Datepicker.create().attachTo(target).icon(FontAwesome.CALENDAR).range(start, end);
    
    Datepicker.create(DateFormat.DATE_MEDIUM).attachTo(target).icon(FontAwesome.CALENDAR);
  }
  
  @Override
  public String title() {
    return "Datepicker";
  }
}
