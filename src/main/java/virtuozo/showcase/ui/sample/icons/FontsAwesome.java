package virtuozo.showcase.ui.sample.icons;

import virtuozo.showcase.ui.sample.Fragment;
import virtuozo.ui.FontAwesome;
import virtuozo.ui.interfaces.HasComponents;
import virtuozo.ui.interfaces.Icon;

public class FontsAwesome implements Fragment {

  public void render(HasComponents<?, ?> target) {
    IconsList list = new IconsList().attachTo(target);
    
    for(Icon icon : FontAwesome.values()){
      list.add(icon);
    }
  }
  
  @Override
  public String title() {
    return "Fontawesome";
  }
}
