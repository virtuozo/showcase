package virtuozo.showcase.ui.sample.forms;

import virtuozo.showcase.ui.sample.Fragment;
import virtuozo.ui.InputFile;
import virtuozo.ui.interfaces.HasComponents;

public class InputFiles implements Fragment {

  public void render(HasComponents<?, ?> target) {
    InputFile.create().attachTo(target).placeholder("It is a input file with buttons");
  }
  
  @Override
  public String title() {
    return "Input File";
  }
}
