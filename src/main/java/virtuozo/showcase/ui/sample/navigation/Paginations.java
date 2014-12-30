package virtuozo.showcase.ui.sample.navigation;

import virtuozo.showcase.ui.sample.Fragment;
import virtuozo.ui.Pager;
import virtuozo.ui.Pagination;
import virtuozo.ui.api.HasComponents;

public class Paginations implements Fragment {

  public void render(HasComponents<?, ?> target) {
    Pagination pagination = new Pagination().attachTo(target).css(Pagination.Size.LARGE);
    pagination.pages(10);
    
    pagination = new Pagination().attachTo(target);
    pagination.pages(10);
    
    pagination = new Pagination().attachTo(target).css(Pagination.Size.SMALL);
    pagination.pages(10);
    
    Pager pager = new Pager().attachTo(target);
    pager.pages(10);
    
    pager = new Pager().attachTo(target);
    pager.pages(10).messageTemplate("Page {0} from {1}");
  }
}
