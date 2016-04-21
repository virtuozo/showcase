package virtuozo.showcase.ui.sample.layouts;

import virtuozo.interfaces.HasComponents;
import virtuozo.interfaces.MediaList;
import virtuozo.interfaces.MediaList.Media;
import virtuozo.showcase.ui.Bundle;
import virtuozo.showcase.ui.sample.Snippet;

import com.google.gwt.dom.client.Style.VerticalAlign;

public class Landing implements Snippet {

  public void render(HasComponents<?, ?> target) {
    MediaList list = MediaList.create().attachTo(target);
    Media media = list.addMedia();
    media.body().style().verticalAlign(VerticalAlign.MIDDLE);
    media.object().addImage().src(Bundle.samples().landing());
    media.body().addHeading().text("Landing Page Layout");
    media.body().addText().text("This showcase home page uses the lading page layout.");
    media.body().addText().text("This layout provides a navigation bar and a set of fluid containers into the body. All of the sections can be linked by a navigational item.");
  }
  
  @Override
  public Class<?> snippet() {
    return LandingSnippet.class;
  }
  
  @Override
  public String title() {
    return "Landing Page";
  }
}