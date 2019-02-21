/*Try shutdown() and shutdownNow() and observe the difference.
Use isShutDown() and isTerminate() with ExecutorService.*/

package session3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ShutDownDemo {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadScheduledExecutor();

        try {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Thread 1 is Running");
                }
            });
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Thread 2 is Running");
                }
            });
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(3000L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Thread 3 is Running");
                }
            });
        } finally {

//            executorService.shutdown();
            executorService.shutdownNow();
        }


        executorService.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("Starting new Task");
            }
        });
        System.out.println(executorService.isShutdown());
        System.out.println(executorService.isTerminated());
    }
}
