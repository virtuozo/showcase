package virtuozo.showcase.ui.sample.forms;

import java.util.ArrayList;
import java.util.List;

import virtuozo.infra.MessageFormat;
import virtuozo.interfaces.Autocomplete;
import virtuozo.interfaces.FontAwesome;
import virtuozo.interfaces.HasComponents;
import virtuozo.interfaces.LayoutPanel;
import virtuozo.interfaces.Text;
import virtuozo.interfaces.UIComponent;
import virtuozo.interfaces.UIRenderer;
import virtuozo.interfaces.TypeAhead.ContentProvider;
import virtuozo.showcase.ui.sample.Fragment;

public class Autocompletes implements Fragment {

  public void render(HasComponents<?, ?> target) {
    Autocomplete.create().attachTo(target).provider(new SampleProvider()).placeholder("Please insert at least 3 characters. You can also, use arrow keys to navigate in the results and enter or escape keys.");
    
    Autocomplete.create(new SampleRenderer()).attachTo(target).provider(new SampleProvider()).placeholder("Instant completion and custom renderer").triggerAutoComplete(1);
  }
  
  class SampleRenderer implements UIRenderer<String>{
    @Override
    public UIComponent render(String value) {
      return LayoutPanel.horizontal().add(FontAwesome.USER.asComponent().asComponent().css(FontAwesome.Styles.FIXED)).add(Text.create().text(value));
    }
  }
  
  class SampleProvider implements ContentProvider<String> {
    @Override
    public List<String> provideContent(String value, int numberOfItems) {
      List<String> suggestions = new ArrayList<String>();
      
      for(int i = 0; i < numberOfItems; i++){
        suggestions.add(MessageFormat.format("{0}. {1}", i, value));
      }
      
      return suggestions;
    }
  }
  
  @Override
  public String title() {
    return "Auto Complete";
  }
}
