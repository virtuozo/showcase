package virtuozo.showcase.ui.sample.layouts;

import virtuozo.interfaces.HasComponents;
import virtuozo.interfaces.MediaList;
import virtuozo.interfaces.MediaList.Media;
import virtuozo.showcase.ui.Bundle;
import virtuozo.showcase.ui.sample.Snippet;

import com.google.gwt.dom.client.Style.VerticalAlign;

public class Hero implements Snippet {

  public void render(HasComponents<?, ?> target) {
    MediaList list = MediaList.create().attachTo(target);
    Media media = list.addMedia();
    media.object().addImage().src(Bundle.samples().hero());
    media.body().style().verticalAlign(VerticalAlign.MIDDLE);
    media.body().addHeading().text("Hero Page Layout");
    media.body().addText().text("This layout provides a navigation bar, a master head (hero image) section and a fluid container into the body.");
  }
  
  @Override
  public Class<?> snippet() {
    return HeroSnippet.class;
  }
  
  @Override
  public String title() {
    return "Hero";
  }
}
