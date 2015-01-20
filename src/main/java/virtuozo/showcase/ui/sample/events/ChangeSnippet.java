package virtuozo.showcase.ui.sample.events;

import virtuozo.ui.InputText;

import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ChangeHandler;


public class ChangeSnippet {

  public void eventHandling() {
    InputText.create().onChange(new ChangeHandler() {
      
      @Override
      public void onChange(ChangeEvent event) {
        //Handle change event right here...
      }
    });
  }
}
