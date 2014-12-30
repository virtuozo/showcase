package virtuozo.showcase.ui.sample.layouts;

import virtuozo.showcase.ui.sample.Fragment;
import virtuozo.ui.Table;
import virtuozo.ui.Table.Row;
import virtuozo.ui.api.HasComponents;

public class Tables implements Fragment {

  public void render(HasComponents<?, ?> target) {
    this.createSample("Base").attachTo(target);
    this.createSample("Stripped").stripped().attachTo(target);
    this.createSample("Bordered").bordered().attachTo(target);
    this.createSample("Hover").hover().attachTo(target);
    this.createSample("Condensed").condensed().attachTo(target);
  }
  
  private Table createSample(String caption){
	  Table table = new Table();
	  table.caption().text(caption);
	  Row header = table.header().addRow();
	  header.addCell().text("#");
	  header.addCell().text("First Name");
	  header.addCell().text("Last Name");
	  header.addCell().text("Username");
	  
	  Row body = table.body().addRow();
	  body.addCell().text("1");
	  body.addCell().text("Anderson");
	  body.addCell().text("Braz");
	  body.addCell().text("@mrbraz");
	  
	  return table;
  }
}
