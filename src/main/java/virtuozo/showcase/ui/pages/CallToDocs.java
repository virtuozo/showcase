package virtuozo.showcase.ui.pages;

import virtuozo.infra.Navigate;
import virtuozo.showcase.application.Places;
import virtuozo.showcase.ui.Bundle;
import virtuozo.ui.Anchor;
import virtuozo.ui.Component;
import virtuozo.ui.Elements;
import virtuozo.ui.FontAwesome;
import virtuozo.ui.Heading;
import virtuozo.ui.LayoutPanel;
import virtuozo.ui.Paragraph;
import virtuozo.ui.StackedIcon;
import virtuozo.ui.css.TextColor;

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
    
    Anchor link = this.createDocLink(FontAwesome.DASHBOARD, Bundle.constants().uiComponents(), Bundle.constants().uiComponentsDescription());
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