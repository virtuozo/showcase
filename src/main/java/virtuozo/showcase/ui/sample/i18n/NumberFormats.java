package virtuozo.showcase.ui.sample.i18n;

import virtuozo.infra.MessageFormat;
import virtuozo.infra.NumberFormat;
import virtuozo.showcase.ui.sample.Fragment;
import virtuozo.ui.Button;
import virtuozo.ui.Paragraph;
import virtuozo.ui.Spinner;
import virtuozo.ui.Tag;
import virtuozo.ui.interfaces.HasComponents;

import com.google.gwt.dom.client.DivElement;
import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ChangeHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;

public class NumberFormats implements Fragment {

  public void render(HasComponents<?, ?> target) {
    final Spinner picker = Spinner.create().attachTo(target);
    Button decimal = Button.create().attachTo(target).text("Decimal (adds .12345 to number)");
    final Tag<DivElement> textContainer = Tag.asDiv().attachTo(target);
    
    decimal.onClick(new ClickHandler() {
      
      @Override
      public void onClick(ClickEvent event) {
        String value = String.valueOf(picker.value()) + ".12345";
        NumberFormats.this.apply(textContainer, Double.valueOf(value));
      }
    });
    
    picker.onChange(new ChangeHandler() {
      
      @Override
      public void onChange(ChangeEvent event) {
        NumberFormats.this.apply(textContainer, picker.value());
      }
    }).value(1);
  }
  
  private void apply(Tag<DivElement> textContainer, Number number){
    textContainer.detachChildren();
    String template = "Number format <strong>{0}</strong> produces the following output: <strong>{1}</strong>";
    
    for(NumberFormat format : NumberFormat.values()){
      String formattted = format.format(number);
      String text = MessageFormat.format(template, format.name(), formattted);
      Paragraph.create().attachTo(textContainer).html(text);
    }
  }
  
  @Override
  public String title() {
    return "Number Format";
  }
}
