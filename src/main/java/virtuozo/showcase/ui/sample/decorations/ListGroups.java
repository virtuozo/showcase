package virtuozo.showcase.ui.sample.decorations;

import virtuozo.interfaces.HasComponents;
import virtuozo.interfaces.ListGroup;
import virtuozo.interfaces.ListGroup.ListGroupItem;
import virtuozo.showcase.ui.Bundle;
import virtuozo.showcase.ui.sample.Fragment;

public class ListGroups implements Fragment {

  public void render(HasComponents<?, ?> target) {
    ListGroup group = ListGroup.create().attachTo(target);
    ListGroupItem item = group.addItem();
    item.addText().text("Cras justo odio");
    item = group.addItem();
    item.addText().text("Dapibus ac facilisis in");
    
    group = ListGroup.create().attachTo(target);
    item = group.addItem();
    item.addBadge().text("1");
    item.addText().text("Cras justo odio");
    item = group.addItem();
    item.addBadge().text("2");
    item.addText().text("Dapibus ac facilisis in");
    
    group = ListGroup.create().attachTo(target);
    item = group.addItem().disable();
    item.addText().text("Cras justo odio");
    item = group.addItem();
    item.addText().text("Dapibus ac facilisis in");
    
    group = ListGroup.create().attachTo(target);
    item = group.addItem().css(ListGroup.ItemColor.DANGER);
    item.addText().text("Cras justo odio");
    item = group.addItem().css(ListGroup.ItemColor.INFO);
    item.addText().text("Dapibus ac facilisis in");
    item = group.addItem().css(ListGroup.ItemColor.SUCCESS);
    item.addText().text("Morbi leo risus");
    item = group.addItem().css(ListGroup.ItemColor.WARNING);
    item.addText().text("Vestibulum at eros");
          
    group = ListGroup.create().attachTo(target);
    item = group.addItem();
    item.addHeading().text("Virtuozo");
    item.addText().text(Bundle.words().headline());
    item = group.addItem();
    item.addBadge().text("2");
    item.addHeading().text("Virtuozo");
    item.addText().text(Bundle.words().headline());
  }
  
  @Override
  public String title() {
    return "List Group";
  }
}