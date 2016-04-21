package virtuozo.showcase.ui.sample.forms;

import virtuozo.infra.Item;
import virtuozo.infra.data.Calendar;
import virtuozo.interfaces.Checkbox;
import virtuozo.interfaces.Combo;
import virtuozo.interfaces.Datepicker;
import virtuozo.interfaces.FontAwesome;
import virtuozo.interfaces.FormGroup;
import virtuozo.interfaces.HasComponents;
import virtuozo.interfaces.InputFile;
import virtuozo.interfaces.InputNumber;
import virtuozo.interfaces.InputPassword;
import virtuozo.interfaces.InputText;
import virtuozo.interfaces.RadioButton;
import virtuozo.interfaces.RichForm;
import virtuozo.interfaces.Spinner;
import virtuozo.interfaces.TextArea;
import virtuozo.showcase.ui.sample.Fragment;

public class Vertical implements Fragment {

  public void render(HasComponents<?, ?> target) {
    RichForm form = RichForm.vertical().attachTo(target);
    
    final FormGroup<InputText, String> username = form.add(InputText.create());
    username.label().text("Username").show();
    username.helpBlock().text("Fill out your username here").show();
    
    FormGroup<InputPassword, String> password = form.add(InputPassword.create());
    password.label().text("Password").show();
    password.helpBlock().text("Fill out your password here").show();
    
    FormGroup<Datepicker, Calendar> expiration = form.add(Datepicker.create().icon(FontAwesome.CALENDAR_O));
    expiration.label().text("Expiration").show();
    
    FormGroup<Combo, Item> profile = form.add(Combo.create().placeholder("Please, select").resetable());
    profile.label().text("Profile").show();
    profile.control().add(Item.create("Administrator"));
    profile.control().add(Item.create("Viewer"));
    
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
  }
  
  @Override
  public String title() {
    return "Vertical Form";
  }
}