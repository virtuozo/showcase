package virtuozo.showcase.ui.sample.decorations;

import virtuozo.interfaces.HasComponents;
import virtuozo.interfaces.Jumbotron;
import virtuozo.interfaces.css.ButtonColor;
import virtuozo.showcase.ui.Bundle;
import virtuozo.showcase.ui.sample.Fragment;

public class Jumbotrons implements Fragment {

  public void render(HasComponents<?, ?> target) {
    Jumbotron hero = Jumbotron.create().attachTo(target);
    hero.addHeading().text("Virtuozo");
    hero.addText().text(Bundle.words().headline());
    hero.addButton().css(ButtonColor.PRIMARY).text("Learn more");
  }
  
  @Override
  public String title() {
    return "Jumbotron";
  }
}
