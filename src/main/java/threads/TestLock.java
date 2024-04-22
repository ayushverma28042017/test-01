package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestLock {
    static Lock lock = new ReentrantLock();
    static ExecutorService e = Executors.newFixedThreadPool(1);


    public static void main(String[] args) throws InterruptedException {
        TestLock testLock = new TestLock();
        Thread t = new Thread(()-> {
            try {
                testLock.testLock(10,lock);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
//        e.execute(t);
        Future result =e.submit(t);
        while (!result.isDone()){
            System.out.println("WAITNG>>>>>>>>>>>>");
        }

      //  t.start();
        testLock.testLock(5,lock);

    }

     void testLock(int i,Lock lock) throws InterruptedException {
        lock.lock();
        System.out.println(Thread.currentThread().getName());
        System.out.println(i);
        Thread.sleep(10);
        lock.unlock();

    }
}
