package virtuozo.showcase.ui.sample.navigation;

import virtuozo.showcase.ui.Bundle;
import virtuozo.showcase.ui.sample.Fragment;
import virtuozo.ui.Paragraph;
import virtuozo.ui.TabPanel;
import virtuozo.ui.TabPanel.TabDroppable;
import virtuozo.ui.api.HasComponents;

public class Tabs implements Fragment {

  public void render(HasComponents<?, ?> target) {
    TabPanel tabs = new TabPanel().attachTo(target);
    tabs.addTab().text("Home").panel().add(new Paragraph().text(Bundle.constants().sampleLongText()));
    tabs.addTab().text("Virtuozo").panel().add(new Paragraph().text(Bundle.constants().headline()));
    
    tabs = new TabPanel().attachTo(target).css(TabPanel.Type.BLOCK);
    tabs.addTab().text("Home").panel().add(new Paragraph().text(Bundle.constants().sampleLongText()));
    tabs.addTab().text("Virtuozo").panel().add(new Paragraph().text(Bundle.constants().headline()));
    
    tabs = new TabPanel().attachTo(target);
    tabs.addTab().text("Virtuozo").panel().add(new Paragraph().text(Bundle.constants().headline()));
    TabDroppable tab = tabs.addDropTab().text("Click me");
    tab.addItem().text("Home").panel().add(new Paragraph().text(Bundle.constants().sampleLongText()));
    tab.addItem().text("Virtuozo").panel().add(new Paragraph().text(Bundle.constants().headline()));
  }
}