package virtuozo.showcase.ui.sample.forms;

import java.util.Date;

import virtuozo.showcase.ui.sample.Fragment;
import virtuozo.ui.Checkbox;
import virtuozo.ui.Combo;
import virtuozo.ui.Combo.Item;
import virtuozo.ui.Datepicker;
import virtuozo.ui.FontAwesome;
import virtuozo.ui.FormGroup;
import virtuozo.ui.InputFile;
import virtuozo.ui.InputNumber;
import virtuozo.ui.InputPassword;
import virtuozo.ui.InputText;
import virtuozo.ui.RadioButton;
import virtuozo.ui.RichForm;
import virtuozo.ui.Spinner;
import virtuozo.ui.TextArea;
import virtuozo.ui.css.ButtonColor;
import virtuozo.ui.interfaces.HasComponents;

public class Vertical implements Fragment {

  public void render(HasComponents<?, ?> target) {
    RichForm form = RichForm.vertical().attachTo(target);
    
    final FormGroup<InputText, String> username = form.add(InputText.create());
    username.label().text("Username").show();
    username.helpBlock().text("Fill out your username here").show();
    
    FormGroup<InputPassword, String> password = form.add(InputPassword.create());
    password.label().text("Password").show();
    password.helpBlock().text("Fill out your password here").show();
    
    FormGroup<Datepicker, Date> expiration = form.add(Datepicker.create().icon(FontAwesome.CALENDAR_O));
    expiration.label().text("Expiration").show();
    
    FormGroup<Combo, Item> profile = form.add(Combo.create().placeholder("Please, select").resetable());
    profile.label().text("Profile").show();
    profile.control().item(Item.create("Administrator"));
    profile.control().item(Item.create("Viewer"));
    
    FormGroup<InputFile, String> photo = form.add(InputFile.create());
    photo.label().text("Photo").show();
    
    FormGroup<InputNumber, Integer> number = form.add(InputNumber.create());
    number.label().text("Number").show();
    
    FormGroup<TextArea, String> bio = form.add(TextArea.create().rows(5));
    bio.label().text("Bio").show();
    
    FormGroup<Spinner, Integer> spinner = form.add(Spinner.create());
    spinner.label().text("Spinner").show();
    
    FormGroup<Checkbox, String> active = form.add(Checkbox.create());
    active.label().text("Active").show();
    
    FormGroup<RadioButton, String> enable = form.add(RadioButton.create("github"));
    enable.label().text("Enable github integration").show();
    
    FormGroup<RadioButton, String> disable = form.add(RadioButton.create("github"));
    disable.label().text("Disable github integration").show();
    
    form.footer().addButton().text("Save").css(ButtonColor.PRIMARY);
    form.footer().addButton().text("Cancel");
  }
  
  @Override
  public String title() {
    return "Vertical Form";
  }
}