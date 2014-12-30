package virtuozo.showcase.ui.sample.navigation;

import virtuozo.showcase.ui.sample.Fragment;
import virtuozo.ui.Breadcrumb;
import virtuozo.ui.api.HasComponents;

public class Breadcrumbs implements Fragment {

  public void render(HasComponents<?, ?> target) {
    Breadcrumb nav = new Breadcrumb().attachTo(target);
    nav.addItem().text("Home");
    
    nav = new Breadcrumb().attachTo(target);
    nav.addLink().text("Home");
    nav.addItem().text("Documentation");
    
    nav = new Breadcrumb().attachTo(target);
    nav.addLink().text("Home");
    nav.addLink().text("Documentation");
    nav.addItem().text("Navigation");
  }
}
