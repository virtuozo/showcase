package virtuozo.showcase.ui.sample.forms;

import java.util.ArrayList;
import java.util.List;

import virtuozo.infra.Item;
import virtuozo.showcase.ui.sample.Fragment;
import virtuozo.ui.Combo;
import virtuozo.ui.Combo.Matchers;
import virtuozo.ui.FontAwesome;
import virtuozo.ui.LayoutPanel;
import virtuozo.ui.Text;
import virtuozo.ui.interfaces.HasComponents;
import virtuozo.ui.interfaces.UIComponent;
import virtuozo.ui.interfaces.UIRenderer;

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
