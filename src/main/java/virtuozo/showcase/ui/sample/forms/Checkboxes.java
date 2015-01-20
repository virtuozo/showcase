package virtuozo.showcase.ui.sample.forms;

import virtuozo.infra.Item;
import virtuozo.showcase.ui.sample.Fragment;
import virtuozo.ui.Checkbox;
import virtuozo.ui.MultiCheckbox;
import virtuozo.ui.interfaces.HasComponents;

public class Checkboxes implements Fragment {

  public void render(HasComponents<?, ?> target) {
    Checkbox.create().attachTo(target).text("Check me").value("checked");
    Checkbox.create().attachTo(target).text("Disabled").disable();
    
    MultiCheckbox.inline().attachTo(target)
    .add(Item.create("1", "Value 1"))
    .add(Item.create("2", "Value 2"));
    
    MultiCheckbox.create().attachTo(target)
    .add(Item.create("1", "Value 1"))
    .add(Item.create("2", "Value 2"));
  }
  
  @Override
  public String title() {
    return "Checkbox";
  }
}
