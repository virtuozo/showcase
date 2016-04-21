package virtuozo.showcase.ui.sample.decorations;

import virtuozo.interfaces.Button;
import virtuozo.interfaces.Carousel;
import virtuozo.interfaces.HasComponents;
import virtuozo.interfaces.Carousel.Slide.Caption;
import virtuozo.showcase.ui.Bundle;
import virtuozo.showcase.ui.sample.Fragment;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;

public class Carousels implements Fragment {

  public void render(HasComponents<?, ?> target) {
    final Carousel carousel = Carousel.create().attachTo(target);
    Caption caption = carousel.addSlide().image(Bundle.samples().largeHusky()).caption();
    caption.addHeading().text("Heading");
    caption.addText().text("Put some text here");
    
    carousel.addSlide().image(Bundle.samples().largeYork());
    
    final Button play = Button.create().attachTo(target).text("Auto play");
    play.onClick(new ClickHandler() {
      
      @Override
      public void onClick(ClickEvent event) {
       if(play.text().equals("Auto play")) {
        carousel.autoPlay().every(5000);
        play.text("Stop auto play");
        return;
       }
       carousel.autoPlay().stop();
       play.text("Auto play");
      }
    });
  }
  
  @Override
  public String title() {
    return "Carousel";
  }
}
