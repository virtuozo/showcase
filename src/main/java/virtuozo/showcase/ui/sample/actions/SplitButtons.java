package virtuozo.showcase.ui.sample.actions;

import virtuozo.interfaces.HasComponents;
import virtuozo.interfaces.SplitButton;
import virtuozo.interfaces.css.ButtonColor;
import virtuozo.showcase.ui.sample.Fragment;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;

public class SplitButtons implements Fragment {

  public void render(HasComponents<?, ?> target) {
    this.createSample(target);
    this.createSample(target).css(ButtonColor.DANGER);
    this.createSample(target).css(ButtonColor.INFO);
    this.createSample(target).css(ButtonColor.PRIMARY);
    this.createSample(target).css(ButtonColor.SUCCESS);
    this.createSample(target).css(ButtonColor.WARNING);
    this.createSample(target).up();
  }
  
  private SplitButton createSample(HasComponents<?, ?> target){
    SplitButton split = SplitButton.create().attachTo(target).text("Action");
    split.menu().addHeader("Menu Header");
    split.menu().addItem().text("Menu item").onClick(new ClickHandler() {
      @Override
      public void onClick(ClickEvent event) {
        Window.alert("Menu item clicked");
      }
    });
    split.menu().addDivider();
    split.menu().addItem().text("Disabled menu item").disable().onClick(new ClickHandler() {
      
      @Override
      public void onClick(ClickEvent event) {
        Window.alert("This event is not fired...");
      }
    });
    
    return split;
  }
  
  @Override
  public String title() {
    return "Split Button";
  }
}
