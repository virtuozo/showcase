package virtuozo.showcase.ui.sample.actions;

import virtuozo.showcase.ui.sample.Fragment;
import virtuozo.ui.ButtonGroup;
import virtuozo.ui.interfaces.HasComponents;

public class ButtonGroups implements Fragment {

  public void render(HasComponents<?, ?> target) {
    ButtonGroup group = ButtonGroup.horizontal().attachTo(target);
    group.addButton().text("Button");
    group.addDropButton().text("Dropdown").menu().addItem().text("Menu Item");
    group.addSplitButton().text("SplitButton").menu().addItem().text("MenuItem");
    
    group = ButtonGroup.block().attachTo(target).checkbox();
    group.addButton().text("Option 1 (pre checked)").activate();
    group.addButton().text("Option 2");
    group.addButton().text("Option 3");
    
    group = ButtonGroup.horizontal().attachTo(target).radio();
    group.addButton().text("Option 1 (pre selected)").activate();
    group.addButton().text("Option 2");
    group.addButton().text("Option 3");
    
    this.createSample(target).css(ButtonGroup.Size.X_SMALL);
    this.createSample(target).css(ButtonGroup.Size.SMALL);
    this.createSample(target).css(ButtonGroup.Size.MEDIUM);
    this.createSample(target).css(ButtonGroup.Size.LARGE);
  }
  
  private ButtonGroup createSample(HasComponents<?, ?> target){
    ButtonGroup group = ButtonGroup.horizontal().attachTo(target);
    group.addButton().text("Left");
    group.addButton().text("Middle");
    group.addButton().text("Right");
    
    return group;
  }
  
  @Override
  public String title() {
    return "Button Group";
  }
}
