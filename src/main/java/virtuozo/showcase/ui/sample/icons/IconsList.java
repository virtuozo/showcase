package virtuozo.showcase.ui.sample.icons;

import virtuozo.interfaces.Component;
import virtuozo.interfaces.Icon;
import virtuozo.interfaces.OrderList;
import virtuozo.interfaces.Text;
import virtuozo.interfaces.OrderList.ListItem;

public class IconsList extends Component<IconsList> {
  private OrderList list = OrderList.unordered().css("bs-icons", "bs-icons-list");
  
  public IconsList() {
    this.incorporate(this.list);
  }
  
  public void add(Icon icon){
    ListItem item = this.list.addItem();
    icon.attachTo(item);
    item.add(Text.create().css("icon-class").text(icon.name().toLowerCase()));
  }
}
