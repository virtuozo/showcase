package virtuozo.showcase.ui.sample.events;

import virtuozo.interfaces.InputText;

import com.google.gwt.event.dom.client.BlurEvent;
import com.google.gwt.event.dom.client.BlurHandler;
import com.google.gwt.event.dom.client.FocusEvent;
import com.google.gwt.event.dom.client.FocusHandler;

public class FocusSnippet {

  public void eventHandling() {
    InputText.create().onFocus(new FocusHandler() {
      
      @Override
      public void onFocus(FocusEvent event) {
        //Handle focus event right here...
      }
    }).onBlur(new BlurHandler() {
      
      @Override
      public void onBlur(BlurEvent event) {
        //Handle blur event right here...
      }
    });
  }
}
