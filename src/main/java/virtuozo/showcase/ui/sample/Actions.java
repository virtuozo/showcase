package virtuozo.showcase.ui.sample;

import virtuozo.interfaces.FontAwesome;
import virtuozo.showcase.ui.Example;
import virtuozo.showcase.ui.sample.actions.ButtonGroups;
import virtuozo.showcase.ui.sample.actions.Buttons;
import virtuozo.showcase.ui.sample.actions.DropDowns;
import virtuozo.showcase.ui.sample.actions.Modals;
import virtuozo.showcase.ui.sample.actions.SplitButtons;
import virtuozo.showcase.ui.sample.actions.Toolbars;

public class Actions implements Sample {
  
  @Override
  public String title() {
    return "Actions";
  }
  
  @Override
  public FontAwesome icon() {
    return FontAwesome.COG;
  }
  
  @Override
  public void attach(Sampler target) {
    Example.create(target).load(new Buttons());
    Example.create(target).load(new DropDowns());
    
    Example.create(target).load(new SplitButtons());
    Example.create(target).load(new ButtonGroups());
    
    Example.create(target).load(new Toolbars());
    Example.create(target).load(new Modals());
  }
}
