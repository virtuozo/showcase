package virtuozo.showcase.ui.sample.actions;

import virtuozo.showcase.ui.sample.Fragment;
import virtuozo.ui.Button;
import virtuozo.ui.Modal;
import virtuozo.ui.Paragraph;
import virtuozo.ui.interfaces.HasComponents;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;

public class Modals implements Fragment {

  public void render(HasComponents<?, ?> target) {
    final Modal modal = Modal.create().animate().width(500, Unit.PX);
    modal.header().text("Modal title");
    modal.body().add(Paragraph.create().text("This modal only uses the bootstrap css styles. All the javascript logic is provided by GWT PopupPanel implementation. You can add any Virtuozo component to the Modal body. You can open how much modals you need."));
    
    Button.create().attachTo(modal.footer()).text("Open auto hide modal").onClick(new ClickHandler() {
      
      @Override
      public void onClick(ClickEvent event) {
        Modal inner = Modal.create().autoHide();
        inner.header().text("Another modal");
        inner.body().add(Paragraph.create().text("Realize that its size is proper calculated so far."));
        inner.show();
      }
    });
    
    Button.create().attachTo(target).text("Open animated modal").css(Button.Size.LARGE).onClick(new ClickHandler() {
      @Override
      public void onClick(ClickEvent event) {
        modal.show();
      }
    });
  }
  
  @Override
  public String title() {
    return "Modal";
  }
}