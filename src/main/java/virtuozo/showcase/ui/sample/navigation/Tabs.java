package virtuozo.showcase.ui.sample.navigation;

import virtuozo.interfaces.HasComponents;
import virtuozo.interfaces.Paragraph;
import virtuozo.interfaces.TabPanel;
import virtuozo.interfaces.TabPanel.TabDroppable;
import virtuozo.showcase.ui.Bundle;
import virtuozo.showcase.ui.sample.Fragment;

public class Tabs implements Fragment {

  public void render(HasComponents<?, ?> target) {
    TabPanel tabs = TabPanel.create().attachTo(target);
    tabs.addTab().text("Home").panel().add(Paragraph.create().text(Bundle.words().sampleLongText()));
    tabs.addTab().text("Virtuozo").panel().add(Paragraph.create().text(Bundle.words().headline()));
    
    tabs = TabPanel.create().attachTo(target).css(TabPanel.Type.BLOCK);
    tabs.addTab().text("Home").panel().add(Paragraph.create().text(Bundle.words().sampleLongText()));
    tabs.addTab().text("Virtuozo").panel().add(Paragraph.create().text(Bundle.words().headline()));
    
    tabs = TabPanel.create().attachTo(target);
    tabs.addTab().text("Virtuozo").panel().add(Paragraph.create().text(Bundle.words().headline()));
    TabDroppable tab = tabs.addDropTab().text("Click me");
    tab.addItem().text("Home").panel().add(Paragraph.create().text(Bundle.words().sampleLongText()));
    tab.addItem().text("Virtuozo").panel().add(Paragraph.create().text(Bundle.words().headline()));
  }
  
  @Override
  public String title() {
    return "Tab Panel";
  }
}