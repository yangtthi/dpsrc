package singleton_a32;

public class Singleton2 {
    private static Singleton2 singleton = null;
    private Singleton2() {
        System.out.println("生成了一个实例。");
        slowdown();                             
    }
    public static Singleton2 getInstance() {
        if (singleton == null) {
            synchronized (Singleton2.class){
                if(singleton == null){
                    singleton = new Singleton2();
                }
            }
        }
        return singleton;
    }
    private void slowdown() {                   
        try {                                   
            Thread.sleep(1000);                 
        } catch (InterruptedException e) {      
        }                                       
    }                                           
}
