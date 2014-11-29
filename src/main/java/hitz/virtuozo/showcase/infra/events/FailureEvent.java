package hitz.virtuozo.showcase.infra.events;

import hitz.virtuozo.infra.Event;

public class FailureEvent extends Event<Exception>{
  @Override
  protected String name() {
    return this.getClass().getName();
  }
}
