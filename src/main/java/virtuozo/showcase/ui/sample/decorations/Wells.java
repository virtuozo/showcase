package virtuozo.showcase.ui.sample.decorations;

import virtuozo.interfaces.HasComponents;
import virtuozo.interfaces.Paragraph;
import virtuozo.interfaces.Well;
import virtuozo.showcase.ui.sample.Fragment;

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