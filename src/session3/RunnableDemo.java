package session3;

public class RunnableDemo implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable Class");
        System.out.println("Id : " + Thread.currentThread().getId());
        System.out.println("Name : " + Thread.currentThread().getName());
        System.out.println("Priority : " + Thread.currentThread().getPriority());
        System.out.println("State : " + Thread.currentThread().getState());
        System.out.println("Thread Group : " + Thread.currentThread().getThreadGroup());
        Thread.currentThread().setName("TH-1");
        System.out.println("Name : " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        new Thread(new RunnableDemo()).start();
    }
}
