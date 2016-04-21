package virtuozo.showcase.application;

import virtuozo.infra.Place;
import virtuozo.infra.Presenter;
import virtuozo.showcase.ui.DocsPresenter;
import virtuozo.showcase.ui.HomePagePresenter;

public enum Places implements Place {
  HOME{
    @Override
    public Presenter<?> presenter() {
      return HomePagePresenter.get();
    }
  }, DOCS{
    @Override
    public Presenter<?> presenter() {
      return DocsPresenter.get();
    }
  };
  
  @Override
  public String token() {
    return this.name().toLowerCase();
  }
}