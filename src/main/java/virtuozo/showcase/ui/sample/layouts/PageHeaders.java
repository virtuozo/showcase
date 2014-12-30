package virtuozo.showcase.ui.sample.layouts;

import virtuozo.showcase.ui.sample.Fragment;
import virtuozo.ui.PageHeader;
import virtuozo.ui.api.HasComponents;

public class PageHeaders implements Fragment {

  public void render(HasComponents<?, ?> target) {
    new PageHeader().attachTo(target).text("Page Header");
    new PageHeader().attachTo(target).text("Page Header").headline("Headline");
  }
}
