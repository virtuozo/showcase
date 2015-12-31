package virtuozo.showcase.ui.pages;

import virtuozo.infra.Navigate;
import virtuozo.showcase.application.Places;
import virtuozo.showcase.ui.Bundle;
import virtuozo.showcase.ui.Callout;
import virtuozo.showcase.ui.GithubButtons;
import virtuozo.showcase.ui.GithubButtons.Type;
import virtuozo.showcase.ui.HomePagePresenter.HomeView;
import virtuozo.ui.Anchor;
import virtuozo.ui.Anchor.Target;
import virtuozo.ui.Container;
import virtuozo.ui.FontAwesome;
import virtuozo.ui.Heading;
import virtuozo.ui.InputGroup;
import virtuozo.ui.InputText;
import virtuozo.ui.LandingPageLayout;
import virtuozo.ui.LandingPageLayout.Intro.Slogan;
import virtuozo.ui.LandingPageLayout.Section;
import virtuozo.ui.MediaList;
import virtuozo.ui.MediaList.Media;
import virtuozo.ui.Navbar;
import virtuozo.ui.Navbar.Facet.NavItem;
import virtuozo.ui.Paragraph;
import virtuozo.ui.Row;
import virtuozo.ui.Row.Column;
import virtuozo.ui.Text;
import virtuozo.ui.ViewPort;
import virtuozo.ui.Wizard;
import virtuozo.ui.Wizard.Step;
import virtuozo.ui.css.TextAlignment;
import virtuozo.ui.interfaces.HasComponents;
import virtuozo.ui.interfaces.Icon;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.FocusEvent;
import com.google.gwt.event.dom.client.FocusHandler;
import com.google.gwt.event.dom.client.MouseOverEvent;
import com.google.gwt.event.dom.client.MouseOverHandler;
import com.google.gwt.resources.client.ImageResource;

public class HomePage implements HomeView {
  private LandingPageLayout layout = LandingPageLayout.create();

  @Override
  public void render(HasComponents<?, ?> container) {
    this.layout.attach();

    this.layout.navbar().css(Navbar.Placement.TOP, Navbar.Type.INVERSE).brand().text("virtuozo").onClick(new ClickHandler() {
      @Override
      public void onClick(ClickEvent event) {
        HomePage.this.layout.intro().scrollTo();
      }
    });

    GithubButtons github = new GithubButtons("virtuozo", "spa-framework");
    github.add(Type.FOLLOW).add(Type.FORK).add(Type.WATCH);

    Slogan slogan = this.layout.intro().slogan().add(Heading.two().css("heading").text("Virtuozo Showcase"));
    slogan.add(Heading.four().css("heading").text(Bundle.words().virtuozo()));
    slogan.add(github);

    Section about = this.addSection(Bundle.words().aboutVirtuozo());
    this.buildAbout(about);
    this.layout.intro().scrollTo(about, FontAwesome.ANGLE_DOUBLE_DOWN);

    Section features = this.addSection(Bundle.words().features()).css("color", "zig-zag-separator");
    this.buildFeatures(features);

    Section getStarted = this.addSection(Bundle.words().gettingStarted()).css("boxes-separator");
    this.buildGettingStarted(getStarted);

    Section community = this.addSection(Bundle.words().community()).css("color");
    this.buildCommunity(community);
    
    NavItem components = this.layout.navbar().rightFacet().addItem().text(Bundle.words().documentation());
    Navigate.to(Places.DOCS).through(components);
  }

  @Override
  public void detach() {
    this.layout.detach();
  }

