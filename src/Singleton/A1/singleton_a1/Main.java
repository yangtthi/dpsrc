package singleton_a1;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    private static ExecutorService executors = Executors.newFixedThreadPool(100);

    public static void main(String[] args) {
        int count = 1000000;
        long createTime = System.currentTimeMillis();
        Set<Integer> set = Collections.synchronizedSet(new HashSet<>());
        System.out.println("Start.");
        CountDownLatch latch = new CountDownLatch(count);
        for (int i = 0; i < count; i++) {
            final int index = i;
            executors.execute(new Runnable() {
                @Override
                public void run() {
                    int num = TicketMaker_atomic.getInstance().getNextTicketNumber();
                    set.add(num);
                    System.out.println(index + ":" + num);
                    latch.countDown();
                }
            });
        }
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        executors.shutdown();
        System.out.println(set.size());
        long endTime = System.currentTimeMillis();
        System.out.println("End." + (endTime - createTime));

    }


}
