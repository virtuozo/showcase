package virtuozo.showcase.ui.sample.forms;

import java.util.ArrayList;
import java.util.List;

import virtuozo.infra.MessageFormat;
import virtuozo.showcase.ui.sample.Fragment;
import virtuozo.ui.Autocomplete;
import virtuozo.ui.TypeAhead.ContentProvider;
import virtuozo.ui.interfaces.HasComponents;

public class Autocompletes implements Fragment {

  public void render(HasComponents<?, ?> target) {
    Autocomplete.create().attachTo(target).provider(new ContentProvider<String>() {
      @Override
      public List<String> provideContent(String value, int numberOfItems) {
        List<String> suggestions = new ArrayList<String>();
        
        for(int i = 0; i < numberOfItems; i++){
          suggestions.add(MessageFormat.format("{0}. {1}", i, value));
        }
        
        return suggestions;
      }
    }).placeholder("Please insert at least 3 characters");
  }
  
  @Override
  public String title() {
    return "Type Ahead";
  }
}
