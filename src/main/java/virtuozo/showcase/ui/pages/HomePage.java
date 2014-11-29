package virtuozo.showcase.ui.pages;

 import virtuozo.showcase.ui.Bundle;
import virtuozo.showcase.ui.Callout;
import virtuozo.showcase.ui.HomePagePresenter.HomeView;
import virtuozo.ui.Container;
import virtuozo.ui.FontAwesome;
import virtuozo.ui.Heading;
import virtuozo.ui.InputGroup;
import virtuozo.ui.InputText;
import virtuozo.ui.LandingPageLayout;
import virtuozo.ui.LayoutPanel;
import virtuozo.ui.Media;
import virtuozo.ui.MediaList;
import virtuozo.ui.Navbar;
import virtuozo.ui.Paragraph;
import virtuozo.ui.ScrollSpy;
import virtuozo.ui.StackedIcon;
import virtuozo.ui.Tag;
import virtuozo.ui.Text;
import virtuozo.ui.ViewPort;
import virtuozo.ui.Wizard;
import virtuozo.ui.Container.Row;
import virtuozo.ui.Container.Row.Column;
import virtuozo.ui.Heading.Level;
import virtuozo.ui.LandingPageLayout.Section;
import virtuozo.ui.LandingPageLayout.Intro.Slogan;
import virtuozo.ui.Navbar.Facet.NavItem;
import virtuozo.ui.Wizard.Step;
import virtuozo.ui.api.HasComponents;
import virtuozo.ui.api.Icon;
import virtuozo.ui.api.ScrollSpyEvent;
import virtuozo.ui.api.ScrollSpyEvent.ScrollSpyHandler;
import virtuozo.ui.css.TextAlignment;
import virtuozo.ui.css.TextColor;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.FocusEvent;
import com.google.gwt.event.dom.client.FocusHandler;
import com.google.gwt.event.dom.client.MouseOverEvent;
import com.google.gwt.event.dom.client.MouseOverHandler;

public class HomePage implements HomeView {
    private LandingPageLayout layout = new LandingPageLayout();
    
    @Override
    public void render(HasComponents<?, ?> container) {
      this.layout.attach();
      
      this.layout.navbar().css(Navbar.Placement.TOP, Navbar.Type.INVERSE).brand().text("virtuozo").onClick(new ClickHandler() {
        @Override
        public void onClick(ClickEvent event) {
          HomePage.this.layout.intro().scrollTo();
        }
      });

      Slogan slogan = this.layout.intro().slogan().add(new Heading(Level.TWO).text("Virtuozo Showcase"));
      slogan.add(new Heading(Level.FOUR).text("Virtuozo is a opinionated SPA framework for Java Lovers"));

      Section about = this.addSection("About Virtuozo");
      this.buildAbout(about);
      this.layout.intro().scrollTo(about, FontAwesome.ANGLE_DOUBLE_DOWN);
      
      Section features = this.addSection("Features").css("color", "zig-zag-separator");
      this.buildFeatures(features);
      
      Section getStarted = this.addSection("Getting Started").css("boxes-separator");
      this.buildGettingStarted(getStarted);
      
      Section community = this.addSection("Community").css("color");
      this.buildCommunity(community);
    }
    
    @Override
    public void detach() {
      this.layout.detach();
    }
    
