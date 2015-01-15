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
import virtuozo.ui.CssClass;
import virtuozo.ui.Elements;
import virtuozo.ui.Heading;
import virtuozo.ui.Paragraph;
import virtuozo.ui.StyleChooser;
import virtuozo.ui.interfaces.UIComponent;

public class Callout extends Component<Callout> {
  
  public Callout() {
    super(Elements.div());
    this.css().set("bs-callout");
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

  public static class Color extends CssClass {
    private Color(String name) {
      super(name);
    }

    @Override
    protected StyleChooser chooser() {
      return STYLES;
    }

    public static final Color INFO = new Color("bs-callout-info");
    public static final Color DANGER = new Color("bs-callout-danger");
    public static final Color WARNING = new Color("bs-callout-warning");
    private static final StyleChooser STYLES = new StyleChooser(INFO, DANGER, WARNING);
  }
}