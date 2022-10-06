package Algorithms;

import java.util.concurrent.*;
import java.util.concurrent.locks.*;

/**
 *
 */
public class RunExecutor {

    void method() {
        Runnable r = () -> System.out.println("000000000" + " : " + Thread.currentThread().getName());
        ExecutorService exc = Executors.newFixedThreadPool(4);
        for (int i = 0; i < 5; i++) {
            exc.execute(r);
        }

        System.out.println("-------");
//        new Thread(r).start();
        exc.shutdown();
    }

    void method1() {
        Callable<String> task = () -> {
            Thread.sleep(300);
            return "Im  in the thread" + Thread.currentThread().getName();
        };

        ExecutorService es = Executors.newFixedThreadPool(4);
        for (int i = 0; i < 4; i++) {
            Future<String> fu = es.submit(task);
            try {
                System.out.println("I got" + fu.get(100, TimeUnit.MILLISECONDS));
            } catch (Exception e) {
            } finally {
                es.shutdown();
            }
        }
    }

    final Object key = new Object();


    void method2() {
        synchronized (key) {

        }
    }

    void method3() {
        Lock lock = new ReentrantLock();
        try {
            lock.lock();

        } finally {
            lock.unlock();
        }
    }
    boolean checkCondi() {
        return true;
    }
    class Producer {
        public void produce() throws InterruptedException {
            synchronized (key) {
                while (checkCondi()) {
                    key.wait();
                }
                System.out.println("---");
                key.notifyAll();
            }
        }
    }
    class Consumer {
        public void consume() throws InterruptedException {
            synchronized (key) {
                while (checkCondi()) {
                    key.wait();
                }
                System.out.println("+l+");
                key.notifyAll();
            }
        }
    }
    Lock lock = new ReentrantLock();
    Condition notFull = lock.newCondition();
    Condition isEmpty = lock.newCondition();

    void method4() {
        Semaphore sm = new Semaphore(5);
    }

    ReadWriteLock rw = new ReentrantReadWriteLock();
    Lock rl = rw.readLock();
    Lock wl = rw.writeLock();



    public static void main(String[] args) {
        RunExecutor re = new RunExecutor();
        re.method1();
    }
}

