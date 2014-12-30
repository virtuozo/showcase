package virtuozo.showcase.ui.sample.typography;

import virtuozo.showcase.ui.sample.Fragment;
import virtuozo.ui.Paragraph;
import virtuozo.ui.api.HasComponents;
import virtuozo.ui.css.TextAlignment;

public class Paragraphs implements Fragment {

  public void render(HasComponents<?, ?> target) {
    new Paragraph().text("This is a lead paragraph.").lead().attachTo(target);
    new Paragraph().text("This is a simple paragraph.").attachTo(target);
    new Paragraph().text("This is a center aligned paragraph.").css(TextAlignment.CENTER).attachTo(target);
    new Paragraph().text("This is a right aligned paragraph.").css(TextAlignment.RIGHT).attachTo(target);
    new Paragraph().text("This is a justified paragraph. Nullam quis risus eget urna mollis ornare vel eu leo. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Nullam id dolor id nibh ultricies vehicula.").css(TextAlignment.JUSTIFY).attachTo(target);
  }
}