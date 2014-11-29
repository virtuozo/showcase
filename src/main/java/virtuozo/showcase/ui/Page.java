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

import virtuozo.ui.Component;
import virtuozo.ui.Composite;
import virtuozo.ui.Elements;
import virtuozo.ui.Heading;
import virtuozo.ui.PageHeader;
import virtuozo.ui.Paragraph;
import virtuozo.ui.ListGroup.ListGroupItem;

public abstract class Page extends Component<Page> {
  private PageHeader header = new PageHeader();
  
  private PageBody body = new PageBody();

  public Page(String title) {
    super(Elements.div());
    this.addChild(this.header).addChild(this.body).css("page");
    this.header.text(title);
  }
  
  protected Callout addCallout(Callout.Color color){
    Callout callout = new Callout();
    callout.css(color);
    this.body.add(callout);
    return callout;
  }
  
  protected Heading addTitle(){
    Heading heading = new Heading(Heading.Level.THREE);
    this.body.add(heading);
    return heading;
  }
  
  protected Heading addSubtitle(){
    Heading heading = new Heading(Heading.Level.FOUR);
    this.body.add(heading);
    return heading;
  }
  
  protected Paragraph addText(){
    Paragraph text = new Paragraph();
    this.body.add(text);
    return text;
  }
  
  protected Example addExample(){
    Example example = new Example();
    this.body.add(example);
    return example;
  }

  protected PageHeader header() {
    return this.header;
  }

  protected PageBody body() {
    return this.body;
  }

  public abstract Page summary(ListGroupItem item);

  public class PageBody extends Composite<PageBody> {
    public PageBody() {
      super(Elements.div());
      this.css().set("page-body");
    }
  }
}