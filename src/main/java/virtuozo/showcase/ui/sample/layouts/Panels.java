package virtuozo.showcase.ui.sample.layouts;

import virtuozo.showcase.ui.sample.Fragment;
import virtuozo.ui.Heading;
import virtuozo.ui.ListGroup;
import virtuozo.ui.ListGroup.ListGroupItem;
import virtuozo.ui.Panel;
import virtuozo.ui.Paragraph;
import virtuozo.ui.Table;
import virtuozo.ui.Table.Row;
import virtuozo.ui.interfaces.HasComponents;

public class Panels implements Fragment {

  public void render(HasComponents<?, ?> target) {
    Panel panel = Panel.create().attachTo(target);
    panel.body().add(Paragraph.create().text("It is a simple panel."));
    
    panel = Panel.create().attachTo(target);
    panel.header().add(Heading.four().text("Heading"));
    panel.body().add(Paragraph.create().text("It is a panel with header."));
    
    panel = Panel.create().attachTo(target);
    panel.body().add(Paragraph.create().text("It is a panel with footer."));
    panel.footer().add(Heading.four().text("Footer"));
    
    panel = Panel.create().attachTo(target);
    panel.header().text("Heading");
    panel.body().add(Paragraph.create().text("It is a panel with header and footer."));
    panel.footer().add(Heading.four().text("Footer"));
    
    panel = Panel.create().attachTo(target).css(Panel.Color.PRIMARY);
    panel.header().text("Heading");
    panel.body().add(Paragraph.create().text("It is a colorful panel."));
    
    panel = Panel.create().attachTo(target).css(Panel.Color.DANGER);
    panel.header().text("Heading");
    panel.body().add(Paragraph.create().text("It is a colorful panel."));
    
    panel = Panel.create().attachTo(target).css(Panel.Color.SUCCESS);
    panel.header().text("Heading");
    panel.body().add(Paragraph.create().text("It is a colorful panel."));
    
    panel = Panel.create().attachTo(target).css(Panel.Color.WARNING);
    panel.header().text("Heading");
    panel.body().add(Paragraph.create().text("It is a colorful panel with header and footer."));
    panel.footer().add(Heading.four().text("Footer"));
    
    panel = Panel.create().attachTo(target);
    panel.header().text("Heading");
    panel.body().add(Paragraph.create().text("It is a panel with a table."));
    Table table = panel.addTable();
    table.caption().text("Panel with table");
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
    
    panel = Panel.create().attachTo(target);
    panel.body().add(Paragraph.create().text("It is a panel with a list group"));
    ListGroup group = panel.addListGroup();
    ListGroupItem item = group.addItem();
    item.addBadge().text("1");
    item.addText().text("Cras justo odio");
    item = group.addItem();
    item.addBadge().text("2");
    item.addText().text("Dapibus ac facilisis in");
  }
  
  @Override
  public String title() {
    return "Panel";
  }
}