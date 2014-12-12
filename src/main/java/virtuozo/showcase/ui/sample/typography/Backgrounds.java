package virtuozo.showcase.ui.sample.typography;

import virtuozo.showcase.ui.sample.Fragment;
import virtuozo.ui.Paragraph;
import virtuozo.ui.api.HasComponents;
import virtuozo.ui.css.BackgroundColor;

public class Backgrounds implements Fragment {

  public void render(HasComponents<?, ?> target) {
    new Paragraph().text("Virtuozo is awesome").css(BackgroundColor.PRIMARY).attachTo(target);
    new Paragraph().text("Virtuozo is productive").css(BackgroundColor.INFO).attachTo(target);
    new Paragraph().text("Virtuozo is super lightweight").css(BackgroundColor.SUCCESS).attachTo(target);
    new Paragraph().text("Virtuozo is highly performative").css(BackgroundColor.DANGER).attachTo(target);
    new Paragraph().text("Virtuozo is a SPA framework").css(BackgroundColor.WARNING).attachTo(target);
  }
}