    private void buildAbout(Section section){
      Column left = section.addColumn().span(6, ViewPort.SMALL);
      
      Callout manifesto = new Callout().css(Callout.Color.WARNING);
      left.add(new Heading(Level.FOUR).text("Manifesto")).add(manifesto);
      
      manifesto.addHeading().text("End user matters").style().marginTop(0, Unit.PX);
      manifesto.addText().text("The SPA concept emerged to give that desktop-feel to the users. Virtuozo is the tool for this.");
      
      manifesto.addHeading().text("Performance is the main target");
      manifesto.addText().text("All Virtuozo's foundation is GWT and it means that we will never embed 3rd-party javascript libraries.");
      
      manifesto.addHeading().text("Productivity is a must");
      manifesto.addText().text("Our mission is to give to developer the power to produce less code and get huge results.");
      
      manifesto.addHeading().text("From Java Lovers to Java Lovers");
      manifesto.addText().text("Our efforts will be to deliver a high valuable and fluent Java API.");
      
      manifesto.addHeading().text("Use any backend technology");
      manifesto.addText().text("Virtuozo loves Restful web services and AJAX is not a rocket science.");
      
      manifesto.addHeading().text("Always up-to-date");
      manifesto.addText().text("In a ocurrance of a new version to any library of our stack it will be updated as soon as possible.");
      
      Column right = section.addColumn().span(6, ViewPort.SMALL);
      MediaList list = new MediaList();
      right.add(list);

      Media gwt = list.addMedia();
      gwt.object().addImage().src(Bundle.images().gwt());
      gwt.body().addHeading().text("Google Web Toolkit");
      gwt.body().addText().text("If you love object orientation and Java, this solution is right for you. Futhermore, it is lightweight, powerful, fully testable, very productive for developers and extremely performative to users.");
      
      Media bootstrap = list.addMedia();
      bootstrap.object().addImage().src(Bundle.images().bootstrap());
      bootstrap.body().addHeading().text("Twitter Bootstrap");
      bootstrap.body().addText().text("The most popular css mobile-first over there. Virtuozo has two major differences in its version. Firstly, jquery code was ported to GWT. Secondly, Virtuozo has more widgets available than standard bootstrap version.");
      
      Media fa = list.addMedia();
      fa.object().addImage().src(Bundle.images().fontawesome());
      fa.body().addHeading().text("Font Awesome");
      fa.body().addText().text("Bootstrap comes with Glyphicons incorporated. Virtuozo gives it to you as an option. Font Awesome gives you scalable vector icons that can instantly be customized with the power of CSS.");
      
      Media pack = list.addMedia();
      pack.object().addImage().src(Bundle.images().html5());
      pack.body().addHeading().text("Tunning standards");
      pack.body().addText().text("Say goodbye to the markup language as you know it. Use a type safe language to develop your web applications. You can just instantiate a new object and instantly get all the nodes done, simple as it should be. Less code, more results.");

      Media themes = list.addMedia();
      themes.object().addImage().src(Bundle.images().bootswatch()).style().backgroundColor("#141d27");
      themes.body().addHeading().text("Bootswatch Themes");
      themes.body().addText().text("Are you tired of default bootstrap theme? Virtuozo incorporates more than a dozen of bootstrap themes that is free for use. Thanks to Bootswatch for the great job.");
    }
    
    private void buildFeatures(Section section){
      this.addFeatureColumn(section, FontAwesome.FLASH, "Fast page load")
      .text("Give to your web applicatino the same feel of a desktop application and your end users will love it.");
      
      this.addFeatureColumn(section, FontAwesome.GLOBE, "I18N made easy")
      .text("Native support for currency, formats and translations based on User Locale.");
      
      this.addFeatureColumn(section, FontAwesome.BULLHORN, "Fluent API")
      .text("Forget all about getters and setters. This API is so fluent that for a while you will forget that it is a Java code.");
      
      this.addFeatureColumn(section, FontAwesome.CUBES, "Asset Packaging")
      .text("Say goodbye to the copy and paste hell. With Virtuozo all files are delivered as a jar file, including all the artifacts to make your software works. Virtuozo has no dependency on Java at runtime, you can drop your application in any web server.");

      this.addFeatureColumn(section, FontAwesome.PLUG, "Modular")
      .text("Virtuozo has a Model-View-Presenter implementation as its core. Thanks to this, Virtuozo is a test-first friendly project design and a interface-centric programming model. Thanks to GoF on this advice.");
      
      this.addFeatureColumn(section, FontAwesome.HISTORY, "History Management")
      .text("Give back to the users the forward and back buttons. Do let them bookmark that awesome page. Thankfully, history mechanism makes history support fairly straightforward to developer.");
      
      this.addFeatureColumn(section, FontAwesome.DATABASE, "Local Storage")
      .text("Virtuozo has a built-in in memory browser storage. It can be used to store data synchronous or asynchronous with event dispatch. If browser supports HTML5 Storage it is wrapped on a unified API.");
      
      this.addFeatureColumn(section, FontAwesome.BUS, "Event-Driven Programming")
      .text("Virtuozo has a strong and easy event-driven programming model. It helps to decouple layers and objects communication. Events can be synchronous or asynchronously handled.");
      
      this.addFeatureColumn(section, FontAwesome.MAGIC, "Extensible")
      .text("Because of its modularity and extensible API, whatever you need, even about to create a custom component, it is effortless.");
    }
    
