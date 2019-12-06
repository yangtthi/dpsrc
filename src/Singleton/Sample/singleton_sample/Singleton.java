package singleton_sample;

public class Singleton {
    private static Singleton singleton = new Singleton();
    private Singleton() {                                 
        System.out.println("生成了一个实例。");
    }
    public static Singleton getInstance() {
        System.out.println("获取了一个实例。");
        return singleton;
    }
}
