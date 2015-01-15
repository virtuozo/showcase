package virtuozo.showcase.ui.sample;

import virtuozo.showcase.ui.Example;
import virtuozo.showcase.ui.sample.navigation.Breadcrumbs;
import virtuozo.showcase.ui.sample.navigation.Navbars;
import virtuozo.showcase.ui.sample.navigation.Paginations;
import virtuozo.showcase.ui.sample.navigation.Pills;
import virtuozo.showcase.ui.sample.navigation.Tabs;
import virtuozo.showcase.ui.sample.navigation.Wizards;
import virtuozo.ui.FontAwesome;

public class Navigation implements Sample {
  
  @Override
  public String title() {
    return "Navigation";
  }
  
  @Override
  public FontAwesome icon() {
    return FontAwesome.LINK;
  }
  
  @Override
  public void attach(Sampler target) {
    Example.create(target).load(new Tabs());
    Example.create(target).load(new Pills());
    
    Example.create(target).load(new Navbars());
    Example.create(target).load(new Breadcrumbs());
    
    Example.create(target).load(new Paginations());
    Example.create(target).load(new Wizards());
  }
}
