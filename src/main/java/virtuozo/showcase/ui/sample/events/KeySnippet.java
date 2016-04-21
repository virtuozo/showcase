package virtuozo.showcase.ui.sample.events;

import virtuozo.infra.Keyboard;
import virtuozo.interfaces.InputText;

import com.google.gwt.event.dom.client.KeyDownEvent;
import com.google.gwt.event.dom.client.KeyDownHandler;
import com.google.gwt.event.dom.client.KeyPressEvent;
import com.google.gwt.event.dom.client.KeyPressHandler;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;

public class KeySnippet {

  public void eventHandling() {
    InputText.create().onKeyDown(new KeyDownHandler() {
      
      @Override
      public void onKeyDown(KeyDownEvent event) {
        //Handle key down event right here...
        if(Keyboard.get().enter(event)){
          //Use Keyboard class to identify keys
        }
      }
    }).onKeyPress(new KeyPressHandler() {
      
      @Override
      public void onKeyPress(KeyPressEvent event) {
        //Handle key press event right here...
      }
    }).onKeyUp(new KeyUpHandler() {
      
      @Override
      public void onKeyUp(KeyUpEvent event) {
        //Handle key up event right here...
      }
    });
  }
}
