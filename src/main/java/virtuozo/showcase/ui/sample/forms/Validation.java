package virtuozo.showcase.ui.sample.forms;

import virtuozo.infra.EmailValidator;
import virtuozo.infra.LengthValidator;
import virtuozo.infra.NotEmptyValidator;
import virtuozo.interfaces.Button;
import virtuozo.interfaces.FormGroup;
import virtuozo.interfaces.HasComponents;
import virtuozo.interfaces.InputPassword;
import virtuozo.interfaces.InputText;
import virtuozo.interfaces.RichForm;
import virtuozo.interfaces.css.ButtonColor;
import virtuozo.showcase.ui.sample.Fragment;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;

public class Validation implements Fragment {

  public void render(HasComponents<?, ?> target) {
    final RichForm form = RichForm.vertical().attachTo(target);
    
    final FormGroup<InputText, String> username = form.add(InputText.create());
    username.label().text("Username").show();
    username.helpBlock().text("This field is required and should fill in a valid email address").show();
    username.addValidator(NotEmptyValidator.<String>create());
    username.addValidator(EmailValidator.get());
    
    FormGroup<InputPassword, String> password = form.add(InputPassword.create());
    password.label().text("Password").show();
    password.helpBlock().text("This field is required and should fill in a range length of 5 and 10 characters").show();
    password.addValidator(NotEmptyValidator.<String>create());
    password.addValidator(LengthValidator.create().range(5, 10));
    
    Button.create().attachTo(target).text("Login").css(ButtonColor.PRIMARY).onClick(new ClickHandler() {
      @Override
      public void onClick(ClickEvent event) {
        form.validate();
      }
    });
  }
  
  @Override
  public String title() {
    return "Validation";
  }
}