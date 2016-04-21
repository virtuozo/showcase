package virtuozo.showcase.ui.sample.icons;

import virtuozo.interfaces.Glyphicon;
import virtuozo.interfaces.HasComponents;
import virtuozo.interfaces.Icon;
import virtuozo.showcase.ui.sample.Fragment;

public class Glyphicons implements Fragment {
  public void render(HasComponents<?, ?> target) {
    IconsList list = new IconsList().attachTo(target);
    
    for(Icon icon : Glyphicon.values()){
      list.add(icon);
    }
  }
  
  @Override
  public String title() {
    return "Glyphicons";
  }
}
