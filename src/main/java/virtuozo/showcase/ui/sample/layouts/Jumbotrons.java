package virtuozo.showcase.ui.sample.layouts;

import virtuozo.showcase.ui.Bundle;
import virtuozo.showcase.ui.sample.Fragment;
import virtuozo.ui.Jumbotron;
import virtuozo.ui.css.ButtonColor;
import virtuozo.ui.interfaces.HasComponents;

public class Jumbotrons implements Fragment {

  public void render(HasComponents<?, ?> target) {
    Jumbotron hero = Jumbotron.create().attachTo(target);
    hero.addHeading().text("Virtuozo");
    hero.addText().text(Bundle.constants().headline());
    hero.addButton().css(ButtonColor.PRIMARY).text("Learn more");
  }
  
  @Override
  public String title() {
    return "Jumbotron";
  }
}
