package virtuozo.showcase.ui.sample.decorations;

import virtuozo.interfaces.HasComponents;
import virtuozo.interfaces.Label;
import virtuozo.showcase.ui.sample.Fragment;

public class Labels implements Fragment {

  public void render(HasComponents<?, ?> target) {
    Label.create().attachTo(target).text("Default");
    Label.create().attachTo(target).text("Primary").css(Label.Color.PRIMARY);
    Label.create().attachTo(target).text("Success").css(Label.Color.SUCCESS);
    Label.create().attachTo(target).text("Info").css(Label.Color.INFO);
    Label.create().attachTo(target).text("Warning").css(Label.Color.WARNING);
    Label.create().attachTo(target).text("Danger").css(Label.Color.DANGER);
  }
  
  @Override
  public String title() {
    return "Label";
  }
}
