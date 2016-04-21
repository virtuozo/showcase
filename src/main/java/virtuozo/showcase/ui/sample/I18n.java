package virtuozo.showcase.ui.sample;

import virtuozo.interfaces.Anchor;
import virtuozo.interfaces.FontAwesome;
import virtuozo.interfaces.Anchor.Target;
import virtuozo.showcase.ui.Callout;
import virtuozo.showcase.ui.Example;
import virtuozo.showcase.ui.sample.i18n.DateFormats;
import virtuozo.showcase.ui.sample.i18n.NumberFormats;


public class I18n implements Sample {
  
  @Override
  public String title() {
    return "i18n";
  }
  
  @Override
  public FontAwesome icon() {
    return FontAwesome.LANGUAGE;
  }
  
  @Override
  public void attach(Sampler target) {
    Callout callout = Callout.warning().css("callout-top");
    callout.addHeading().text("GWT i18n");
    callout.addText().text("GWT includes a flexible set of tools to help you internationalize your applications and libraries. GWT internationalization support provides a variety of techniques to internationalize strings, typed values, and classes.");
    callout.add(Anchor.create().href("http://www.gwtproject.org/doc/latest/DevGuideI18n.html").text("know more...").target(Target.BLANK));
    target.add(callout);
    
    Example.create(target).load(new DateFormats());
    Example.create(target).load(new NumberFormats());
  }
}
