package abs_sample.tablefactory;
import abs_sample.factory.Page;

public class TableFactory extends abs_sample.factory.Factory {
    public abs_sample.factory.Link createLink(String caption, String url) {
        return new abs_sample.tablefactory.TableLink(caption, url);
    }
    public abs_sample.factory.Tray createTray(String caption) {
        return new abs_sample.tablefactory.TableTray(caption);
    }
    public Page createPage(String title, String author) {
        return new abs_sample.tablefactory.TablePage(title, author);
    }
}
