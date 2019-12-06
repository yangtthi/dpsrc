package abs_sample.factory;

public abstract class Factory {
    public static Factory getFactory(String classname) {
        Factory factory = null;
        try {
            factory = (Factory)Class.forName(classname).newInstance();
        } catch (ClassNotFoundException e) {
            System.err.println("没有找到 " + classname + "类。");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return factory;
    }
    public abstract abs_sample.factory.Link createLink(String caption, String url);
    public abstract abs_sample.factory.Tray createTray(String caption);
    public abstract abs_sample.factory.Page createPage(String title, String author);
}
