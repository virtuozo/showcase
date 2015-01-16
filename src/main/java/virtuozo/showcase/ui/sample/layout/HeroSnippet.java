package virtuozo.showcase.ui.sample.layout;

import virtuozo.ui.Heading;
import virtuozo.ui.HeroPageLayout;
import virtuozo.ui.Paragraph;

import com.google.gwt.core.client.EntryPoint;

public class HeroSnippet implements EntryPoint {
  @Override
  public void onModuleLoad() {
    HeroPageLayout layout = HeroPageLayout.create().attach();
    //Build your own navbar
    layout.navbar().brand().text("Virtuozo");
    //Build your own header (hero)
    layout.header().css("hero")
    .add(Heading.four().text("VIRTUOZO SHOWCASE"))
    .add(Paragraph.create().text("Virtuozo is an opinionated all-in-one spa framework for Java Lovers"));
    //Build your own body
    layout.body().add(Paragraph.create().text("Add any component here..."));
  }
}