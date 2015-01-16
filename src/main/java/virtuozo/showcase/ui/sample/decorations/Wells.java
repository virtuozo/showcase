package virtuozo.showcase.ui.sample.decorations;

import virtuozo.showcase.ui.sample.Fragment;
import virtuozo.ui.Paragraph;
import virtuozo.ui.Well;
import virtuozo.ui.interfaces.HasComponents;

public class Wells implements Fragment {

  public void render(HasComponents<?, ?> target) {
    Well.create().attachTo(target).add(Paragraph.create().text("Look, I am in a well"));
    Well.create().attachTo(target).add(Paragraph.create().text("Look, I am in a large well")).css(Well.Size.LARGE);
    Well.create().attachTo(target).add(Paragraph.create().text("Look, I am in a small well")).css(Well.Size.SMALL);
  }
  
  @Override
  public String title() {
    return "Well";
  }
}