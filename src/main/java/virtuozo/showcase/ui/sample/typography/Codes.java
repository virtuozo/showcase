package virtuozo.showcase.ui.sample.typography;

import virtuozo.showcase.ui.sample.Fragment;
import virtuozo.ui.Code;
import virtuozo.ui.Paragraph;
import virtuozo.ui.api.HasComponents;
import virtuozo.ui.css.TextTransform;

public class Codes implements Fragment {

  public void render(HasComponents<?, ?> target) {
    new Code().text("Code class is similar to InlineText, but it was created to wrap some").inline("code")
    .text(" and instruct user to not use the combination of ").keyboard("CTRL").text(" + ").keyboard("W").text(" keys.")
    .text(" It is common when you are programming, to use some variables like: String").variable(" s").text(" = \"Virtuozo\"")
    .text("and when you do System.out.println(s) the result is: ").output(" Virtuozo")
    .attachTo(target);
    
    new Paragraph().text("What about a lowercased text?").css(TextTransform.LOWERCASE).attachTo(target);
    new Paragraph().text("What about a uppercased text?").css(TextTransform.UPPERCASE).attachTo(target);
    new Paragraph().text("So, you can also use a capitalized text.").css(TextTransform.CAPITALIZE).attachTo(target);
  }
}
