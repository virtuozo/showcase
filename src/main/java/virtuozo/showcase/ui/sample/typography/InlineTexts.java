package virtuozo.showcase.ui.sample.typography;

import virtuozo.interfaces.HasComponents;
import virtuozo.interfaces.InlineText;
import virtuozo.interfaces.Paragraph;
import virtuozo.interfaces.css.TextTransform;
import virtuozo.showcase.ui.sample.Fragment;

public class InlineTexts implements Fragment {

  public void render(HasComponents<?, ?> target) {
    InlineText.create().text("InlineText class is a kind of text").marked(" builder").text(" that gives you")
    .deleted(" the boring").strikethrough(" and unpleasant way").inserted(" the ability to build rich text").underlined(" using the fluent API.")
    .small(" Did you see that I am creating").bold(" a long text").italicized(" using a simple instance?").attachTo(target);
    
    Paragraph.create().text("What about a lowercased text?").css(TextTransform.LOWERCASE).attachTo(target);
    Paragraph.create().text("What about a uppercased text?").css(TextTransform.UPPERCASE).attachTo(target);
    Paragraph.create().text("So, you can also use a capitalized text.").css(TextTransform.CAPITALIZE).attachTo(target);
  }
  
  @Override
  public String title() {
    return "Inline Text";
  }
}
