package virtuozo.showcase.ui.sample.layouts;

import virtuozo.showcase.ui.Bundle;
import virtuozo.showcase.ui.sample.Fragment;
import virtuozo.ui.Button;
import virtuozo.ui.Carousel;
import virtuozo.ui.Carousel.Slide.Caption;
import virtuozo.ui.api.HasComponents;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;

public class Carousels implements Fragment {

  public void render(HasComponents<?, ?> target) {
    final Carousel carousel = new Carousel().attachTo(target);
    Caption caption = carousel.addSlide().image(Bundle.images().author()).caption();
    caption.addHeading().text("Mr. Braz");
    caption.addText().text("Creator of Virtuozo, senior software engineer and Husky breeder");
    carousel.addSlide().image(Bundle.images().husky());
    
    final Button play = new Button().attachTo(target).text("Auto play");
    play.onClick(new ClickHandler() {
      
      @Override
      public void onClick(ClickEvent event) {
       carousel.autoPlay(5000);
       play.disable();
      }
    });
  }
}
