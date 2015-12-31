package virtuozo.showcase.ui.pages;

import virtuozo.infra.Navigate;
import virtuozo.showcase.application.Places;
import virtuozo.showcase.ui.Bundle;
import virtuozo.showcase.ui.DocsPresenter.DocsView;
import virtuozo.showcase.ui.sample.Actions;
import virtuozo.showcase.ui.sample.DataSets;
import virtuozo.showcase.ui.sample.Decorations;
import virtuozo.showcase.ui.sample.Events;
import virtuozo.showcase.ui.sample.Forms;
import virtuozo.showcase.ui.sample.Fragment;
import virtuozo.showcase.ui.sample.I18n;
import virtuozo.showcase.ui.sample.Icons;
import virtuozo.showcase.ui.sample.Info;
import virtuozo.showcase.ui.sample.Layouts;
import virtuozo.showcase.ui.sample.Navigation;
import virtuozo.showcase.ui.sample.Sample;
import virtuozo.showcase.ui.sample.Sampler;
import virtuozo.showcase.ui.sample.Typography;
import virtuozo.ui.Affix;
import virtuozo.ui.Anchor;
import virtuozo.ui.BarePageLayout;
import virtuozo.ui.Container;
import virtuozo.ui.FontAwesome;
import virtuozo.ui.Heading;
import virtuozo.ui.InputText;
import virtuozo.ui.LayoutPanel;
import virtuozo.ui.ListGroup;
import virtuozo.ui.ListGroup.ListGroupItem;
import virtuozo.ui.Navbar.Brand;
import virtuozo.ui.Panel;
import virtuozo.ui.Row;
import virtuozo.ui.Row.Column;
import virtuozo.ui.ScrollSpy;
import virtuozo.ui.StackedIcon;
import virtuozo.ui.Tag;
import virtuozo.ui.ViewPort;
import virtuozo.ui.css.TextColor;
import virtuozo.ui.events.ScrollSpyEvent;
import virtuozo.ui.events.ScrollSpyEvent.ScrollSpyHandler;
import virtuozo.ui.interfaces.HasComponents;
import virtuozo.ui.interfaces.UIComponent;

import com.google.gwt.dom.client.DivElement;
import com.google.gwt.dom.client.Style.Overflow;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;

public class DocsPage implements DocsView {

  private BarePageLayout layout = BarePageLayout.create();
  
  private Column samples;
  
  private Panel leftPanel = Panel.create();
  
  private SampleContainer sampler = new SampleContainer();
  
  @Override
  public void render(HasComponents<?, ?> parent) {
    this.layout.attach();
    
    Brand brand = this.layout.navbar().brand().text("Virtuozo");
    Navigate.to(Places.HOME).through(brand);
    
    this.layout.navbar().rightFacet().addItem().text(Bundle.words().apiDocs());
    this.layout.navbar().rightFacet().addItem().text(Bundle.words().restRescue());
    this.layout.navbar().rightForm().addInput(InputText.create().placeholder("Search..."));

    Tag<DivElement> top = Tag.asDiv().attachTo(this.layout.body());
    top.style().overflowX(Overflow.SCROLL).overflowY(Overflow.HIDDEN).overflow(Overflow.HIDDEN).marginBottom(5, Unit.PX);
    LayoutPanel dockerPanel = LayoutPanel.horizontal().attachTo(top).css("docker");
    
    Container container = this.layout.body();
    Row mainRow = container.addRow();
    Column left = mainRow.addColumn().span(3, ViewPort.SMALL);
    this.samples = mainRow.addColumn().span(9, ViewPort.SMALL);
    
    this.leftPanel.attachTo(left).hide();
    this.leftPanel.footer().detachChildren().add(Anchor.create().text("Back to top").onClick(new ClickHandler() {
      
      @Override
      public void onClick(ClickEvent event) {
        Window.scrollTo(0, 0);
      }
    }));
    Affix.onTop().to(this.leftPanel);
    
    this.createSample(dockerPanel, new Typography());
    this.createSample(dockerPanel, new Decorations());
    this.createSample(dockerPanel, new Layouts());
    this.createSample(dockerPanel, new Navigation());
    this.createSample(dockerPanel, new Info());
    this.createSample(dockerPanel, new Actions());
    this.createSample(dockerPanel, new Icons());
    this.createSample(dockerPanel, new Forms());
    this.createSample(dockerPanel, new DataSets());
    this.createSample(dockerPanel, new Events());
    this.createSample(dockerPanel, new I18n());
    
    this.switchTo(new Typography());
  }
  
  private void createSample(LayoutPanel main, final Sample sample){
    LayoutPanel panel = LayoutPanel.vertical();
    StackedIcon icon = StackedIcon.create().css(FontAwesome.Styles.TWICE_LARGE, TextColor.INFO).larger(FontAwesome.CIRCLE).regular(sample.icon(), FontAwesome.Styles.INVERSE);
    ClickHandler navigate = new ClickHandler() {
      
      @Override
      public void onClick(ClickEvent event) {
        DocsPage.this.switchTo(sample);
      }
    };
    panel.add(Anchor.create().add(icon).onClick(navigate));
    panel.add(Anchor.create().add(Heading.six().css("heading").text(sample.title())).onClick(navigate));
        
    main.add(panel);
  }

  @Override
  public void detach() {
    this.layout.detach();
    this.leftPanel.detach();
    this.samples.detachChildren();
  }
  
  private void switchTo(Sample sample){
    this.leftPanel.show().header().text(sample.title()).icon(sample.icon());
    this.samples.detachChildren();
    sample.attach(sampler.detachChildren());
  }
  
  class SampleContainer implements Sampler {
    private ListGroup list;
    
    public SampleContainer() {
      this.list = DocsPage.this.leftPanel.addListGroup();;
    }
    
    @Override
    public void add(UIComponent component) {
      DocsPage.this.samples.add(component);
    }
    
    @Override
    public void add(Fragment fragment, final UIComponent sample) {
      final ListGroupItem item = this.list.addItem();
      item.addText().text(fragment.title());
      ScrollSpy.create().spy(sample, new ScrollSpyHandler() {
        
        @Override
        public void onScroll(ScrollSpyEvent event) {
          if(event.isInRange()){
            item.activate();
            return;
          }
          item.deactivate();
        }
      });
      item.onClick(new ClickHandler() {
        
        @Override
        public void onClick(ClickEvent event) {
          sample.asComponent().scrollTo();
        }
      });
      
    }
    
    public Sampler detachChildren(){
      this.list.detachChildren();
      return this;
    }
  }
}