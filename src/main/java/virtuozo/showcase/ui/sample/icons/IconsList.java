package virtuozo.showcase.ui.sample.icons;

import virtuozo.ui.Component;
import virtuozo.ui.OrderList;
import virtuozo.ui.OrderList.ListItem;
import virtuozo.ui.Text;
import virtuozo.ui.interfaces.Icon;

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
