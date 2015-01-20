package virtuozo.showcase.ui.sample.layouts;

import virtuozo.ui.FontAwesome;
import virtuozo.ui.Heading;
import virtuozo.ui.LandingPageLayout;
import virtuozo.ui.LandingPageLayout.Intro.Slogan;
import virtuozo.ui.LandingPageLayout.Section;
import virtuozo.ui.Paragraph;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;

public class LandingSnippet implements EntryPoint {
  @Override
  public void onModuleLoad() {
    LandingPageLayout layout = LandingPageLayout.create().attach();
    //Build your own navbar
    layout.navbar().brand().text("Virtuozo");
    
    //Build your own slogan
    Slogan slogan = layout.intro().slogan().add(Heading.two().css("heading").text("VIRTUOZO SHOWCASE"));
    slogan.add(Heading.four().css("heading").text("VIRTUOZO IS AN OPINIONATED ALL-IN-ONE SPA FRAMEWORK FOR JAVA LOVERS"));
    
    //Build another section
    final Section anotherSection = layout.addSection().add(Paragraph.create().text("..."));
    
    //Link intro to another section
    layout.intro().scrollTo(anotherSection, FontAwesome.ANGLE_DOUBLE_DOWN);
    
    layout.navbar().leftFacet().addItem().text("Another item").onClick(new ClickHandler() {
      
      @Override
      public void onClick(ClickEvent event) {
        //Scroll down/up to another section
        anotherSection.scrollTo();
      }
    });
  }
}