  private void buildAbout(Section section) {
    Column left = section.addColumn().span(6, ViewPort.SMALL);

    Callout manifesto = Callout.warning();
    left.add(Heading.four().css("heading").text(Bundle.words().manifesto())).add(manifesto);

    manifesto.addHeading().css("heading").text(Bundle.words().manifestoFirst()).style().marginTop(0, Unit.PX);
    manifesto.addText().text(Bundle.words().manifestoFirstDescription());

    manifesto.addHeading().css("heading").text(Bundle.words().manifestoSecond());
    manifesto.addText().text(Bundle.words().manifestoSecondDescription());

    manifesto.addHeading().css("heading").text(Bundle.words().manifestoThird());
    manifesto.addText().text(Bundle.words().manifestoThirdDescription());

    manifesto.addHeading().css("heading").text(Bundle.words().manifestoFourth());
    manifesto.addText().text(Bundle.words().manifestoFourthDescription());

    manifesto.addHeading().css("heading").text(Bundle.words().manifestoFifth());
    manifesto.addText().text(Bundle.words().manifestoFifthDescription());

    manifesto.addHeading().css("heading").text(Bundle.words().manifestoSixth());
    manifesto.addText().text(Bundle.words().manifestoSixthDescription());

    Column right = section.addColumn().span(6, ViewPort.SMALL);
    MediaList list = MediaList.create();
    right.add(list);

    createAboutMedia(list, Bundle.images().gwt(), "Google Web Toolkit",Bundle.words().aboutGwt());
    createAboutMedia(list, Bundle.images().bootstrap(), "Twitter Bootstrap",Bundle.words().aboutBootstrap());  
    createAboutMedia(list, Bundle.images().fontawesome(), "Font Awesome", Bundle.words().aboutFontAwesome());
    createAboutMedia(list, Bundle.images().html5(), Bundle.words().tunningStandards(), Bundle.words().aboutTunningStandards());
    Media themes = this.createAboutMedia(list, Bundle.images().bootswatch(), "Bootswatch Themes", Bundle.words().aboutThemes());
    themes.object().css("theme-logo");
  }

  // 
  private Media createAboutMedia(MediaList list, ImageResource image, String title, String text) {
    Media media = list.addMedia();
    media.object().addImage().src(image);
    media.body().addHeading().css("heading").text(title);
    media.body().addText().text(text);
    
    return media;
  }

  private void buildFeatures(Section section) {
    this.addFeatureColumn(section, FontAwesome.FLASH, Bundle.words().featureOne()).text(Bundle.words().featureOneDescription());

    this.addFeatureColumn(section, FontAwesome.GLOBE, Bundle.words().featureTwo()).text(Bundle.words().featureTwoDescription());

    this.addFeatureColumn(section, FontAwesome.BULLHORN, Bundle.words().featureThree()).text(Bundle.words().featureThreeDescription());

    this.addFeatureColumn(section, FontAwesome.CUBES, Bundle.words().featureFour()).text(Bundle.words().featureFourDescription());

    this.addFeatureColumn(section, FontAwesome.PLUG, Bundle.words().featureFive()).text(Bundle.words().featureFiveDescription());

    this.addFeatureColumn(section, FontAwesome.HISTORY, Bundle.words().featureSix()).text(Bundle.words().featureSixDescription());

    this.addFeatureColumn(section, FontAwesome.DATABASE, Bundle.words().featureSeven()).text(Bundle.words().featureSevenDescription());

    this.addFeatureColumn(section, FontAwesome.BUS, Bundle.words().featureEight()).text(Bundle.words().featureEightDescription());

    this.addFeatureColumn(section, FontAwesome.MAGIC, Bundle.words().featureNine()).text(Bundle.words().featureNineDescription());
  }

