package virtuozo.showcase.ui.sample;

import virtuozo.interfaces.UIComponent;

public interface Sampler {
  void add(UIComponent component);
  
  void add(Fragment fragment, UIComponent sample);
}
