/*Schedule task using schedule(), scheduleAtFixedRate() and scheduleAtFixedDelay()*/
package session3;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecuterServiceScheduling {
    public static void main(String[] args) {
        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
        executorService.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread Running");
            }
        }, 6, TimeUnit.SECONDS);

        executorService.scheduleWithFixedDelay(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread With Fixed Delay Running");
            }
        }, 2, 5, TimeUnit.SECONDS);

        executorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread With Fixed rate Running");
            }
        }, 0, 2, TimeUnit.SECONDS);

    }


}
