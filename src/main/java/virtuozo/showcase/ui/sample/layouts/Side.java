package virtuozo.showcase.ui.sample.layouts;

import virtuozo.showcase.ui.Bundle;
import virtuozo.showcase.ui.sample.Snippet;
import virtuozo.ui.MediaList;
import virtuozo.ui.MediaList.Media;
import virtuozo.ui.interfaces.HasComponents;

import com.google.gwt.dom.client.Style.VerticalAlign;

public class Side implements Snippet {

  public void render(HasComponents<?, ?> target) {
    MediaList list = MediaList.create().attachTo(target);
    Media media = list.addMedia();
    media.object().addImage().src(Bundle.samples().side());
    media.body().style().verticalAlign(VerticalAlign.MIDDLE);
    media.body().addHeading().text("Side Page Layout");
    media.body().addText().text("This layout provides a top area, a left (sidebar) area and a main area into the body.");
  }
  
  @Override
  public Class<?> snippet() {
    return SideSnippet.class;
  }
  
  @Override
  public String title() {
    return "Sidebar";
  }
}
