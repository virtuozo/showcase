package virtuozo.showcase.ui.sample.typography;

import virtuozo.showcase.ui.sample.Fragment;
import virtuozo.ui.DescriptionList;
import virtuozo.ui.interfaces.HasComponents;

public class Descriptions implements Fragment {

  public void render(HasComponents<?, ?> target) {
    DescriptionList list = DescriptionList.vertical().attachTo(target);
    list.addItem("Virtuozo is awesome", "All the best of Java and Web");
    list.addItem("Virtuozo is productive", "Do more with less code");
    
    list = DescriptionList.horizontal().attachTo(target);
    list.addItem("Virtuozo is awesome", "All the best of Java and Web");
    list.addItem("Virtuozo is productive", "Do more with less code");
  }
  
  @Override
  public String title() {
    return "Description List";
  }
}
