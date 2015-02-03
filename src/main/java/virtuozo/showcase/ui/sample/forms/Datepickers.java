package virtuozo.showcase.ui.sample.forms;

import virtuozo.infra.Calendar;
import virtuozo.infra.DateFormat;
import virtuozo.showcase.ui.sample.Fragment;
import virtuozo.ui.Datepicker;
import virtuozo.ui.FontAwesome;
import virtuozo.ui.MonthPanel;
import virtuozo.ui.interfaces.HasComponents;

public class Datepickers implements Fragment {

  public void render(HasComponents<?, ?> target) {
    Datepicker.create().attachTo(target).placeholder("Input only");
    Datepicker.create().attachTo(target).icon(FontAwesome.CALENDAR_O).disable().placeholder("Disabled datepicker with icon");
    Datepicker.create().attachTo(target).icon(FontAwesome.CALENDAR).placeholder("Input with iconified button");
    
    Calendar start = Calendar.create();
    Calendar end = Calendar.create().addYears(2);
    Datepicker.create().attachTo(target).icon(FontAwesome.CALENDAR).range(start, end).placeholder("Using range from now up to two years ahead.");
    
    Datepicker.create(DateFormat.DATE_MEDIUM).attachTo(target).icon(FontAwesome.CALENDAR).placeholder("Using a localized date format");
    
    MonthPanel.create().attachTo(target);
  }
  
  @Override
  public String title() {
    return "Datepicker";
  }
}
