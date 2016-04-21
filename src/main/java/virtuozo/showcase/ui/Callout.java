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

import virtuozo.infra.Elements;
import virtuozo.infra.StyleChooser;
import virtuozo.interfaces.Component;
import virtuozo.interfaces.CssClass;
import virtuozo.interfaces.Heading;
import virtuozo.interfaces.Paragraph;
import virtuozo.interfaces.UIComponent;

public class Callout extends Component<Callout> {
  
  public static Callout danger(){
    return new Callout().css(Callout.Color.DANGER);
  }
  
  public static Callout info(){
    return new Callout().css(Callout.Color.INFO);
  }
  
  public static Callout warning(){
    return new Callout().css(Callout.Color.WARNING);
  }
  
  private Callout() {
    super(Elements.div());
    this.css().set("callout");
  }
  
  public Heading addHeading(){
    Heading heading = Heading.four();
    this.addChild(heading);
    return heading;
  }
  
  public Paragraph addText(){
    Paragraph text = Paragraph.create();
    this.addChild(text);
    return text;
  }
  
  public Callout add(UIComponent widget){
    return this.addChild(widget);
  }

  static class Color extends CssClass {
    private Color(String name) {
      super(name);
    }

    @Override
    protected StyleChooser chooser() {
      return STYLES;
    }

    public static final Color INFO = new Color("callout-info");
    public static final Color DANGER = new Color("callout-danger");
    public static final Color WARNING = new Color("callout-warning");
    private static final StyleChooser STYLES = new StyleChooser(INFO, DANGER, WARNING);
  }
}