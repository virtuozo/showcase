package virtuozo.showcase.ui.sample;

import virtuozo.ui.FontAwesome;

public interface Sample {
  String title();
  
  FontAwesome icon();
  
  void attach(Sampler target);
}
