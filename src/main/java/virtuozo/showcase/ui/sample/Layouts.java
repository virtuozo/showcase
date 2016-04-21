package virtuozo.showcase.ui.sample;

import virtuozo.interfaces.FontAwesome;
import virtuozo.showcase.ui.Document;
import virtuozo.showcase.ui.sample.layouts.Bare;
import virtuozo.showcase.ui.sample.layouts.Hero;
import virtuozo.showcase.ui.sample.layouts.Landing;
import virtuozo.showcase.ui.sample.layouts.Side;
import virtuozo.showcase.ui.sample.layouts.Sticky;

public class Layouts implements Sample {

  @Override
  public String title() {
    return "Layouts";
  }

  @Override
  public FontAwesome icon() {
    return FontAwesome.NEWSPAPER_O;
  }

  @Override
  public void attach(Sampler target) {
    Document.create(target).load(new Bare());
    Document.create(target).load(new Landing());
    Document.create(target).load(new Hero());
    Document.create(target).load(new Side());
    Document.create(target).load(new Sticky());
  }
}