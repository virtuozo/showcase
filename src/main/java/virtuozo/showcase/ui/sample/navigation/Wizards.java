package virtuozo.showcase.ui.sample.navigation;

import virtuozo.interfaces.ButtonGroup;
import virtuozo.interfaces.HasComponents;
import virtuozo.interfaces.InputPassword;
import virtuozo.interfaces.InputText;
import virtuozo.interfaces.RichForm;
import virtuozo.interfaces.Wizard;
import virtuozo.interfaces.css.ButtonColor;
import virtuozo.showcase.ui.sample.Fragment;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;

public class Wizards implements Fragment {

  public void render(HasComponents<?, ?> target) {
    final Wizard wizard = Wizard.create().attachTo(target);
    RichForm form = RichForm.vertical();
    form.add(InputText.create()).label().text("Username").show();
    form.add(InputPassword.create()).label().text("Password").show();
    wizard.addStep().text("Step 1").add(form);
    
    form = RichForm.vertical();
    form.add(InputText.create()).label().text("Name").show();
    form.add(InputPassword.create()).label().text("E-mail").show();
    wizard.addStep().text("Step 2").add(form);
    
    ButtonGroup group = ButtonGroup.horizontal().attachTo(target);
    group.addButton().css(ButtonColor.PRIMARY).text("Default").onClick(new ClickHandler() {
      
      @Override
      public void onClick(ClickEvent event) {
        wizard.css(Wizard.Color.DEFAULT);
      }
    });
    group.addButton().css(ButtonColor.INFO).text("INFO").onClick(new ClickHandler() {
      
      @Override
      public void onClick(ClickEvent event) {
        wizard.css(Wizard.Color.INFO);
      }
    });
    group.addButton().css(ButtonColor.SUCCESS).text("SUCCESS").onClick(new ClickHandler() {
      
      @Override
      public void onClick(ClickEvent event) {
        wizard.css(Wizard.Color.SUCCESS);
      }
    });
    group.addButton().css(ButtonColor.WARNING).text("WARNING").onClick(new ClickHandler() {
      
      @Override
      public void onClick(ClickEvent event) {
        wizard.css(Wizard.Color.WARNING);
      }
    });
    group.addButton().css(ButtonColor.DANGER).text("DANGER").onClick(new ClickHandler() {
      
      @Override
      public void onClick(ClickEvent event) {
        wizard.css(Wizard.Color.DANGER);
      }
    });

  }
  
  @Override
  public String title() {
    return "Wizard";
  }
}
