package virtuozo.showcase.ui.sample;

import virtuozo.interfaces.FontAwesome;

public interface Sample {
  String title();
  
  FontAwesome icon();
  
  void attach(Sampler target);
}
