package virtuozo.showcase.ui.sample.typography;

import virtuozo.interfaces.Code;
import virtuozo.interfaces.HasComponents;
import virtuozo.showcase.ui.sample.Fragment;

public class Codes implements Fragment {

  public void render(HasComponents<?, ?> target) {
    Code.create().text("Code class is similar to InlineText, but it was created to wrap some").inline("code")
    .text(" and instruct user to not use the combination of ").keyboard("CTRL").text(" + ").keyboard("W").text(" keys.")
    .text(" It is common when you are programming, to use some variables like: String").variable(" s").text(" = \"Virtuozo\"")
    .text("and when you do System.out.println(s) the result is: ").output(" Virtuozo")
    .attachTo(target);
  }
  
  @Override
  public String title() {
    return "Code";
  }
}
