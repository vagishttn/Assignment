package session3;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SignalAllAndWaitDemo {


    Lock lock = new ReentrantLock(true);
    Condition condition = lock.newCondition();

    public void methodOne() {
        try {
            lock.lock();
            System.out.println("method 1 Started");
            condition.await();
            System.out.println("method 1 Finished");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }

    public void methodThree() {
        try {
            lock.lock();
            System.out.println("method 3 Started");
            condition.await();
            System.out.println("method 3 Finished");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }

    public void methodTwo() {
        try {
            lock.lock();
            System.out.println("method 2 Started");
            System.out.println("method 2 Finished");
            condition.signal();
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        SignalAllAndWaitDemo signalAllAndWaitDemo = new SignalAllAndWaitDemo();

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                signalAllAndWaitDemo.methodOne();
            }
        });
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                signalAllAndWaitDemo.methodTwo();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                signalAllAndWaitDemo.methodThree();
            }
        });

        thread.start();
        thread1.start();
        thread2.start();

        thread.join();
        thread1.join();
        thread2.join();

    }
}


