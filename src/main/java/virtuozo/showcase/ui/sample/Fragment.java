package virtuozo.showcase.ui.sample;

import virtuozo.interfaces.HasComponents;

public interface Fragment {
  String title();
  
  void render(HasComponents<?, ?> target);
}
