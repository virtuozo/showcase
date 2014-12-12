package virtuozo.showcase.ui;

import virtuozo.infra.Presenter;
import virtuozo.infra.View;
import virtuozo.showcase.ui.ComponentsPresenter.ComponentsView;
import virtuozo.showcase.ui.pages.ComponentsPage;

public class ComponentsPresenter extends Presenter<ComponentsView>{
  private static final ComponentsPresenter instance = new ComponentsPresenter(new ComponentsPage());
  
  public static ComponentsPresenter get() {
    return instance;
  }
  
  private ComponentsPresenter(ComponentsView view) {
    super(view);
  }
  
  public interface ComponentsView extends View {
    
  }
}