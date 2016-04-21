package virtuozo.showcase.ui.sample.layouts;

import virtuozo.interfaces.BarePageLayout;
import virtuozo.interfaces.Paragraph;

import com.google.gwt.core.client.EntryPoint;

public class BareSnippet implements EntryPoint {
  @Override
  public void onModuleLoad() {
    BarePageLayout layout = BarePageLayout.create().attach();
    //Build your own navbar
    layout.navbar().brand().text("Virtuozo");
    //Build your own body
    layout.body().add(Paragraph.create().text("..."));
  }
}