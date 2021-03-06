package virtuozo.showcase.application;

import virtuozo.infra.Historian;
import virtuozo.interfaces.HTML;

import com.google.gwt.core.client.EntryPoint;

public class Showcase implements EntryPoint {
  
  @Override
  public void onModuleLoad() {
    Historian.get().handle(Places.values()).target(HTML.body()).forwardTo(Places.HOME);
  }
}