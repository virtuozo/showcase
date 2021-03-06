package virtuozo.showcase.ui.sample.layouts;

import virtuozo.interfaces.Navbar;
import virtuozo.interfaces.OrderList;
import virtuozo.interfaces.PageHeader;
import virtuozo.interfaces.SidePageLayout;

import com.google.gwt.core.client.EntryPoint;

public class SideSnippet implements EntryPoint {
  @Override
  public void onModuleLoad() {
    SidePageLayout layout = SidePageLayout.create().attach();
    
    //Build your own top area
    Navbar navbar = Navbar.create();
    navbar.brand().text("VIRTUOZO");
    layout.top().add(navbar);
    
    //Build your own header (hero)
    OrderList left = OrderList.unordered();
    left.addItem().text("Overview");
    layout.left().css("hero").add(left);
    
    //Build your own body
    layout.main().add(PageHeader.create().text("Overview"));
  }
}