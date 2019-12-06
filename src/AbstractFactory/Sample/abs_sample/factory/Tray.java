package abs_sample.factory;

import java.util.ArrayList;

public abstract class Tray extends abs_sample.factory.Item {
    protected ArrayList tray = new ArrayList();
    public Tray(String caption) {
        super(caption);
    }
    public void add(abs_sample.factory.Item item) {
        tray.add(item);
    }
}
