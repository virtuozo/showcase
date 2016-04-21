package virtuozo.showcase.ui.sample.actions;

import virtuozo.interfaces.Button;
import virtuozo.interfaces.HasComponents;
import virtuozo.interfaces.css.ButtonColor;
import virtuozo.showcase.ui.sample.Fragment;

public class Buttons implements Fragment {

  public void render(HasComponents<?, ?> target) {
    Button.create().attachTo(target).text("DEFAULT");
    Button.create().attachTo(target).text("DANGER").css(ButtonColor.DANGER);
    Button.create().attachTo(target).text("INFO").css(ButtonColor.INFO);
    Button.create().attachTo(target).text("PRIMARY").css(ButtonColor.PRIMARY);
    Button.create().attachTo(target).text("SUCCESS").css(ButtonColor.SUCCESS);
    Button.create().attachTo(target).text("WARNING").css(ButtonColor.WARNING);
    Button.create().attachTo(target).text("LINK").css(ButtonColor.LINK);
    
    Button.create().attachTo(target).text("XSMALL").css(Button.Size.X_SMALL);
    Button.create().attachTo(target).text("SMALL").css(Button.Size.SMALL);
    Button.create().attachTo(target).text("LARGE").css(Button.Size.LARGE);
    
    Button.create().attachTo(target).text("ACTIVE").activate();
    Button.create().attachTo(target).text("DISABLED").disable();
    
    Button.toggleable().attachTo(target).text("TOGGLE");
  }
  
  @Override
  public String title() {
    return "Button";
  }
}
