package virtuozo.showcase.ui.sample;

import virtuozo.interfaces.FontAwesome;
import virtuozo.showcase.ui.Example;
import virtuozo.showcase.ui.sample.datasets.DataGrids;

public class DataSets implements Sample {
  
  @Override
  public String title() {
    return "Data Sets";
  }
  
  @Override
  public FontAwesome icon() {
    return FontAwesome.LIST;
  }
  
  @Override
  public void attach(Sampler target) {
    Example.create(target).load(new DataGrids());
  }
}
