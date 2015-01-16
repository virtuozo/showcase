package virtuozo.showcase.ui.sample.layout;

import virtuozo.showcase.ui.Bundle;
import virtuozo.showcase.ui.sample.Snippet;
import virtuozo.ui.MediaList;
import virtuozo.ui.MediaList.Media;
import virtuozo.ui.interfaces.HasComponents;

import com.google.gwt.dom.client.Style.VerticalAlign;

public class Sticky implements Snippet {

  public void render(HasComponents<?, ?> target) {
    MediaList list = MediaList.create().attachTo(target);
    Media media = list.addMedia();
    media.object().addImage().src(Bundle.samples().sticky());
    media.body().style().verticalAlign(VerticalAlign.MIDDLE);
    media.body().addHeading().text("Sticky Page Layout");
    media.body().addText().text("This layout provides a container and a sticky footer into the body.");
  }
  
  @Override
  public Class<?> snippet() {
    return StickySnippet.class;
  }
  
  @Override
  public String title() {
    return "Sticky";
  }
}
