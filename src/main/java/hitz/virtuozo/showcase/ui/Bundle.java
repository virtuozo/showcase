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
package hitz.virtuozo.showcase.ui;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;

public class Bundle {
  private static final Images images = GWT.create(Images.class);
  
  public static Images images(){
    return Bundle.images;
  }
  
  public static interface Images extends ClientBundle{
    @Source("hitz/virtuozo/showcase/images/author.jpg")
    ImageResource author();
    
    @Source("hitz/virtuozo/showcase/images/bootstrap.jpg")
    ImageResource bootstrap();
    
    
    @Source("hitz/virtuozo/showcase/images/bootswatch.png")
    ImageResource bootswatch();
    
    @Source("hitz/virtuozo/showcase/images/fontawesome.png")
    ImageResource fontawesome();
    
    @Source("hitz/virtuozo/showcase/images/forge.png")
    ImageResource forge();
    
    @Source("hitz/virtuozo/showcase/images/eclipse.png")
    ImageResource eclipse();
    
    @Source("hitz/virtuozo/showcase/images/gwt.png")
    ImageResource gwt();
    
    @Source("hitz/virtuozo/showcase/images/html5.png")
    ImageResource html5();
    
    @Source("hitz/virtuozo/showcase/images/logo.png")
    ImageResource logo();
    
    @Source("hitz/virtuozo/showcase/images/maven.png")
    ImageResource maven();
    
    @Source("hitz/virtuozo/showcase/images/terminal.png")
    ImageResource terminal();
  }
}
