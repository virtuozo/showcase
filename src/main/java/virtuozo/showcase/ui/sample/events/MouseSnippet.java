package virtuozo.showcase.ui.sample.events;

import virtuozo.interfaces.InputText;

import com.google.gwt.event.dom.client.MouseDownEvent;
import com.google.gwt.event.dom.client.MouseDownHandler;
import com.google.gwt.event.dom.client.MouseMoveEvent;
import com.google.gwt.event.dom.client.MouseMoveHandler;
import com.google.gwt.event.dom.client.MouseOutEvent;
import com.google.gwt.event.dom.client.MouseOutHandler;
import com.google.gwt.event.dom.client.MouseOverEvent;
import com.google.gwt.event.dom.client.MouseOverHandler;
import com.google.gwt.event.dom.client.MouseUpEvent;
import com.google.gwt.event.dom.client.MouseUpHandler;
import com.google.gwt.event.dom.client.MouseWheelEvent;
import com.google.gwt.event.dom.client.MouseWheelHandler;

public class MouseSnippet {

  public void eventHandling() {
    InputText.create().onMouseDown(new MouseDownHandler() {
      
      @Override
      public void onMouseDown(MouseDownEvent event) {
        //Handle mouse down event right here...
      }
    }).onMouseMove(new MouseMoveHandler() {
      
      @Override
      public void onMouseMove(MouseMoveEvent event) {
        //Handle mouse move event right here...
      }
    }).onMouseOut(new MouseOutHandler() {
      
      @Override
      public void onMouseOut(MouseOutEvent event) {
        //Handle mouse out event right here...
      }
    }).onMouseOver(new MouseOverHandler() {
      
      @Override
      public void onMouseOver(MouseOverEvent event) {
        //Handle mouse over event right here...
      }
    }).onMouseUp(new MouseUpHandler() {
      
      @Override
      public void onMouseUp(MouseUpEvent event) {
        // Handle mouse up event right here...
      }
    }).onMouseWheel(new MouseWheelHandler() {
      
      @Override
      public void onMouseWheel(MouseWheelEvent event) {
        // Handle mouse wheel event right here...
      }
    });
  }
}
