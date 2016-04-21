package virtuozo.showcase.ui.sample.layouts;

import virtuozo.interfaces.HasComponents;
import virtuozo.interfaces.MediaList;
import virtuozo.interfaces.MediaList.Media;
import virtuozo.showcase.ui.Bundle;
import virtuozo.showcase.ui.sample.Snippet;

import com.google.gwt.dom.client.Style.VerticalAlign;

public class Bare implements Snippet {

  public void render(HasComponents<?, ?> target) {
    MediaList list = MediaList.create().attachTo(target);
    Media media = list.addMedia();
    media.object().addImage().src(Bundle.samples().bare());
    media.body().style().verticalAlign(VerticalAlign.MIDDLE);
    media.body().addHeading().text("Bare Page Layout");
    media.body().addText().text("This showcase samples page uses the bare layout.");
    media.body().addText().text("This layout provides a navigation bar and a fluid container into the body.");
  }
  
  @Override
  public Class<?> snippet() {
    return BareSnippet.class;
  }
  
  @Override
  public String title() {
    return "Bare";
  }
}
