package virtuozo.showcase.ui.sample.forms;

import virtuozo.infra.DateFormat;
import virtuozo.infra.data.Calendar;
import virtuozo.interfaces.Datepicker;
import virtuozo.interfaces.FontAwesome;
import virtuozo.interfaces.HasComponents;
import virtuozo.interfaces.MonthPanel;
import virtuozo.showcase.ui.sample.Fragment;

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
