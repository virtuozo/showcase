package virtuozo.showcase.ui.sample;

import virtuozo.ui.interfaces.HasComponents;

public interface Fragment {
  String title();
  
  void render(HasComponents<?, ?> container);
}
