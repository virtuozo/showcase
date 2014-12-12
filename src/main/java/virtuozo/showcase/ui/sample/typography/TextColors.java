package virtuozo.showcase.ui.sample.typography;

import virtuozo.showcase.ui.sample.Fragment;
import virtuozo.ui.Paragraph;
import virtuozo.ui.api.HasComponents;
import virtuozo.ui.css.TextColor;

public class TextColors implements Fragment {

  public void render(HasComponents<?, ?> target) {
    new Paragraph().text("Virtuozo is awesome").css(TextColor.PRIMARY).attachTo(target);
    new Paragraph().text("Virtuozo is productive").css(TextColor.INFO).attachTo(target);
    new Paragraph().text("Virtuozo is super lightweight").css(TextColor.SUCCESS).attachTo(target);
    new Paragraph().text("Virtuozo is highly performative").css(TextColor.DANGER).attachTo(target);
    new Paragraph().text("Virtuozo is a SPA framework").css(TextColor.WARNING).attachTo(target);
    new Paragraph().text("Virtuozo was built for Java Lovers").css(TextColor.MUTED).attachTo(target);
  }
}