    private void buildGettingStarted(Section section) {
      section.addColumn().span(12, ViewPort.X_SMALL).add(new Paragraph().lead().css(TextAlignment.CENTER).text("Virtuozo is an open source, lightweight, high performative Java framework to make easy to build Single Page Applications."));
      
      Wizard wizard = new Wizard().hideControls();
      wizard.heading().text("NO WORRIES, IT IS SO EASY");
      section.addColumn().span(12, ViewPort.X_SMALL).add(wizard);
      Step step = wizard.addStep().text("Maven");
      step.add(new Paragraph().html("The first thing you will need to do if you have not already, is install Maven. If you have not already installed Maven, do so now. Apache Maven is a software project management and comprehension tool. Based on the concept of a project object model (POM), Maven can manage a project's build, reporting and documentation from a central piece of information. More information at <a href='http://maven.apache.org/' target='_blank'>here</a>."));
      step.add(new Paragraph().text("You have two options to set up a Virtuozo application. You can start by copying the kick-start-application or by building an application with the Virtuozo Forge Add-on. The second one is the easier option."));
      
      Row row = new Container(Container.Type.FLUID).attachTo(step).addRow();
      MediaList list = new MediaList();
      row.addColumn().span(6, ViewPort.SMALL).add(list);

      Media media = list.addMedia();
      media.object().addImage().src(Bundle.images().logo());
      media.body().addHeading().text("Virtuozo Kick Start Application");
      media.body().addText().css(TextAlignment.JUSTIFY).text("This application has the base skeleton required to make application works. Take a look over readme file and get project done in minutes.");
      media.body().add(this.focusText().value("git clone https://github.com/virtuozo/kickstart.git"));
      
      list = new MediaList();
      row.addColumn().span(6, ViewPort.SMALL).add(list);
      media = list.addMedia();
      media.object().addImage().src(Bundle.images().forge());
      media.body().addHeading().text("Virtuozo Forge Add-On");
      media.body().addText().css(TextAlignment.JUSTIFY).text("Forge is a code framework that can generate code and configurations for Java projects. Using this method is easier because all the code is generated following your instructions.");
      media.body().add(this.focusText().value("addon-install-from-git --url https://github.com/virtuozo/spa-framework.git --coordinate com.github.virtuozo:forge-addon"));
      
      step = wizard.addStep().text("Module running");
      step.add(new Paragraph().text("The next step is compiling, since GWT is a Java-to-Javascript compiler, the final code actually is a Javascript file. Because of its nature, Virtuozo has no dependency on Java Runtime Environment to run into the browser, it is not an applet :). That it said, take the following steps to compile and run."));
      
      row = new Container(Container.Type.FLUID).attachTo(step).addRow();
      row.addColumn().span(4, ViewPort.SMALL).add(new Heading(Level.FIVE).text("Compilation through maven")).add(this.focusText().value("mvn package -P gwt"));
      row.addColumn().span(4, ViewPort.SMALL).add(new Heading(Level.FIVE).text("Running using Jetty")).add(this.focusText().value("mvn jetty:run -P gwt"));
      row.addColumn().span(4, ViewPort.SMALL).add(new Heading(Level.FIVE).text("Running using Dev Mode")).add(this.focusText().value("mvn gwt:run -P gwt"));
      row.addColumn().span(12, ViewPort.SMALL).add(new Text().css(TextAlignment.CENTER).text("Note: It is totally possible to debug your code using GWT Super Dev Mode. It provides sourcemaps and make it possible to debug Java code directly in the browser.")).style().paddingTop(10, Unit.PX);
      
      LayoutPanel docs = LayoutPanel.horizontal();
      wizard.addStep().text("Inspect the docs").add(docs);
      
      this.createDocLink(docs, FontAwesome.CODE, "API Documentation", "Know how API works and how to customize it.");
      this.createDocLink(docs, FontAwesome.PAPER_PLANE_O, "Rest to the Rescue", "Know how Rest API works.");
      this.createDocLink(docs, FontAwesome.DASHBOARD, "UI Components", "Know how to use components");
      
      docs.distribute();
    }
    
