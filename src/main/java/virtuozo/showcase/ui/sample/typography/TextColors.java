package virtuozo.showcase.ui.sample.typography;

import virtuozo.showcase.ui.sample.Fragment;
import virtuozo.ui.Paragraph;
import virtuozo.ui.css.TextColor;
import virtuozo.ui.interfaces.HasComponents;

public class TextColors implements Fragment {

  public void render(HasComponents<?, ?> target) {
    Paragraph.create().text("Virtuozo is awesome").css(TextColor.PRIMARY).attachTo(target);
    Paragraph.create().text("Virtuozo is productive").css(TextColor.INFO).attachTo(target);
    Paragraph.create().text("Virtuozo is super lightweight").css(TextColor.SUCCESS).attachTo(target);
    Paragraph.create().text("Virtuozo is highly performative").css(TextColor.DANGER).attachTo(target);
    Paragraph.create().text("Virtuozo is a SPA framework").css(TextColor.WARNING).attachTo(target);
    Paragraph.create().text("Virtuozo was built for Java Lovers").css(TextColor.MUTED).attachTo(target);
  }
  
  @Override
  public String title() {
    return "Text Color";
  }
}