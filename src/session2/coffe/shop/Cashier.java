package session2.coffe.shop;

import java.util.List;

public class Cashier {
    int employeeId;
    String name;

    public void collectPayment(float cash) {
        System.out.println("Collect Payment Form Customer");
    }

    public int takeOrder(List<Product> productList) {
        int tokenNumber = 0;//any random token number generator logic here
        System.out.println("Takes Order From Customer , add the prices of all the product taken by cutomer and generates a token number");
        System.out.println("this will also call placeOrderToPendingQueue with by creating an Order object");
        return tokenNumber;
    }

    public void placeOrderToPendingQueue(Order order) {
        System.out.println("This method will add the order to a pending order queue");
    }
}
