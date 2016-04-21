package virtuozo.showcase.ui;

import virtuozo.infra.Elements;
import virtuozo.infra.HttpClient.PathBuilder;
import virtuozo.interfaces.Component;
import virtuozo.interfaces.OrderList;
import virtuozo.interfaces.Tag;

import com.google.gwt.dom.client.Element;

public class GithubButtons extends Component<GithubButtons> {
  private String user;

  private String repository;

  private OrderList list = OrderList.unordered().css("github-buttons");

  public GithubButtons(String user, String repository) {
    this.user = user;
    this.repository = repository;
    this.incorporate(this.list);
  }

  public GithubButtons add(Type type) {
    Tag<Element> button = Tag.as(Elements.create("iframe")).css("github-btn");
    PathBuilder src = PathBuilder.create("http://ghbtns.com/github-btn.html");
    src.addQueryParam("user", this.user).addQueryParam("repo", this.repository);
    type.appendTo(src);

    button.attribute("src", src.toString());
    button.attribute("allowtransparency", "true");
    button.attribute("frameborder", "0");
    button.attribute("scrolling", "no");
    button.attribute("width", type.width());
    button.attribute("height", type.height());

    this.list.addItem().add(button);
    
    return this;
  }

  public enum Type {
    FOLLOW {
      @Override
      String width() {
        return "120";
      }
    }, 
    FOLLOW_COUNT {
      @Override
      String width() {
        return "165";
      }
      
      @Override
      void appendTo(PathBuilder src) {
        super.appendTo(src);
        src.addQueryParam("count", "true");
      }
    },
    FORK {
      @Override
      String width() {
        return "53";
      }
    },
    FORK_COUNT{
      @Override
      String width() {
        return "95";
      }
      
      @Override
      void appendTo(PathBuilder src) {
        super.appendTo(src);
        src.addQueryParam("count", "true");
      }
    },
    WATCH{
      @Override
      String width() {
        return "52";
      }
    },
    WATCH_COUNT{
      @Override
      String width() {
        return "110";
      }
      
      @Override
      void appendTo(PathBuilder src) {
        super.appendTo(src);
        src.addQueryParam("count", "true");
      }
    };

    void appendTo(PathBuilder src) {
      src.addQueryParam("type", this.name().toLowerCase().replace("_count", ""));
    }

    abstract String width();

    String height() {
      return "20";
    }
  }
}