package virtuozo.showcase.ui.sample.navigation;

import virtuozo.showcase.ui.Bundle;
import virtuozo.showcase.ui.sample.Fragment;
import virtuozo.ui.DropItem;
import virtuozo.ui.FontAwesome;
import virtuozo.ui.Image;
import virtuozo.ui.InputText;
import virtuozo.ui.Navbar;
import virtuozo.ui.api.HasComponents;

public class Navbars implements Fragment {

  public void render(HasComponents<?, ?> target) {
    Navbar navbar = new Navbar().attachTo(target);
    navbar.brand().image(new Image().src(Bundle.images().xsmallLogo()));
    navbar.leftFacet().addButton().text("Button");
    DropItem item = navbar.leftFacet().addDropItem().text("Click me");
    item.menu().addHeader("Header");
    item.menu().addDivider();
    item.menu().addItem().text("Virtuozo");
    navbar.leftFacet().addItem().text("Link");
    navbar.leftFacet().addText().text("Text");
    
    navbar = new Navbar().attachTo(target);
    navbar.brand().icon(FontAwesome.GLOBE);
    navbar.rightFacet().addButton().text("Button");
    item = navbar.rightFacet().addDropItem().text("Click me");
    item.menu().addHeader("Header");
    item.menu().addDivider();
    item.menu().addItem().text("Virtuozo");
    navbar.rightFacet().addItem().text("Link");
    navbar.rightFacet().addText().text("Text");
    
    navbar = new Navbar().attachTo(target).css(Navbar.Type.INVERSE);
    navbar.brand().text("Virtuozo");
    navbar.rightForm().addInput(new InputText().placeholder("Search...")).addButton().text("Go!");
  }
}
