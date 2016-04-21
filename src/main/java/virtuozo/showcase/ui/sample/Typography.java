package virtuozo.showcase.ui.sample;

import virtuozo.interfaces.FontAwesome;
import virtuozo.showcase.ui.Example;
import virtuozo.showcase.ui.sample.typography.Backgrounds;
import virtuozo.showcase.ui.sample.typography.Blockquotes;
import virtuozo.showcase.ui.sample.typography.Codes;
import virtuozo.showcase.ui.sample.typography.Descriptions;
import virtuozo.showcase.ui.sample.typography.Headings;
import virtuozo.showcase.ui.sample.typography.Headlines;
import virtuozo.showcase.ui.sample.typography.InlineTexts;
import virtuozo.showcase.ui.sample.typography.Lists;
import virtuozo.showcase.ui.sample.typography.Paragraphs;
import virtuozo.showcase.ui.sample.typography.TextColors;

public class Typography implements Sample {
  
  @Override
  public String title() {
    return "Typography";
  }
  
  @Override
  public FontAwesome icon() {
    return FontAwesome.FONT;
  }
  
  @Override
  public void attach(Sampler target) {
    
    Example.create(target).load(new Headings());
    Example.create(target).load(new Headlines());
    
    Example.create(target).load(new Paragraphs());
    Example.create(target).load(new Descriptions());
    
    Example.create(target).load(new InlineTexts());
    Example.create(target).load(new Codes());
    
    Example.create(target).load(new TextColors());
    Example.create(target).load(new Backgrounds());
    
    Example.create(target).load(new Blockquotes());
    Example.create(target).load(new Lists());
  }
}
