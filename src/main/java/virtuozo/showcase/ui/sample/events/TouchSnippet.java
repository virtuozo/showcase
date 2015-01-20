package virtuozo.showcase.ui.sample.events;

import virtuozo.ui.Tag;

import com.google.gwt.event.dom.client.TouchCancelEvent;
import com.google.gwt.event.dom.client.TouchCancelHandler;
import com.google.gwt.event.dom.client.TouchEndEvent;
import com.google.gwt.event.dom.client.TouchEndHandler;
import com.google.gwt.event.dom.client.TouchMoveEvent;
import com.google.gwt.event.dom.client.TouchMoveHandler;
import com.google.gwt.event.dom.client.TouchStartEvent;
import com.google.gwt.event.dom.client.TouchStartHandler;


public class TouchSnippet {

  public void eventHandling() {
    Tag.asDiv().onTouchCancel(new TouchCancelHandler() {
      
      @Override
      public void onTouchCancel(TouchCancelEvent event) {
        //Handle touch cancel event right here...
      }
    }).onTouchEnd(new TouchEndHandler() {
      
      @Override
      public void onTouchEnd(TouchEndEvent event) {
        //Handle touch end event right here...
      }
    }).onTouchMove(new TouchMoveHandler() {
      
      @Override
      public void onTouchMove(TouchMoveEvent event) {
        //Handle touch move event right here...
      }
    }).onTouchStart(new TouchStartHandler() {
      
      @Override
      public void onTouchStart(TouchStartEvent event) {
        //Handle touch start event right here...
      }
    });
  }
}
