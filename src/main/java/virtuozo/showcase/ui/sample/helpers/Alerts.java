package virtuozo.showcase.ui.sample.helpers;

import virtuozo.showcase.ui.sample.Fragment;
import virtuozo.ui.Alert;
import virtuozo.ui.InlineText;
import virtuozo.ui.api.HasComponents;

public class Alerts implements Fragment {

  public void render(HasComponents<?, ?> target) {
    new Alert().attachTo(target).css(Alert.Color.DANGER).add(new InlineText().bold("Oh snap!").text(" Change a few things up and try again."));
    new Alert().attachTo(target).css(Alert.Color.INFO).add(new InlineText().bold("Heads up!").text(" This alert needs your attention, but it's not super important."));
    new Alert().attachTo(target).css(Alert.Color.SUCCESS).add(new InlineText().bold("Well done!").text(" You made a good choice on Virtuozo."));
    new Alert().attachTo(target).css(Alert.Color.WARNING).add(new InlineText().bold("Warning!").text(" Better check yourself, you are not looking too good."));
    
    new Alert().attachTo(target).css(Alert.Color.WARNING).add(new InlineText().bold("Warning!").text(" Are you good to close this alert?.")).closeable();
  }
}
