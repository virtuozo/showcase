package virtuozo.showcase.ui.sample.forms;

import java.util.ArrayList;
import java.util.List;

import virtuozo.infra.Item;
import virtuozo.interfaces.Combo;
import virtuozo.interfaces.FontAwesome;
import virtuozo.interfaces.HasComponents;
import virtuozo.interfaces.LayoutPanel;
import virtuozo.interfaces.Text;
import virtuozo.interfaces.UIComponent;
import virtuozo.interfaces.UIRenderer;
import virtuozo.interfaces.Combo.Matchers;
import virtuozo.showcase.ui.sample.Fragment;

public class Combos implements Fragment {

  public void render(HasComponents<?, ?> target) {
    Combo.create().attachTo(target).add(this.items()).placeholder("Simple combo");
    Combo.create().attachTo(target).add(this.items()).placeholder("Resetable combo").resetable();
    Combo.create().attachTo(target).add(this.items()).placeholder("Searchable combo").searchable(Matchers.STARTS_WITH);
    Combo.create(new SampleRenderer()).attachTo(target).add(this.items()).placeholder("Custom items render");
  }
  
  class SampleRenderer implements UIRenderer<Item>{
    @Override
    public UIComponent render(Item value) {
      return LayoutPanel.horizontal().add(FontAwesome.USER.asComponent().asComponent().css(FontAwesome.Styles.FIXED)).add(Text.create().text(value.value()));
    }
  }
  
  private Iterable<Item> items(){
    List<Item> items = new ArrayList<Item>();
    items.add(Item.create("1", "Administrator"));
    items.add(Item.create("2", "User"));
    return items;
  }
  
  @Override
  public String title() {
    return "Combo";
  }
}
