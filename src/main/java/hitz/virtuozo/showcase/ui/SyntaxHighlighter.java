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

public class SyntaxHighlighter {
  private static final SyntaxHighlighter instance = new SyntaxHighlighter();

  public static SyntaxHighlighter get() {
    return instance;
  }

  public native String css(String code)/*-{
		var params = {};
		params['toolbar'] = false;
		var brush = new $wnd.SyntaxHighlighter.brushes.CSS();
		brush.init(params);
		return brush.getHtml(code);
  }-*/;

  public native String java(String code)/*-{
		var params = {};
		params['toolbar'] = false;
		var brush = new $wnd.SyntaxHighlighter.brushes.Java();
		brush.init(params);
		return brush.getHtml(code);
  }-*/;

  public native String xml(String code)/*-{
		var params = {};
		params['toolbar'] = false;
		var brush = new $wnd.SyntaxHighlighter.brushes.Xml();
		brush.init(params);
		return brush.getHtml(code);
  }-*/;
}