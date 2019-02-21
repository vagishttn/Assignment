/*Use Synchronize method to enable synchronization between multiple threads trying to access method at same time.*/
package session3;

public class SynchronizeDemo {
    private int counter;

    synchronized public void incrementCounter() {
        counter++;
    }

    public void methodOne() {
        for (int i = 0; i < 1000; i++)
            incrementCounter();
    }

    public void methodTwo() {
        for (int i = 0; i < 1000; i++)
            incrementCounter();
    }

    public static void main(String[] args) throws InterruptedException {

        SynchronizeDemo synchronizeDemo = new SynchronizeDemo();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronizeDemo.methodOne();
            }
        });
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronizeDemo.methodTwo();
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread.start();
        thread1.start();
        thread1.join();

        System.out.println("Counter is : " + synchronizeDemo.counter);

    }
}
