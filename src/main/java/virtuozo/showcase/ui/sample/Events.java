package virtuozo.showcase.ui.sample;

import virtuozo.ui.FontAwesome;


public class Events implements Sample {
  
  @Override
  public String title() {
    return "Events";
  }
  
  @Override
  public FontAwesome icon() {
    return FontAwesome.BELL;
  }
  
  @Override
  public void attach(Sampler target) {
    
  }
}
