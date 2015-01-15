package virtuozo.showcase.ui.sample.info;

import virtuozo.showcase.ui.sample.Fragment;
import virtuozo.ui.Alert;
import virtuozo.ui.InlineText;
import virtuozo.ui.interfaces.HasComponents;

public class Alerts implements Fragment {

  public void render(HasComponents<?, ?> target) {
    Alert.danger().attachTo(target).add(InlineText.create().bold("Oh snap!").text(" Change a few things up and try again."));
    Alert.info().attachTo(target).add(InlineText.create().bold("Heads up!").text(" This alert needs your attention, but it's not super important."));
    Alert.success().attachTo(target).add(InlineText.create().bold("Well done!").text(" You made a good choice on Virtuozo."));
    Alert.warning().attachTo(target).add(InlineText.create().bold("Warning!").text(" Better check yourself, you are not looking too good."));
    
    Alert.warning().attachTo(target).add(InlineText.create().bold("Warning!").text(" Are you good to close this alert?.")).closeable();
  }

  @Override
  public String title() {
    return "Alert";
  }
}
