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

import virtuozo.showcase.i18n.Constants;
import virtuozo.showcase.i18n.Messages;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;

public class Bundle {
  private static final Images images = GWT.create(Images.class);
  
  private static final Samples samples = GWT.create(Samples.class);
  
  private static final Constants contants = GWT.create(Constants.class);
  
  private static final Messages messages = GWT.create(Messages.class);
  
  public static Images images(){
    return Bundle.images;
  }
  
  public static Samples samples(){
    return Bundle.samples;
  }
  
  public static Constants words(){
    return Bundle.contants;
  }
  
  public static Messages messages() {
    return messages;
  }
  
  public static interface Samples extends ClientBundle{
    @Source("virtuozo/showcase/images/sample/layout-bare.png")
    ImageResource bare();
    
    @Source("virtuozo/showcase/images/sample/layout-landing.png")
    ImageResource landing();
    
    @Source("virtuozo/showcase/images/sample/layout-hero.png")
    ImageResource hero();
    
    @Source("virtuozo/showcase/images/sample/layout-sticky.png")
    ImageResource sticky();
    
    @Source("virtuozo/showcase/images/sample/layout-side.png")
    ImageResource side();
    
    @Source("virtuozo/showcase/images/sample/lg-husky.jpg")
    ImageResource largeHusky();
    
    @Source("virtuozo/showcase/images/sample/lg-york.jpg")
    ImageResource largeYork();
    
    @Source("virtuozo/showcase/images/sample/md-husky.jpg")
    ImageResource mediumHusky();
    
    @Source("virtuozo/showcase/images/sample/md-york.jpg")
    ImageResource mediumYork();

    @Source("virtuozo/showcase/images/sample/sm-husky.jpg")
    ImageResource smallHusky();

    @Source("virtuozo/showcase/images/sample/sm-york.jpg")
    ImageResource smallYork();
  }
  
  public static interface Images extends ClientBundle{
    @Source("virtuozo/showcase/images/bootstrap.jpg")
    ImageResource bootstrap();
    
    @Source("virtuozo/showcase/images/bootswatch.png")
    ImageResource bootswatch();
    
    @Source("virtuozo/showcase/images/fontawesome.png")
    ImageResource fontawesome();
    
    @Source("virtuozo/showcase/images/forge.png")
    ImageResource forge();
    
    @Source("virtuozo/showcase/images/gwt.png")
    ImageResource gwt();
    
    @Source("virtuozo/showcase/images/html5.png")
    ImageResource html5();
    
    @Source("virtuozo/showcase/images/logo.png")
    ImageResource logo();
    
    @Source("virtuozo/showcase/images/sm-logo.png")
    ImageResource smallLogo();
    
    @Source("virtuozo/showcase/images/xs-logo.png")
    ImageResource xsmallLogo();
  }
}
