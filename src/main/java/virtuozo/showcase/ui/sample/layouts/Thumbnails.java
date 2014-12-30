package virtuozo.showcase.ui.sample.layouts;

import virtuozo.showcase.ui.Bundle;
import virtuozo.showcase.ui.sample.Fragment;
import virtuozo.ui.Button;
import virtuozo.ui.Heading;
import virtuozo.ui.Heading.Level;
import virtuozo.ui.Paragraph;
import virtuozo.ui.Row;
import virtuozo.ui.Thumbnail;
import virtuozo.ui.ViewPort;
import virtuozo.ui.api.HasComponents;
import virtuozo.ui.css.ButtonColor;

public class Thumbnails implements Fragment {

  public void render(HasComponents<?, ?> target) {
    Row grid = new Row().attachTo(target);
    grid.addColumn().span(4, ViewPort.SMALL).add(this.createSample());
    grid.addColumn().span(4, ViewPort.SMALL).add(this.createSample());
    grid.addColumn().span(4, ViewPort.SMALL).add(this.createSample());
    
    grid = new Row().attachTo(target);
    grid.addColumn().span(4, ViewPort.SMALL).add(this.createCaption());
    grid.addColumn().span(4, ViewPort.SMALL).add(this.createCaption());
    grid.addColumn().span(4, ViewPort.SMALL).add(this.createCaption());
  }
  
  private Thumbnail createSample(){
	  Thumbnail thumbnail = new Thumbnail();
	  thumbnail.image().src(Bundle.images().logo());
	  return thumbnail;
  }
  
  private Thumbnail createCaption(){
	  Thumbnail thumbnail = new Thumbnail();
	  thumbnail.image().src(Bundle.images().logo());
	  thumbnail.caption().add(new Heading(Level.THREE).text("Virtuozo"))
	  .add(new Paragraph().text(Bundle.constants().headline()))
	  .add(new Button().text("More").css(ButtonColor.PRIMARY));
	  return thumbnail;
  }
}