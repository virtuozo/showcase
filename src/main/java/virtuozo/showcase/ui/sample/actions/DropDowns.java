package virtuozo.showcase.ui.sample.actions;

import virtuozo.interfaces.Button;
import virtuozo.interfaces.DropButton;
import virtuozo.interfaces.HasComponents;
import virtuozo.interfaces.css.ButtonColor;
import virtuozo.showcase.ui.sample.Fragment;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;

public class DropDowns implements Fragment {

  public void render(HasComponents<?, ?> target) {
    this.createSample(target);
    this.createSample(target).text("Dropup").up();
    this.createSample(target).css(ButtonColor.DANGER);
    this.createSample(target).css(ButtonColor.INFO);
    this.createSample(target).css(ButtonColor.PRIMARY);
    this.createSample(target).css(ButtonColor.SUCCESS);
    this.createSample(target).css(ButtonColor.WARNING);
    
    this.createSample(target).css(Button.Size.X_SMALL);
    this.createSample(target).css(Button.Size.SMALL);
    this.createSample(target).css(Button.Size.LARGE);
  }
  
  private DropButton createSample(HasComponents<?, ?> target){
    DropButton drop = DropButton.create().attachTo(target).text("Dropdown");
    drop.menu().addHeader("Menu Header");
    drop.menu().addItem().text("Menu item").onClick(new ClickHandler() {
      @Override
      public void onClick(ClickEvent event) {
        Window.alert("Menu item clicked");
      }
    });
    drop.menu().addDivider();
    drop.menu().addItem().text("Disabled menu item").disable().onClick(new ClickHandler() {
      
      @Override
      public void onClick(ClickEvent event) {
        Window.alert("This event is not fired...");
      }
    });
    
    return drop;
  }
  
  @Override
  public String title() {
    return "Dropdown";
  }
}
