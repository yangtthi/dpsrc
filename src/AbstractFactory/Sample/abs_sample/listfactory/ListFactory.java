package abs_sample.listfactory;
import abs_sample.factory.Page;

public class ListFactory extends abs_sample.factory.Factory {
    public abs_sample.factory.Link createLink(String caption, String url) {
        return new abs_sample.listfactory.ListLink(caption, url);
    }
    public abs_sample.factory.Tray createTray(String caption) {
        return new abs_sample.listfactory.ListTray(caption);
    }
    public Page createPage(String title, String author) {
        return new abs_sample.listfactory.ListPage(title, author);
    }
}
