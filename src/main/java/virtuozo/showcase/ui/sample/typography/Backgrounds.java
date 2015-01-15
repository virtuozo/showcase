package virtuozo.showcase.ui.sample.typography;

import virtuozo.showcase.ui.sample.Fragment;
import virtuozo.ui.Paragraph;
import virtuozo.ui.css.BackgroundColor;
import virtuozo.ui.interfaces.HasComponents;

public class Backgrounds implements Fragment {

  public void render(HasComponents<?, ?> target) {
    Paragraph.create().text("Virtuozo is awesome").css(BackgroundColor.PRIMARY).attachTo(target);
    Paragraph.create().text("Virtuozo is productive").css(BackgroundColor.INFO).attachTo(target);
    Paragraph.create().text("Virtuozo is super lightweight").css(BackgroundColor.SUCCESS).attachTo(target);
    Paragraph.create().text("Virtuozo is highly performative").css(BackgroundColor.DANGER).attachTo(target);
    Paragraph.create().text("Virtuozo is a SPA framework").css(BackgroundColor.WARNING).attachTo(target);
  }
  
  @Override
  public String title() {
    return "Background Color";
  }
}