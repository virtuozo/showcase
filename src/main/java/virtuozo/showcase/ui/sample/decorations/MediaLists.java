package virtuozo.showcase.ui.sample.decorations;

import virtuozo.interfaces.HasComponents;
import virtuozo.interfaces.MediaList;
import virtuozo.interfaces.MediaList.Media;
import virtuozo.interfaces.MediaList.Media.Alignment;
import virtuozo.interfaces.MediaList.Media.Floating;
import virtuozo.showcase.ui.Bundle;
import virtuozo.showcase.ui.sample.Fragment;

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
	  media.body().addText().text(Bundle.words().sampleLongText());
	  
	  media = list.addMedia().css(Alignment.MIDDLE);
	  this.configure(media);
	  media.body().addText().text(Bundle.words().sampleLongText());
	  
	  media = list.addMedia().css(Alignment.BOTTOM);
	  this.configure(media);
	  media.body().addText().text(Bundle.words().sampleLongText());
  }
  
  private void configure(Media media){
	  media.object().addImage().src(Bundle.samples().smallHusky());
	  media.body().addHeading().text("Virtuozo");
	  media.body().addText().text(Bundle.words().headline());
  }
  
  @Override
  public String title() {
    return "Media List";
  }
}
