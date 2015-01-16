package virtuozo.showcase.ui.sample;

import virtuozo.ui.FontAwesome;


public class Ajax implements Sample {
  
  @Override
  public String title() {
    return "Ajax";
  }
  
  @Override
  public FontAwesome icon() {
    return FontAwesome.WIFI;
  }
  
  @Override
  public void attach(Sampler target) {
    
  }
}
