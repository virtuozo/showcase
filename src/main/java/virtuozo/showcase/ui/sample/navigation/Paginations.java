package virtuozo.showcase.ui.sample.navigation;

import virtuozo.interfaces.HasComponents;
import virtuozo.interfaces.Pager;
import virtuozo.interfaces.Pagination;
import virtuozo.showcase.ui.sample.Fragment;

public class Paginations implements Fragment {

  public void render(HasComponents<?, ?> target) {
    Pagination pagination = Pagination.create().attachTo(target).css(Pagination.Size.LARGE);
    pagination.pages(10);
    
    pagination = Pagination.create().attachTo(target);
    pagination.pages(10);
    
    pagination = Pagination.create().attachTo(target).css(Pagination.Size.SMALL);
    pagination.pages(10);
    
    Pager pager = Pager.create().attachTo(target);
    pager.pages(10);
    
    pager = Pager.create().attachTo(target);
    pager.pages(10).messageTemplate("Page {0} from {1}");
  }
  
  @Override
  public String title() {
    return "Pagination";
  }
}
