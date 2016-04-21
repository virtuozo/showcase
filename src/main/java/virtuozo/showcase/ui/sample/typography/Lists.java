package virtuozo.showcase.ui.sample.typography;

import virtuozo.interfaces.HasComponents;
import virtuozo.interfaces.OrderList;
import virtuozo.showcase.ui.sample.Fragment;

public class Lists implements Fragment {

  public void render(HasComponents<?, ?> target) {
    OrderList list = OrderList.ordered().attachTo(target);
    list.addItem().text("It is an ordered list");
    list.addItem().text("This item has a list as child").addOrderedList().addItem().text("It is a second level item");
    
    list = OrderList.unordered().attachTo(target);
    list.addItem().text("It is an unordered list");
    list.addItem().text("This item has a list as child").addUnorderedList().addItem().text("It is a second level item");
    
    list = OrderList.unordered().css(OrderList.Style.UNSTYLED).attachTo(target);
    list.addItem().text("It is an unstyled list");
    list.addItem().text("This item has a list as child").addUnorderedList().addItem().text("It is a second level item");
    
    list = OrderList.unordered().css(OrderList.Style.INLINE).attachTo(target);
    list.addItem().text("It is an inline list");
    list.addItem().text("Lorem ipsum");
    list.addItem().text("Phasellus iaculis");
  }
  
  @Override
  public String title() {
    return "(Un)Order List";
  }
}