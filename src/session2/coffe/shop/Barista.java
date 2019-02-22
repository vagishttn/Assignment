package session2.coffe.shop;

public class Barista {

    public void prepareAndProcessOrder()
    {
        System.out.println("1 Gets next order from pending Queue");
        System.out.println("2. Iterate through list of products in order");
        System.out.println("3.Notify customer with that orderId is completed and add the order into completeQueue");

    }
    public void addOrderToCompletedQueue(Order order)
    {
        System.out.println("1. will be called by prepareAndProcessOrder");
        System.out.println("2. Add Order to completedorderQueue");
    }
    public void notifyOrderReady(Order order)
    {
        System.out.println("will be called by prepareAndProcessOrder");
        System.out.println("It will notify customer using the required mechanism");
    }
}
