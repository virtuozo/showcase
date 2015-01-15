package virtuozo.showcase.ui.sample.layouts;

import virtuozo.showcase.ui.Bundle;
import virtuozo.showcase.ui.sample.Fragment;
import virtuozo.ui.Button;
import virtuozo.ui.Carousel;
import virtuozo.ui.Carousel.Slide.Caption;
import virtuozo.ui.interfaces.HasComponents;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;

public class Carousels implements Fragment {

  public void render(HasComponents<?, ?> target) {
    final Carousel carousel = Carousel.create().attachTo(target);
    Caption caption = carousel.addSlide().image(Bundle.images().author()).caption();
    caption.addHeading().text("Mr. Braz");
    caption.addText().text("Creator of Virtuozo, senior software engineer and Husky breeder");
    carousel.addSlide().image(Bundle.images().husky());
    
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
