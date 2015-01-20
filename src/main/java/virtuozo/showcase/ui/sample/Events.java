package virtuozo.showcase.ui.sample;

import virtuozo.showcase.ui.Document;
import virtuozo.showcase.ui.sample.events.ChangeHandlers;
import virtuozo.showcase.ui.sample.events.ClickHandlers;
import virtuozo.showcase.ui.sample.events.FocusHandlers;
import virtuozo.showcase.ui.sample.events.KeyHandlers;
import virtuozo.showcase.ui.sample.events.MouseHandlers;
import virtuozo.showcase.ui.sample.events.TouchHandlers;
import virtuozo.ui.FontAwesome;


public class Events implements Sample {
  
  @Override
  public String title() {
    return "Events";
  }
  
  @Override
  public FontAwesome icon() {
    return FontAwesome.BELL;
  }
  
  @Override
  public void attach(Sampler target) {
    Document.create(target).load(new ChangeHandlers());
    Document.create(target).load(new ClickHandlers());
    Document.create(target).load(new FocusHandlers());
    Document.create(target).load(new KeyHandlers());
    Document.create(target).load(new MouseHandlers());
    Document.create(target).load(new TouchHandlers());
  }
}