    private void buildCommunity(Section section){
      Row row = new Container(Container.Type.FLUID).attachTo(section).addRow();
      
      this.createCommunityLink(row, "https://github.com/virtuozo", FontAwesome.GITHUB);
      
      String twitterUrl = "http://twitter.com/intent/tweet?url=" + GWT.getHostPageBaseURL() + "&text=A opinionated SPA framework for Java Lovers, check it out :)";
      this.createCommunityLink(row, twitterUrl, FontAwesome.TWITTER);
      
      String faceUrl = "http://www.facebook.com/sharer.php?u=" + GWT.getHostPageBaseURL();
      this.createCommunityLink(row, faceUrl, FontAwesome.FACEBOOK);
      
      String googleUrl = "https://plus.google.com/share?url=" + GWT.getHostPageBaseURL();
      this.createCommunityLink(row, googleUrl, FontAwesome.GOOGLE_PLUS);
      
      row.addColumn().span(8, ViewPort.SMALL).add(new Paragraph().text("This showcase was built using Virtuozo :). This page has 264 lines of Java code. Compared to the html version, which has at least 600 lines of code (with no consideration on Javascript code), it is a considerable reduction. It is really less code, more results."))
      .add(Tag.asSpan().html("Thanks to <a href='http://alicexz.deviantart.com'>alicexz</a> for the awesome artwork."));
      
    }
    
    private void createCommunityLink(Row row, String href, FontAwesome icon){
      Tag<AnchorElement> link = Tag.asAnchor();
      link.element().setHref(href);
      link.element().setTarget("_blank");
      row.addColumn().span(1, ViewPort.SMALL).css(FontAwesome.Styles.THREE_TIMES_LARGE).add(link.add(icon.asComponent()));
    }
    
    private void createDocLink(LayoutPanel docs, FontAwesome icon, String title, String description){
      LayoutPanel panel = LayoutPanel.vertical();
      panel.style().width(100, Unit.PCT);
      StackedIcon stack = new StackedIcon().css(FontAwesome.Styles.FOUR_TIMES_LARGE).regular(icon, FontAwesome.Styles.INVERSE).larger(FontAwesome.CIRCLE, TextColor.INFO);
      panel.add(stack).add(new Heading(Level.FOUR).text(title)).add(new Paragraph().text(description));
      docs.add(panel);
    }
    
    private InputGroup focusText(){
      final InputText input = new InputText();
      input.onFocus(new FocusHandler() {
        
        @Override
        public void onFocus(FocusEvent event) {
          input.selectAll();
        }
      }).onMouseOver(new MouseOverHandler() {
        
        @Override
        public void onMouseOver(MouseOverEvent event) {
          input.element().focus();
        }
      });
      
      InputGroup group = new InputGroup(input);
      group.style().width(100, Unit.PCT);
      
      return group;
    }
    
    private Paragraph addFeatureColumn(Section section, Icon icon, String title){
      Heading heading = new Heading(Level.FOUR).text(" " + title);
      Paragraph paragraph = new Paragraph().css(TextAlignment.JUSTIFY);
      icon.appendTo(heading);
      
      section.addColumn().span(4, ViewPort.LARGE).span(6, ViewPort.SMALL).add(heading).add(paragraph);
      return paragraph;
    }
    
    private Section addSection(String title){
      final Section section = this.layout.addSection();
      section.heading().text(title);
      
      final NavItem item = this.layout.navbar().rightFacet().addItem().text(title).onClick(new ClickHandler() {
        @Override
        public void onClick(ClickEvent event) {
          section.scrollTo();
        }
      });
      
      ScrollSpy.get().spy(section, new ScrollSpyHandler() {
        
        @Override
        public void onScroll(ScrollSpyEvent event) {
          if(event.isInRange()){
            item.activate();
            return;
          }
          item.deactivate();
        }
      });
      
      return section;
    }
  }