/*Create a deadlock and Resolve it using tryLock().*/

package session3;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TryLockDemo {


    Lock lock1 = new ReentrantLock(true);


    Lock lock2 = new ReentrantLock(true);

    public void acquireLock(Lock lock1, Lock lock2) {

        boolean acquireLock1 = lock1.tryLock();
        boolean acquireLock2 = lock2.tryLock();

        if (acquireLock1 && acquireLock2) {
            return;
        }

        if (acquireLock1) {
            lock1.unlock();
        }

        if (acquireLock2) {
            lock2.unlock();
        }

    }

    public void methodOne() {
        acquireLock(lock1, lock2);
        System.out.println("lock 1 method 1");

        System.out.println("lock 2 method 1");
        lock2.unlock();
        lock1.unlock();
    }

    public void methodTwo() {
        acquireLock(lock2, lock1);
        System.out.println("lock 1 method 2");
        System.out.println("lock 2 method 2");
        lock1.unlock();
        lock2.unlock();
    }

    public static void main(String[] args) throws InterruptedException {
        TryLockDemo tryLockDemo = new TryLockDemo();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                tryLockDemo.methodOne();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                tryLockDemo.methodTwo();
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }
}


