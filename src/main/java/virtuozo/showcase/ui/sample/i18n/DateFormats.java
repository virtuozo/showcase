package virtuozo.showcase.ui.sample.i18n;

import java.util.Date;

import virtuozo.infra.DateFormat;
import virtuozo.infra.MessageFormat;
import virtuozo.infra.data.Calendar;
import virtuozo.interfaces.Datepicker;
import virtuozo.interfaces.HasComponents;
import virtuozo.interfaces.Paragraph;
import virtuozo.interfaces.Tag;
import virtuozo.showcase.ui.sample.Fragment;

import com.google.gwt.dom.client.DivElement;
import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ChangeHandler;

public class DateFormats implements Fragment {

  public void render(HasComponents<?, ?> target) {
    final Datepicker picker = Datepicker.create().attachTo(target);
    final Tag<DivElement> textContainer = Tag.asDiv().attachTo(target);
    
    picker.onChange(new ChangeHandler() {
      
      @Override
      public void onChange(ChangeEvent event) {
        DateFormats.this.apply(textContainer, picker.value().toDate());
      }
    });
    picker.value(Calendar.create());
  }
  
  private void apply(Tag<DivElement> textContainer, Date date){
    textContainer.detachChildren();
    String template = "Date format <strong>{0}</strong> produces the following output: <strong>{1}</strong>";
    
    for(DateFormat format : DateFormat.values()){
      String formattted = format.format(date);
      String text = MessageFormat.format(template, format.name(), formattted);
      Paragraph.create().attachTo(textContainer).html(text);
    }
  }
  
  @Override
  public String title() {
    return "Date Format";
  }
}
