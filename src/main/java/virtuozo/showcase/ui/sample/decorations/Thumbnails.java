package virtuozo.showcase.ui.sample.decorations;

import virtuozo.showcase.ui.Bundle;
import virtuozo.showcase.ui.sample.Fragment;
import virtuozo.ui.Button;
import virtuozo.ui.Heading;
import virtuozo.ui.Paragraph;
import virtuozo.ui.Row;
import virtuozo.ui.Thumbnail;
import virtuozo.ui.ViewPort;
import virtuozo.ui.css.ButtonColor;
import virtuozo.ui.interfaces.HasComponents;

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
	  .add(Paragraph.create().text(Bundle.constants().headline()))
	  .add(Button.create().text("More").css(ButtonColor.PRIMARY));
	  return thumbnail;
  }
  
  @Override
  public String title() {
    return "Thumbnail";
  }
}