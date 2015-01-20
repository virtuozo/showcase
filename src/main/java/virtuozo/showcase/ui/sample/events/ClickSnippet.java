package virtuozo.showcase.ui.sample.events;

import virtuozo.ui.Tag;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.DoubleClickEvent;
import com.google.gwt.event.dom.client.DoubleClickHandler;


public class ClickSnippet {

  public void eventHandling() {
    Tag.asAnchor().onClick(new ClickHandler() {
      
      @Override
      public void onClick(ClickEvent event) {
        //Handle click event right here...
      }
    }).onDoubleClick(new DoubleClickHandler() {
      
      @Override
      public void onDoubleClick(DoubleClickEvent event) {
        //Handle double click event right here...
      }
    });
  }
}
