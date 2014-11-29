package virtuozo.showcase.infra.events;

import virtuozo.infra.Event;

public class FailureEvent extends Event<Exception>{
  @Override
  protected String name() {
    return this.getClass().getName();
  }
}
