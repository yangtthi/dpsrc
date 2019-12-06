package singleton_a1;


public class TicketMaker_thread_unsafety {
    private int ticket = 1000;
    private static TicketMaker_thread_unsafety singleton = new TicketMaker_thread_unsafety();
    private TicketMaker_thread_unsafety() {
    }                                                               
    public static TicketMaker_thread_unsafety getInstance() {
        return singleton;                                           
    }                                                               
    public int getNextTicketNumber() {
        return ticket++;
    }
}
