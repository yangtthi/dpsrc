package singleton_a1;

import java.util.concurrent.atomic.AtomicInteger;

public class TicketMaker_atomic {
    private AtomicInteger ticket = new AtomicInteger(1000);
    private static TicketMaker_atomic singleton = new TicketMaker_atomic();
    private TicketMaker_atomic() {
    }                                                               
    public static TicketMaker_atomic getInstance() {
        return singleton;                                           
    }                                                               
    public int getNextTicketNumber() {
        return ticket.addAndGet(1);
    }
}
