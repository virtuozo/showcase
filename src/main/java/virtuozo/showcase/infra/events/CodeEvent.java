package virtuozo.showcase.infra.events;

import virtuozo.infra.Event;

public class CodeEvent extends Event<String>{
  @Override
  protected String name() {
    return this.getClass().getName();
  }
}
