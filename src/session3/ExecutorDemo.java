/*Use a singleThreadExecutor to submit multiple threads.*/

package session3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadScheduledExecutor();

        executorService.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 1 is running");
            }
        });
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 2 is running");
            }
        });
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 3 is running");
            }
        });
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 4 is running");
            }
        });

        executorService.shutdown();
    }
}
