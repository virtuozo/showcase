package virtuozo.showcase.ui.pages;

import virtuozo.infra.Navigate;
import virtuozo.showcase.application.Places;
import virtuozo.showcase.ui.Bundle;
import virtuozo.ui.Component;
import virtuozo.ui.Elements;
import virtuozo.ui.FontAwesome;
import virtuozo.ui.Heading;
import virtuozo.ui.Heading.Level;
import virtuozo.ui.LayoutPanel;
import virtuozo.ui.Paragraph;
import virtuozo.ui.StackedIcon;
import virtuozo.ui.Tag;
import virtuozo.ui.css.TextColor;

import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.dom.client.Style.Unit;

public class CallToDocs extends Component<CallToDocs> {
  private LayoutPanel docs = LayoutPanel.horizontal();
  
  public CallToDocs() {
    super(Elements.div());
    this.init();
  }
  
  private void init(){
    this.addChild(this.docs);
    this.createDocLink(FontAwesome.CODE, Bundle.constants().apiDocs(), Bundle.constants().apiDocsDescription());
    this.createDocLink(FontAwesome.PAPER_PLANE_O, Bundle.constants().restRescue(), Bundle.constants().restRescueDescription());
    
    Tag<AnchorElement> link = this.createDocLink(FontAwesome.DASHBOARD, Bundle.constants().uiComponents(), Bundle.constants().uiComponentsDescription());
    Navigate.to(Places.DOCS).through(link);
    this.docs.distribute();
  }
  
  private Tag<AnchorElement> createDocLink(FontAwesome icon, String title, String description) {
    LayoutPanel panel = LayoutPanel.vertical();
    panel.style().width(100, Unit.PCT);
    StackedIcon stack = new StackedIcon().css(FontAwesome.Styles.FOUR_TIMES_LARGE).regular(icon, FontAwesome.Styles.INVERSE).larger(FontAwesome.CIRCLE, TextColor.INFO);
    Tag<AnchorElement> heading = Tag.asAnchor();
    heading.add(new Heading(Level.FOUR).css("heading").text(title));
    panel.add(stack).add(heading).add(new Paragraph().text(description));
    docs.add(panel);
    
    return heading;
  }
}