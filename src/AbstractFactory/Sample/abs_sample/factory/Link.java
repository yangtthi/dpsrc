package abs_sample.factory;

public abstract class Link extends abs_sample.factory.Item {
    protected String url;
    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }
}
