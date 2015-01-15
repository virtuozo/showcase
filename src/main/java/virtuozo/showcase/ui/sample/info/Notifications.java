package virtuozo.showcase.ui.sample.info;

import virtuozo.showcase.ui.sample.Fragment;
import virtuozo.ui.ButtonGroup;
import virtuozo.ui.Notifier;
import virtuozo.ui.Notifier.Notification;
import virtuozo.ui.css.ButtonColor;
import virtuozo.ui.interfaces.HasComponents;
import virtuozo.ui.interfaces.UIClass;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;

public class Notifications implements Fragment {

  public void render(HasComponents<?, ?> target) {
    ButtonGroup group = ButtonGroup.horizontal().attachTo(target);
    group.addButton().text("DEFAULT").onClick(new ClickHandler() {
      
      @Override
      public void onClick(ClickEvent event) {
        Notifications.this.notify(Notification.Color.DEFAULT);
      }
    });
    group.addButton().text("ERROR").css(ButtonColor.DANGER).onClick(new ClickHandler() {
      
      @Override
      public void onClick(ClickEvent event) {
        Notifications.this.notify(Notification.Color.DANGER);
      }
    });
    group.addButton().text("INFO").css(ButtonColor.INFO).onClick(new ClickHandler() {
      
      @Override
      public void onClick(ClickEvent event) {
        Notifications.this.notify(Notification.Color.INFO);
      }
    });
    group.addButton().text("SUCCESS").css(ButtonColor.SUCCESS).onClick(new ClickHandler() {
      
      @Override
      public void onClick(ClickEvent event) {
        Notifications.this.notify(Notification.Color.SUCCESS);
      }
    });
    group.addButton().text("WARNING").css(ButtonColor.WARNING).onClick(new ClickHandler() {
      
      @Override
      public void onClick(ClickEvent event) {
        Notifications.this.notify(Notification.Color.WARNING);
      }
    });
    group.addButton().text("LARGE").onClick(new ClickHandler() {
      
      @Override
      public void onClick(ClickEvent event) {
        Notifications.this.notify(Notification.Size.LARGE);
      }
    });
    group.addButton().text("NORMAL").onClick(new ClickHandler() {
      
      @Override
      public void onClick(ClickEvent event) {
        Notifications.this.notify(Notification.Size.NORMAL);
      }
    });
    group.addButton().text("SMALL").onClick(new ClickHandler() {
      
      @Override
      public void onClick(ClickEvent event) {
        Notifications.this.notify(Notification.Size.SMALL);
      }
    });
  }
  
  private void notify(UIClass clazz){
    Notification notification = Notifier.get().notify(5000).css(clazz);
    notification.header().addText().text("Put the title here");
    notification.body().addText().text("Put the message here");
    notification.show();
  }
  
  @Override
  public String title() {
    return "Notification";
  }
}