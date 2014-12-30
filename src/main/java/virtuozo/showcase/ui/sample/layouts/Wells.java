package virtuozo.showcase.ui.sample.layouts;

import virtuozo.showcase.ui.sample.Fragment;
import virtuozo.ui.Paragraph;
import virtuozo.ui.Well;
import virtuozo.ui.api.HasComponents;

public class Wells implements Fragment {

  public void render(HasComponents<?, ?> target) {
    new Well().attachTo(target).add(new Paragraph().text("Look, I am in a well"));
    new Well().attachTo(target).add(new Paragraph().text("Look, I am in a large well")).css(Well.Size.LARGE);
    new Well().attachTo(target).add(new Paragraph().text("Look, I am in a small well")).css(Well.Size.SMALL);
  }
}
