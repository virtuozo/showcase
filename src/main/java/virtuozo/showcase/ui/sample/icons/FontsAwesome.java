package virtuozo.showcase.ui.sample.icons;

import virtuozo.interfaces.FontAwesome;
import virtuozo.interfaces.HasComponents;
import virtuozo.interfaces.Icon;
import virtuozo.showcase.ui.sample.Fragment;

public class FontsAwesome implements Fragment {

  public void render(HasComponents<?, ?> target) {
    IconsList list = new IconsList().attachTo(target);
    
    for(Icon icon : FontAwesome.values()){
      list.add(icon);
    }
  }
  
  @Override
  public String title() {
    return "FontAwesome";
  }
}
