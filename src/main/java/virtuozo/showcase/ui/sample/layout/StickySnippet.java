package virtuozo.showcase.ui.sample.layout;

import virtuozo.ui.PageHeader;
import virtuozo.ui.Paragraph;
import virtuozo.ui.StickyPageLayout;

import com.google.gwt.core.client.EntryPoint;

public class StickySnippet implements EntryPoint {
  @Override
  public void onModuleLoad() {
    StickyPageLayout layout = StickyPageLayout.create().attach();
    
    //Build your own body
    layout.body().add(PageHeader.create().text("Virtuozo Showcase"))
    .add(Paragraph.create().lead().text("Virtuozo is an opinionated all-in-one SPA framework for Java Lovers"));
    
    //Build your own footer
    layout.footer().add(Paragraph.create().text("Place sticky footer content here."));
  }
}