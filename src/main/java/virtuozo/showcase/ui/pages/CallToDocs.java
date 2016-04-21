package virtuozo.showcase.ui.pages;

import virtuozo.infra.Elements;
import virtuozo.infra.Navigate;
import virtuozo.interfaces.Anchor;
import virtuozo.interfaces.Component;
import virtuozo.interfaces.FontAwesome;
import virtuozo.interfaces.Heading;
import virtuozo.interfaces.LayoutPanel;
import virtuozo.interfaces.Paragraph;
import virtuozo.interfaces.StackedIcon;
import virtuozo.interfaces.css.TextColor;
import virtuozo.showcase.application.Places;
import virtuozo.showcase.ui.Bundle;

import com.google.gwt.dom.client.Style.Unit;

public class CallToDocs extends Component<CallToDocs> {
  private LayoutPanel docs = LayoutPanel.horizontal();
  
  public CallToDocs() {
    super(Elements.div());
    this.init();
  }
  
  private void init(){
    this.addChild(this.docs);
    this.createDocLink(FontAwesome.CODE, Bundle.words().apiDocs(), Bundle.words().apiDocsDescription());
    this.createDocLink(FontAwesome.PAPER_PLANE_O, Bundle.words().restRescue(), Bundle.words().restRescueDescription());
    
    Anchor link = this.createDocLink(FontAwesome.DASHBOARD, Bundle.words().uiComponents(), Bundle.words().uiComponentsDescription());
    Navigate.to(Places.DOCS).through(link);
    this.docs.distribute();
  }
  
  private Anchor createDocLink(FontAwesome icon, String title, String description) {
    LayoutPanel panel = LayoutPanel.vertical();
    panel.style().width(100, Unit.PCT);
    StackedIcon stack = StackedIcon.create().css(FontAwesome.Styles.FOUR_TIMES_LARGE).regular(icon, FontAwesome.Styles.INVERSE).larger(FontAwesome.CIRCLE, TextColor.INFO);
    Anchor heading = Anchor.create();
    heading.add(Heading.four().css("heading").text(title));
    panel.add(stack).add(heading).add(Paragraph.create().text(description));
    docs.add(panel);
    
    return heading;
  }
}