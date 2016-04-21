package virtuozo.showcase.ui.sample;

import virtuozo.interfaces.FontAwesome;
import virtuozo.showcase.ui.Example;
import virtuozo.showcase.ui.sample.forms.Autocompletes;
import virtuozo.showcase.ui.sample.forms.Checkboxes;
import virtuozo.showcase.ui.sample.forms.Combos;
import virtuozo.showcase.ui.sample.forms.Datepickers;
import virtuozo.showcase.ui.sample.forms.Horizontal;
import virtuozo.showcase.ui.sample.forms.InputFiles;
import virtuozo.showcase.ui.sample.forms.InputGroups;
import virtuozo.showcase.ui.sample.forms.InputNumbers;
import virtuozo.showcase.ui.sample.forms.InputTexts;
import virtuozo.showcase.ui.sample.forms.RadioButtons;
import virtuozo.showcase.ui.sample.forms.Spinners;
import virtuozo.showcase.ui.sample.forms.TextAreas;
import virtuozo.showcase.ui.sample.forms.Validation;
import virtuozo.showcase.ui.sample.forms.Vertical;

public class Forms implements Sample {
  
  @Override
  public String title() {
    return "Forms";
  }
  
  @Override
  public FontAwesome icon() {
    return FontAwesome.EDIT;
  }
  
  @Override
  public void attach(Sampler target) {
    Example.create(target).load(new Autocompletes());
    Example.create(target).load(new Checkboxes());
    Example.create(target).load(new Combos());
    Example.create(target).load(new Datepickers());
    Example.create(target).load(new InputFiles());
    Example.create(target).load(new InputGroups());
    Example.create(target).load(new InputNumbers());
    Example.create(target).load(new InputTexts());
    Example.create(target).load(new RadioButtons());
    Example.create(target).load(new Spinners());
    Example.create(target).load(new TextAreas());
    
    Example.create(target).load(new Horizontal());
    Example.create(target).load(new Vertical());
    Example.create(target).load(new Validation());
  }
}
