package virtuozo.showcase.ui.sample.decorations;

import virtuozo.interfaces.HasComponents;
import virtuozo.interfaces.PageHeader;
import virtuozo.showcase.ui.sample.Fragment;

public class PageHeaders implements Fragment {

  public void render(HasComponents<?, ?> target) {
    PageHeader.create().attachTo(target).text("Page Header");
    PageHeader.create().attachTo(target).text("Page Header").headline("Headline");
  }
  
  @Override
  public String title() {
    return "Page Header";
  }
}
