package virtuozo.showcase.ui.pages;

import virtuozo.infra.Navigate;
import virtuozo.showcase.application.Places;
import virtuozo.showcase.ui.ComponentsPresenter.ComponentsView;
import virtuozo.showcase.ui.sample.Sample;
import virtuozo.showcase.ui.sample.Sampler;
import virtuozo.showcase.ui.sample.Typography;
import virtuozo.ui.BareLayout;
import virtuozo.ui.Breadcrumb;
import virtuozo.ui.Breadcrumb.BreadcrumbItem;
import virtuozo.ui.FontAwesome;
import virtuozo.ui.Heading;
import virtuozo.ui.Heading.Level;
import virtuozo.ui.InputText;
import virtuozo.ui.LayoutPanel;
import virtuozo.ui.Navbar.Brand;
import virtuozo.ui.Row;
import virtuozo.ui.Row.Column;
import virtuozo.ui.StackedIcon;
import virtuozo.ui.Tag;
import virtuozo.ui.ViewPort;
import virtuozo.ui.api.HasComponents;
import virtuozo.ui.api.UIComponent;
import virtuozo.ui.css.TextColor;

import com.google.gwt.dom.client.DivElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;

public class ComponentsPage implements ComponentsView {

  private BareLayout layout = new BareLayout();
  
  private Tag<DivElement> samples = Tag.asDiv();
  
  private BreadcrumbItem current;
  
  @Override
  public void render(HasComponents<?, ?> container) {
    this.layout.attach();
    
    Brand brand = this.layout.navbar().brand().text("Vituozo");
    Navigate.to(Places.HOME).through(brand);
    
    this.layout.navbar().rightForm().addInput(new InputText().placeholder("Search..."));

    LayoutPanel main = LayoutPanel.horizontal().attachTo(this.layout.container());
    this.current = new Breadcrumb().attachTo(this.layout.container()).hide().addItem();
    this.samples.attachTo(this.layout.container());
    
    this.createSample(main, FontAwesome.FONT, new Typography());
  }
  
  private void createSample(LayoutPanel main, FontAwesome icon, final Sample sample){
    LayoutPanel panel = LayoutPanel.vertical();
    panel.add(new StackedIcon().css(FontAwesome.Styles.TWICE_LARGE, TextColor.INFO).larger(FontAwesome.CIRCLE).regular(icon, FontAwesome.Styles.INVERSE));
    panel.add(Tag.asAnchor().add(new Heading(Level.SIX).css("heading").text(sample.title())).onClick(new ClickHandler() {
      
      @Override
      public void onClick(ClickEvent event) {
        ComponentsPage.this.switchTo(sample);
      }
    }));
        
    main.add(panel);
  }

  @Override
  public void detach() {
    this.layout.detach();
  }
  
  private void switchTo(Sample sample){
    SampleContainer sampler = new SampleContainer();
    this.samples.detachChildren().add(sampler.row);
    this.current.text(sample.title()).parent().asComponent().show();
    sample.attach(sampler);
  }
  
  class SampleContainer implements Sampler {
    Row row = new Row();

    @Override
    public void add(UIComponent component) {
      this.column().add(component);
      if(this.row.childrenCount() % 2 == 0){
        this.row = new Row().attachTo(ComponentsPage.this.samples);
      }
    }
    
    private Column column(){
      return this.row.addColumn().span(6, ViewPort.SMALL);
    }
  }
}