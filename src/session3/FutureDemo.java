/*Return a Future from ExecutorService by using callable and use get(), isDone(), isCancelled() with the Future object to know the status of task submitted*/

package session3;

import java.util.concurrent.*;

public class FutureDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
        Future<Integer> future = executorService.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 10;
            }
        });
        executorService.shutdown();

        if (future.isDone()) {
            System.out.println("Returned Value is : " + future.get());
        }

        if (future.isCancelled()) {
            System.out.println("Task has been cancelled");
        }
    }
}
