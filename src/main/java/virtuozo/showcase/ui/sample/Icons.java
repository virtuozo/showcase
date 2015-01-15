package virtuozo.showcase.ui.sample;

import virtuozo.showcase.ui.Example;
import virtuozo.showcase.ui.sample.icons.FontsAwesome;
import virtuozo.showcase.ui.sample.icons.Glyphicons;
import virtuozo.ui.FontAwesome;

public class Icons implements Sample {
  
  @Override
  public String title() {
    return "Icons";
  }
  
  @Override
  public FontAwesome icon() {
    return FontAwesome.PICTURE_O;
  }
  
  @Override
  public void attach(Sampler target) {
    Example.create(target).load(new Glyphicons());
    Example.create(target).load(new FontsAwesome());
  }
}
