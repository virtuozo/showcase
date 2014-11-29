/**
 * Copyright (C) 2004-2014 the original author or authors. See the notice.md file distributed with
 * this work for additional information regarding copyright ownership.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package virtuozo.showcase.infra;

import virtuozo.infra.Rest;
import virtuozo.infra.BrowserStorage.StoreKey;
import virtuozo.infra.Rest.PathBuilder;
import virtuozo.infra.RestMethod.MediaType;
import virtuozo.infra.api.RestException;
import virtuozo.infra.api.TextCallback;
import virtuozo.showcase.infra.events.CodeEvent;
import virtuozo.showcase.infra.events.FailureEvent;
import virtuozo.ui.Component;
import virtuozo.ui.Elements;

public class CodeConsumer implements TextCallback {
  private static final CodeConsumer instance = new CodeConsumer();

  public static CodeConsumer get() {
    return instance;
  }

  public CodeConsumer load(String code) {
    Rest rest = new Rest(PathBuilder.get("code-server").addQueryParam("class", code));
    rest.get().accept(MediaType.TEXT).send(this);
    return this;
  }

  @Override
  public void onFailure(RestException exception) {
    FailureEvent event = new FailureEvent();
    event.publish().with(exception).fire();
  }

  @Override
  public void onSuccess(String response) {
    CodeEvent event = new CodeEvent();
    event.publish().with(response).fire();
  }
  
  public static class Code extends Component<Code> {
    public Code() {
      super(Elements.div());
      this.css().set("highlight");
    }

    public Code add(String code) {
      this.element().setInnerHTML(code);
      return this;
    }
  }

  public static enum Key implements StoreKey {
    SAMPLE_CODE
  }
}