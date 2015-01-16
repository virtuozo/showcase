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
package virtuozo.showcase.ui;

import virtuozo.showcase.infra.CodeConsumer;
import virtuozo.showcase.infra.CodeConsumer.CodeCallback;
import virtuozo.showcase.ui.sample.Sampler;
import virtuozo.showcase.ui.sample.Snippet;
import virtuozo.ui.Component;
import virtuozo.ui.Elements;
import virtuozo.ui.Tag;

import com.google.gwt.dom.client.DivElement;

public class Document extends Component<Document> {
  private Tag<DivElement> sample = Tag.asDiv().css("doc");
  private Tag<DivElement> code = Tag.asDiv().css("highlight");
  private Sampler sampler;

  private Document() {
    super(Elements.div());
    this.addChild(this.sample).addChild(this.code);
  }
  
  public static Document create(Sampler target){
    Document example = new Document();
    example.sampler = target;
    target.add(example);
    return example;
  }

  public Document load(Snippet target){
    CodeConsumer.get().load(target.snippet(), new CodeCallback() {
      @Override
      public void onCodeResponse(String code) {
        Document.this.code.html(SyntaxHighlighter.get().java(code));
      }
    });
    
    target.render(this.sample);
    this.sampler.add(target, this);
    return this;
  }
  
  public Document code(String code){
    Document.this.code.html(SyntaxHighlighter.get().java(code));
    return this;
  }
}