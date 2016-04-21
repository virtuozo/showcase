package virtuozo.showcase.ui.sample.datasets;

import virtuozo.infra.AsyncException;
import virtuozo.infra.Consumer;
import virtuozo.infra.DataField;
import virtuozo.infra.JsArrayCallback;
import virtuozo.infra.DataField.Type;
import virtuozo.infra.Dataset;
import virtuozo.infra.HttpClient.PathBuilder;
import virtuozo.infra.HttpMethod.MediaType;
import virtuozo.infra.data.JSObject;
import virtuozo.infra.data.DataBinding.Attribute;
import virtuozo.infra.events.SelectionEvent;
import virtuozo.infra.events.SelectionEvent.SelectionHandler;
import virtuozo.interfaces.DataGrid;
import virtuozo.interfaces.HasComponents;
import virtuozo.interfaces.Notifier;
import virtuozo.interfaces.Notifier.Notification;
import virtuozo.showcase.ui.sample.Fragment;

import com.google.gwt.core.client.JsArray;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.Window;

public class DataGrids implements Fragment {

  @Override
  public String title() {
    return "Data Grid";
  }

  @Override
  public void render(final HasComponents<?, ?> target) {
    final Dataset<JSObject> dataset = Dataset.create();
    dataset.add(DataField.of(Type.STRING).bindingTo(Country.code));
    dataset.add(DataField.of(Type.STRING).bindingTo(Country.name));
    dataset.add(DataField.of(Type.STRING).bindingTo(Country.language));
    
    DataGrid<JSObject> grid = DataGrid.create(dataset).attachTo(target);
    grid.header().text("Country data grid");
    grid.style().height(300, Unit.PX);
    grid.column(Country.code).text("Code");
    grid.column(Country.name).text("Country");
    grid.column(Country.language).text("Language");
    grid.onSelect(new SelectionHandler<JSObject>() {
      @Override
      public void onSelect(SelectionEvent<JSObject> event) {
        Window.alert("Your selection is: \n" + event.value().json().toString());
      }
    });
        
    this.load(new JsArrayCallback<JSObject>() {
      @Override
      public void onFailure(AsyncException exception) {
        Notification notification = Notifier.get().notify(10000);
        notification.header().addText().text("An error has been occurred");
        notification.body().addText().text(exception.getMessage());
        notification.css(Notification.Color.WARNING).show();
      }
      
      @Override
      public void onSuccess(JsArray<JSObject> data) {
        dataset.data(data);
      }
    });
  }
  
  private void load(JsArrayCallback<JSObject> callback){
    CountryConsumer loader = new CountryConsumer();
    loader.list(callback);
  }
  
  public static enum Country implements Attribute {
    code, name, language
  }
  
  class CountryConsumer extends Consumer<JSObject> {
    public CountryConsumer() {
      super(PathBuilder.create("/countries.json"), MediaType.JSON);
    }
  }
}