package virtuozo.showcase.ui.sample.typography;

import virtuozo.showcase.ui.sample.Fragment;
import virtuozo.ui.OrderList;
import virtuozo.ui.OrderList.Type;
import virtuozo.ui.api.HasComponents;

public class Lists implements Fragment {

  public void render(HasComponents<?, ?> target) {
    OrderList list = new OrderList(Type.ORDERED).attachTo(target);
    list.addItem().text("It is an ordered list");
    list.addItem().text("This item has a list as child").addList(Type.ORDERED).addItem().text("It is a second level item");
    
    list = new OrderList(Type.UNORDERED).attachTo(target);
    list.addItem().text("It is an unordered list");
    list.addItem().text("This item has a list as child").addList(Type.UNORDERED).addItem().text("It is a second level item");
    
    list = new OrderList(Type.UNORDERED).css(OrderList.Style.UNSTYLED).attachTo(target);
    list.addItem().text("It is an unstyled list");
    list.addItem().text("This item has a list as child").addList(Type.UNORDERED).addItem().text("It is a second level item");
    
    list = new OrderList(Type.UNORDERED).css(OrderList.Style.INLINE).attachTo(target);
    list.addItem().text("It is an inline list");
    list.addItem().text("Lorem ipsum");
    list.addItem().text("Phasellus iaculis");
  }
}
