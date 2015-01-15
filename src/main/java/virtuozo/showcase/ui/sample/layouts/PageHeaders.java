package virtuozo.showcase.ui.sample.layouts;

import virtuozo.showcase.ui.sample.Fragment;
import virtuozo.ui.PageHeader;
import virtuozo.ui.interfaces.HasComponents;

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
