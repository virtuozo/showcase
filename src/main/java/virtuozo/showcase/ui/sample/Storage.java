package virtuozo.showcase.ui.sample;

import virtuozo.interfaces.FontAwesome;


public class Storage implements Sample {
  
  @Override
  public String title() {
    return "Storage";
  }
  
  @Override
  public FontAwesome icon() {
    return FontAwesome.DATABASE;
  }
  
  @Override
  public void attach(Sampler target) {
    
  }
}
