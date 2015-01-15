package virtuozo.showcase.ui.sample.navigation;

import virtuozo.showcase.ui.Bundle;
import virtuozo.showcase.ui.sample.Fragment;
import virtuozo.ui.Paragraph;
import virtuozo.ui.TabPanel;
import virtuozo.ui.TabPanel.TabDroppable;
import virtuozo.ui.interfaces.HasComponents;

public class Tabs implements Fragment {

  public void render(HasComponents<?, ?> target) {
    TabPanel tabs = TabPanel.create().attachTo(target);
    tabs.addTab().text("Home").panel().add(Paragraph.create().text(Bundle.constants().sampleLongText()));
    tabs.addTab().text("Virtuozo").panel().add(Paragraph.create().text(Bundle.constants().headline()));
    
    tabs = TabPanel.create().attachTo(target).css(TabPanel.Type.BLOCK);
    tabs.addTab().text("Home").panel().add(Paragraph.create().text(Bundle.constants().sampleLongText()));
    tabs.addTab().text("Virtuozo").panel().add(Paragraph.create().text(Bundle.constants().headline()));
    
    tabs = TabPanel.create().attachTo(target);
    tabs.addTab().text("Virtuozo").panel().add(Paragraph.create().text(Bundle.constants().headline()));
    TabDroppable tab = tabs.addDropTab().text("Click me");
    tab.addItem().text("Home").panel().add(Paragraph.create().text(Bundle.constants().sampleLongText()));
    tab.addItem().text("Virtuozo").panel().add(Paragraph.create().text(Bundle.constants().headline()));
  }
  
  @Override
  public String title() {
    return "Tab Panel";
  }
}