  private void buildGettingStarted(Section section) {
    section.addColumn().span(12, ViewPort.X_SMALL)
        .add(Paragraph.create().lead().css(TextAlignment.CENTER).text(Bundle.words().headline()));

    Wizard wizard = Wizard.create().hideControls();
    wizard.heading().css("heading").text(Bundle.words().noWorries());
    section.addColumn().span(12, ViewPort.X_SMALL).add(wizard);
    Step step = wizard.addStep().text(Bundle.words().gettingStartedStepOne());
    step.add(Paragraph.create().html(Bundle.words().gettingStartedMaven()));
    step.add(Paragraph.create().text(Bundle.words().gettingStartedSetup()));

    Row row = Container.fluid().attachTo(step).addRow();
    MediaList list = MediaList.create();
    row.addColumn().span(6, ViewPort.SMALL).add(list);

    Media media = list.addMedia();
    media.object().addImage().src(Bundle.images().logo());
    media.body().addHeading().css("heading").text(Bundle.words().kickStartApp());
    media.body().addText().css(TextAlignment.JUSTIFY).text(Bundle.words().kickStartAppDescription());
    media.body().add(this.focusText().value("git clone https://github.com/virtuozo/kickstart.git"));

    list = MediaList.create();
    row.addColumn().span(6, ViewPort.SMALL).add(list);
    media = list.addMedia();
    media.object().addImage().src(Bundle.images().forge());
    media.body().addHeading().css("heading").text(Bundle.words().forgeAddOn());
    media.body().addText().css(TextAlignment.JUSTIFY).text(Bundle.words().forgeAddOnDescription());
    media.body().add(this.focusText().value(Bundle.words().commingSoon()));//addon-install-from-git --url https://github.com/virtuozo/spa-framework.git --coordinate com.github.virtuozo:forge-addon

    step = wizard.addStep().text(Bundle.words().gettingStartedStepTwo());
    step.add(Paragraph.create().text(Bundle.words().moduleRunningDescription()));

    row = Container.fluid().attachTo(step).addRow();
    row.addColumn().span(4, ViewPort.SMALL).add(Heading.five().css("heading").text(Bundle.words().compilationMaven())).add(this.focusText().value("mvn package -P gwt"));
    row.addColumn().span(4, ViewPort.SMALL).add(Heading.five().css("heading").text(Bundle.words().jettyRunning())).add(this.focusText().value("mvn jetty:run -P gwt"));
    row.addColumn().span(4, ViewPort.SMALL).add(Heading.five().css("heading").text(Bundle.words().devModeRunning())).add(this.focusText().value("mvn gwt:run -P gwt"));
    row.addColumn().span(12, ViewPort.SMALL).add(Text.create().css(TextAlignment.CENTER).text(Bundle.words().noteOnDebugging())).style().paddingTop(10, Unit.PX);

    wizard.addStep().text(Bundle.words().gettingStartedStepThree()).add(new CallToDocs());
  }

  private void buildCommunity(Section section) {
    Row row = Container.fluid().attachTo(section).addRow();

    this.createCommunityLink(row, "https://github.com/virtuozo", FontAwesome.GITHUB);

    String twitterUrl = "http://twitter.com/intent/tweet?url=" + GWT.getHostPageBaseURL() + "&text=A opinionated SPA framework for Java Lovers, check it out :)";
    this.createCommunityLink(row, twitterUrl, FontAwesome.TWITTER);

    String faceUrl = "http://www.facebook.com/sharer.php?u=" + GWT.getHostPageBaseURL();
    this.createCommunityLink(row, faceUrl, FontAwesome.FACEBOOK);

    String googleUrl = "https://plus.google.com/share?url=" + GWT.getHostPageBaseURL();
    this.createCommunityLink(row, googleUrl, FontAwesome.GOOGLE_PLUS);

    row.addColumn().span(8, ViewPort.SMALL).add(Paragraph.create().text(Bundle.words().showCaseNote()));
  }

  private void createCommunityLink(Row row, String href, FontAwesome icon) {
    Anchor link = Anchor.create().href(href).target(Target.BLANK);
    row.addColumn().span(1, ViewPort.SMALL).css(FontAwesome.Styles.THREE_TIMES_LARGE).add(link.add(icon.asComponent()));
  }

  private InputGroup focusText() {
    final InputText input = InputText.create();
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

    InputGroup group = InputGroup.create(input);
    group.style().width(100, Unit.PCT);

    return group;
  }

  private Paragraph addFeatureColumn(Section section, Icon icon, String title) {
    Heading heading = Heading.four().css("heading").text(" " + title);
    Paragraph paragraph = Paragraph.create().css(TextAlignment.JUSTIFY);
    icon.attachTo(heading);

    section.addColumn().span(4, ViewPort.LARGE).span(6, ViewPort.SMALL).add(heading).add(paragraph);
    return paragraph;
  }

  private Section addSection(String title) {
    final Section section = this.layout.addSection();
    section.heading().css("heading").text(title);

    this.layout.navbar().rightFacet().addItem().text(title).onClick(new ClickHandler() {
      @Override
      public void onClick(ClickEvent event) {
        section.scrollTo();
      }
    });

    return section;
  }
}