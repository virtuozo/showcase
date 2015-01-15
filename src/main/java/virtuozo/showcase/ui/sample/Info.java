package virtuozo.showcase.ui.sample;

import virtuozo.showcase.ui.Example;
import virtuozo.showcase.ui.sample.info.Alerts;
import virtuozo.showcase.ui.sample.info.Notifications;
import virtuozo.showcase.ui.sample.info.Popovers;
import virtuozo.showcase.ui.sample.info.Progressbars;
import virtuozo.showcase.ui.sample.info.Tooltips;
import virtuozo.ui.FontAwesome;

public class Info implements Sample {
  
  @Override
  public String title() {
    return "Alert";
  }
  
  @Override
  public FontAwesome icon() {
    return FontAwesome.WARNING;
  }
  
  @Override
  public void attach(Sampler target) {
    Example.create(target).load(new Tooltips());
    Example.create(target).load(new Popovers());
    
    Example.create(target).load(new Alerts());
    Example.create(target).load(new Progressbars());
    
    Example.create(target).load(new Notifications());
  }
}
