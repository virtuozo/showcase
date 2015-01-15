package virtuozo.showcase.ui.sample;

import virtuozo.showcase.ui.Example;
import virtuozo.showcase.ui.sample.forms.Horizontal;
import virtuozo.showcase.ui.sample.forms.Validation;
import virtuozo.showcase.ui.sample.forms.Vertical;
import virtuozo.ui.FontAwesome;

public class Forms implements Sample {
  
  @Override
  public String title() {
    return "Forms";
  }
  
  @Override
  public FontAwesome icon() {
    return FontAwesome.EDIT;
  }
  
  @Override
  public void attach(Sampler target) {
    Example.create(target).load(new Horizontal());
    Example.create(target).load(new Vertical());
    Example.create(target).load(new Validation());
//    Example.create(target).load(new Datepickers());
  }
}
