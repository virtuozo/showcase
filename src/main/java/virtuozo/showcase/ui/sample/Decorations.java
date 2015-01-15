package virtuozo.showcase.ui.sample;

import virtuozo.showcase.ui.Example;
import virtuozo.showcase.ui.sample.layouts.Badges;
import virtuozo.showcase.ui.sample.layouts.Carousels;
import virtuozo.showcase.ui.sample.layouts.Jumbotrons;
import virtuozo.showcase.ui.sample.layouts.Labels;
import virtuozo.showcase.ui.sample.layouts.LayoutPanels;
import virtuozo.showcase.ui.sample.layouts.ListGroups;
import virtuozo.showcase.ui.sample.layouts.MediaLists;
import virtuozo.showcase.ui.sample.layouts.PageHeaders;
import virtuozo.showcase.ui.sample.layouts.PanelGroups;
import virtuozo.showcase.ui.sample.layouts.Panels;
import virtuozo.showcase.ui.sample.layouts.Tables;
import virtuozo.showcase.ui.sample.layouts.Thumbnails;
import virtuozo.showcase.ui.sample.layouts.Wells;
import virtuozo.ui.FontAwesome;

public class Decorations implements Sample {
  
  @Override
  public String title() {
    return "Decorations";
  }
  
  @Override
  public FontAwesome icon() {
    return FontAwesome.EYE;
  }
  
  @Override
  public void attach(Sampler target) {
    Example.create(target).load(new Labels());
    Example.create(target).load(new Badges());
    
    Example.create(target).load(new PageHeaders());
    Example.create(target).load(new Wells());
    
    Example.create(target).load(new PanelGroups());
    Example.create(target).load(new LayoutPanels());
    
    Example.create(target).load(new Jumbotrons());
    Example.create(target).load(new Carousels());
	  
    Example.create(target).load(new Tables());
	  Example.create(target).load(new Thumbnails());
	  
	  Example.create(target).load(new MediaLists());
	  Example.create(target).load(new ListGroups());

	  Example.create(target).load(new Panels());
  }
}
