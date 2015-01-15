package virtuozo.showcase.ui.sample.icons;

import virtuozo.showcase.ui.sample.Fragment;
import virtuozo.ui.Glyphicon;
import virtuozo.ui.interfaces.HasComponents;
import virtuozo.ui.interfaces.Icon;

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
