package virtuozo.showcase.ui.sample.layouts;

import virtuozo.showcase.ui.Bundle;
import virtuozo.showcase.ui.sample.Fragment;
import virtuozo.ui.MediaList;
import virtuozo.ui.MediaList.Media;
import virtuozo.ui.MediaList.Media.Alignment;
import virtuozo.ui.MediaList.Media.Floating;
import virtuozo.ui.interfaces.HasComponents;

public class MediaLists implements Fragment {

  public void render(HasComponents<?, ?> target) {
	  MediaList list = MediaList.create().attachTo(target);
	  Media media = list.addMedia();
	  this.configure(media);
	  
	  Media nested = media.body().addMedia();
	  this.configure(nested);
	  
	  media = list.addMedia(Floating.RIGHT);
	  this.configure(media);
	  
	  media = list.addMedia();
	  this.configure(media);
	  media.body().addText().text(Bundle.constants().sampleLongText());
	  
	  media = list.addMedia().css(Alignment.MIDDLE);
	  this.configure(media);
	  media.body().addText().text(Bundle.constants().sampleLongText());
	  
	  media = list.addMedia().css(Alignment.BOTTOM);
	  this.configure(media);
	  media.body().addText().text(Bundle.constants().sampleLongText());
  }
  
  private void configure(Media media){
	  media.object().addImage().src(Bundle.images().smallLogo());
	  media.body().addHeading().text("Virtuozo");
	  media.body().addText().text(Bundle.constants().headline());
  }
  
  @Override
  public String title() {
    return "Media List";
  }
}
