package virtuozo.showcase.ui.sample.decorations;

import virtuozo.interfaces.Button;
import virtuozo.interfaces.HasComponents;
import virtuozo.interfaces.Heading;
import virtuozo.interfaces.Paragraph;
import virtuozo.interfaces.Row;
import virtuozo.interfaces.Thumbnail;
import virtuozo.interfaces.ViewPort;
import virtuozo.interfaces.css.ButtonColor;
import virtuozo.showcase.ui.Bundle;
import virtuozo.showcase.ui.sample.Fragment;

public class Thumbnails implements Fragment {

  public void render(HasComponents<?, ?> target) {
    Row grid = Row.create().attachTo(target);
    grid.addColumn().span(4, ViewPort.SMALL).add(this.createSample());
    grid.addColumn().span(4, ViewPort.SMALL).add(this.createSample());
    grid.addColumn().span(4, ViewPort.SMALL).add(this.createSample());
    
    grid = Row.create().attachTo(target);
    grid.addColumn().span(4, ViewPort.SMALL).add(this.createCaption());
    grid.addColumn().span(4, ViewPort.SMALL).add(this.createCaption());
    grid.addColumn().span(4, ViewPort.SMALL).add(this.createCaption());
  }
  
  private Thumbnail createSample(){
	  Thumbnail thumbnail = Thumbnail.create();
	  thumbnail.image().src(Bundle.samples().largeHusky());
	  return thumbnail;
  }
  
  private Thumbnail createCaption(){
	  Thumbnail thumbnail = Thumbnail.create();
	  thumbnail.image().src(Bundle.samples().largeYork());
	  thumbnail.caption().add(Heading.three().text("Virtuozo"))
	  .add(Paragraph.create().text(Bundle.words().headline()))
	  .add(Button.create().text("More").css(ButtonColor.PRIMARY));
	  return thumbnail;
  }
  
  @Override
  public String title() {
    return "Thumbnail";
  }
}