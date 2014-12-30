package virtuozo.showcase.ui.sample.layouts;

import virtuozo.showcase.ui.sample.Fragment;
import virtuozo.ui.Label;
import virtuozo.ui.api.HasComponents;

public class Labels implements Fragment {

  public void render(HasComponents<?, ?> target) {
    new Label().attachTo(target).text("Default");
    new Label().attachTo(target).text("Primary").css(Label.Color.PRIMARY);
    new Label().attachTo(target).text("Success").css(Label.Color.SUCCESS);
    new Label().attachTo(target).text("Info").css(Label.Color.INFO);
    new Label().attachTo(target).text("Warning").css(Label.Color.WARNING);
    new Label().attachTo(target).text("Danger").css(Label.Color.DANGER);
  }
}
