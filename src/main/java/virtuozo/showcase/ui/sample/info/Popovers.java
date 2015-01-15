package virtuozo.showcase.ui.sample.info;

import virtuozo.showcase.ui.sample.Fragment;
import virtuozo.ui.Button;
import virtuozo.ui.InputText;
import virtuozo.ui.Label;
import virtuozo.ui.Popover;
import virtuozo.ui.css.Direction;
import virtuozo.ui.interfaces.HasComponents;

import com.google.gwt.event.dom.client.BlurEvent;
import com.google.gwt.event.dom.client.BlurHandler;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;

public class Popovers implements Fragment {

  public void render(HasComponents<?, ?> target) {
    Button button = Button.create().text("Popover on bottom").attachTo(target);
    Popover tip = Popover.create().placement(Direction.BOTTOM).trigger(button, Popover.Trigger.CLICK);
    tip.heading().text(button.text());
    tip.body().addText().text(button.text());
    
    Label label = Label.create().attachTo(target).text("Popover on left");
    tip = Popover.create().placement(Direction.LEFT).trigger(label, Popover.Trigger.HOVER);
    tip.heading().text(label.text());
    tip.body().addText().text(label.text());
    
    String placeholder = "Popover on top";
    InputText text = InputText.create().placeholder(placeholder).attachTo(target);
    tip = Popover.create().placement(Direction.TOP).trigger(text, Popover.Trigger.FOCUS);
    tip.heading().text(placeholder);
    tip.body().addText().text(placeholder);

    placeholder = "Popover on right";
    text = InputText.create().placeholder("Type here to trigger Popover").attachTo(target);
    final Popover popover = Popover.create().placement(Direction.RIGHT).trigger(text, Popover.Trigger.MANUAL);
    popover.heading().text(placeholder);
    popover.body().addText().text(placeholder);
    
    text.onKeyUp(new KeyUpHandler() {
      
      @Override
      public void onKeyUp(KeyUpEvent event) {
        popover.show();
      }
    }).onBlur(new BlurHandler() {
      
      @Override
      public void onBlur(BlurEvent event) {
        popover.hide();
      }
    });
  }
  
  @Override
  public String title() {
    return "Popover";
  }
}